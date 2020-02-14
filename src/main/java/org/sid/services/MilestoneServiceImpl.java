package org.sid.services;

import java.util.ArrayList;
import java.util.List;

import org.sid.entities.Activity;
import org.sid.entities.Milestone;
import org.sid.repository.MilestoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MilestoneServiceImpl implements MilestoneService{

	@Autowired
	private MilestoneRepository milestoneRepository;
	
	@Override
	public Milestone addMilestone(Milestone milestone) {
return milestoneRepository.save(milestone);
	}

	@Override
	public boolean deleteMilestone(Long id) {
		milestoneRepository.delete(id);
	return true;
	}

	@Override
	public List<Milestone> getAll() {
		return milestoneRepository.findAll();
	}

	@Override
	public List<Milestone> getMilestonesNull() {
	return milestoneRepository.getMilestonesNull();
	}

	@Override
	public Milestone updateMilestone(Long id, Milestone milestone) {
		Milestone m2 = milestoneRepository.findOne(id);
m2.setActivities(milestone.getActivities());
m2.setName_milestone(milestone.getName_milestone());
m2.setOwner(milestone.getOwner());
m2.setStats(milestone.getStats());
m2.setRecord_type(milestone.getRecord_type());
		return milestoneRepository.save(m2);
	}



}
