package org.sid.services;

import java.util.List;

import org.sid.entities.Activity;

public interface ActivityService {
	public Activity addActivity(Activity activity);
	public boolean deleteActivity(Long id);
	public Activity updateActivity(Long id,Activity activity);
public Activity findActivityById(Long id);
public List<Activity> getAllActivities();
public List<Activity> getActivitiesNull();
	}
