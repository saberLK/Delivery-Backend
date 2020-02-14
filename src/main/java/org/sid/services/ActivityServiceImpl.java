package org.sid.services;

import java.util.ArrayList;
import java.util.List;

import org.sid.entities.Activity;
import org.sid.entities.Milestone;
import org.sid.repository.ActivityRepository;
import org.sid.repository.MilestoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ActivityServiceImpl implements ActivityService {

	@Autowired
	private ActivityRepository activityRepository ;
	@Autowired
	private MilestoneRepository milestoneRepository ;
	@Override
	public List<Activity> getAllActivities() {
	return activityRepository.findAll();
	}
	@Override
	public Activity addActivity(Activity activity) {
		return activityRepository.save(activity);
	}
	@Override
	public boolean deleteActivity(Long id) {
		activityRepository.delete(id);
		return true;
	}
	@Override
	public List<Activity> getActivitiesNull() {
return activityRepository.getActivitiesNull();
		}
	@Override
	public Activity findActivityById(Long id) {
		return activityRepository.findOne(id);
	}
	@Override
	public Activity updateActivity(Long id, Activity activity) {
Activity a2 = activityRepository.findOne(id);
a2.setAuthor(activity.getAuthor());
a2.setDate_creation(activity.getDate_creation());
a2.setHeadline(activity.getHeadline());
a2.setName_activity(activity.getName_activity());
a2.setOwner(activity.getOwner());
a2.setPriority(activity.getPriority());
a2.setState(activity.getState());
return activityRepository.save(a2);

	}





}
