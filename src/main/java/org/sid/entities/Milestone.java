package org.sid.entities;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="milestone")
public class Milestone {
@Id @GeneratedValue
private Long id_milestone;
@Column(nullable=false)
private String owner;
@Column(nullable=false)
private String record_type;
@Column 
private String stats;
@Column
private String name_milestone;
@OneToMany
private List<Activity> activities;
public Milestone() {
	super();
	// TODO Auto-generated constructor stub
}
public Milestone( String owner, String record_type, String stats,String name_milestone,List<Activity> activities) {
	super();

	this.owner = owner;
	this.record_type = record_type;
	this.stats = stats;
this.activities = activities;
this.name_milestone = name_milestone;
}
public Long getId_milestone() {
	return id_milestone;
}
public void setId_milestone(Long id_milestone) {
	this.id_milestone = id_milestone;
}
public String getOwner() {
	return owner;
}
public void setOwner(String owner) {
	this.owner = owner;
}
public String getRecord_type() {
	return record_type;
}
public void setRecord_type(String record_type) {
	this.record_type = record_type;
}
public String getStats() {
	return stats;
}
public void setStats(String stats) {
	this.stats = stats;
}
public List<Activity> getActivities() {
	return activities;
}
public void setActivities(List<Activity> activities) {
	this.activities = activities;
}
public String getName_milestone() {
	return name_milestone;
}
public void setName_milestone(String name_milestone) {
	this.name_milestone = name_milestone;
}

}
