package org.sid.controller;

import java.util.List;

import org.sid.entities.Activity;
import org.sid.entities.ApplicationConsole;
import org.sid.entities.ApplicationUnix;
import org.sid.entities.Base;
import org.sid.entities.Delivery;
import org.sid.entities.Environement;
import org.sid.entities.Milestone;
import org.sid.entities.Projects;
import org.sid.entities.Unix;
import org.sid.entities.Web;
import org.sid.services.EnvironementService;
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
public class EnvironementController {

	@Autowired
	private EnvironementService environementService;
	
	
	
	@CrossOrigin
	@GetMapping(value="/environements")
	public List<Environement> getAllEnvironements(){
		return environementService.getAllEnvironements();
	}
	@CrossOrigin
	@GetMapping(value="/environementsNull")
	public List<Environement> getEnvNull(){
		return environementService.getenvnull();
	}
	@CrossOrigin
	@GetMapping(value="/environementscnx")
	public List<Environement> getEnvironementnocnx(){
		return environementService.getEnvnocnx();
	}
	@CrossOrigin
	@GetMapping(value="/environement/{id:.+}")
	public Environement getEnvironementbyid(@PathVariable Long id) {
		return environementService.getEnvById(id);
	}
	@CrossOrigin
	@GetMapping(value="/environementsByProject/{id:.+}")
	public List<Environement> getAllEnvironementsbyProject(@PathVariable Long id){
		return environementService.getEnvByProject(id);
	}

	@CrossOrigin
	@PostMapping(value="/environement")
	public Environement addEnvironement(@RequestBody Environement environement){
	return environementService.addEnvironement(environement);
	}
	
	@CrossOrigin
	@DeleteMapping(value="/environement/{id:.+}")
	public boolean deleteEnvironement(@PathVariable Long id){
		environementService.deleteEnvironement(id);
		 return true;
	}
	
	@CrossOrigin
	@PutMapping(value="/environement/{id:.+}")
	public Environement updateEnvironement(@RequestBody Environement environement,@PathVariable Long id) {
		
	return environementService.updateEnvironement(id,environement);
	}

}
