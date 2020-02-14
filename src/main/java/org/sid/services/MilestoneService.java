package org.sid.services;

import java.util.List;

import org.sid.entities.Activity;
import org.sid.entities.Milestone;

public interface MilestoneService {
	public Milestone addMilestone(Milestone milestone);
	public boolean deleteMilestone(Long id);
	public Milestone updateMilestone(Long id,Milestone milestone);
public List<Milestone> getAll();
public List<Milestone> getMilestonesNull();
}
