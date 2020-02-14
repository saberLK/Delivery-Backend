package org.sid.controller;

import java.util.List;

import org.sid.entities.Activity;
import org.sid.entities.Milestone;
import org.sid.services.MilestoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MilestoneController {

	
	@Autowired
	private MilestoneService milestoneService;
	
	@CrossOrigin
	@GetMapping(value="/milestones")
	public List<Milestone> getAllMilestones(){
		return milestoneService.getAll();
	}
	@CrossOrigin
	@GetMapping(value="/milestonesNull")
	public List<Milestone> getActivitiesNull(){
		return milestoneService.getMilestonesNull();
	}
	@CrossOrigin
	@PostMapping(value="/milestone")
	public Milestone addMilestones(@RequestBody Milestone milestone){
	return milestoneService.addMilestone(milestone);
	}
	
	@CrossOrigin
	@DeleteMapping(value="/milestone/{id:.+}")
	public boolean deleteMilestones(@PathVariable Long id){
		 milestoneService.deleteMilestone(id);
		 return true;
	}
	@CrossOrigin
	@PutMapping(value="/milestone/{id:.+}")
	public Milestone updateMilestone(@RequestBody Milestone milestone,@PathVariable Long id) {
		
	return milestoneService.updateMilestone(id,milestone);
	}
}
