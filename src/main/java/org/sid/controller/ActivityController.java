package org.sid.controller;

import java.util.List;

import org.sid.entities.Activity;
import org.sid.entities.Delivery;
import org.sid.entities.Milestone;
import org.sid.services.ActivityService;
import org.sid.services.DeliveryService;
import org.sid.services.MilestoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivityController {
@Autowired
private ActivityService activityService;

@CrossOrigin
@GetMapping(value="/activities")
public List<Activity> getAllActivities(){
	return activityService.getAllActivities();
}

@CrossOrigin
@GetMapping(value="/activitiesNull")
public List<Activity> getActivitiesNull(){
	return activityService.getActivitiesNull();
}
@CrossOrigin
@PostMapping(value="/activity")
public Activity addActivity(@RequestBody Activity activity) {
	return activityService.addActivity(activity);
}

@CrossOrigin
@DeleteMapping(value="/activity/{id:.+}")
public boolean deleteActivity(@PathVariable Long id) {
	activityService.deleteActivity(id);
	return true;
}

@CrossOrigin
@PutMapping(value="/activity/{id:.+}")
public Activity updateActivity(@RequestBody Activity activity,@PathVariable Long id) {
	
return activityService.updateActivity(id,activity);
}
}
