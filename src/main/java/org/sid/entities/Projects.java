package org.sid.entities;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;


@Entity
@Table(name="projects")
public class Projects {
@Id @GeneratedValue
private Long id_project;
@Column
private String project_name;
@Temporal(TemporalType.DATE)
private Date date_creation;
@Column
private String description;
@OneToMany
private List<Environement> environements;

@OneToMany
private List<Delivery> deliveries;

@JsonIgnoreProperties
private int nbr_deliveries;
public Projects() {
	super();
	// TODO Auto-generated constructor stub
}


public int getNbr_deliveries() {
	return this.getDeliveries().size();
}





public Projects(String project_name) {
	super();
	this.project_name = project_name;
}


public Projects(String project_name,String description,List<Environement> environements, List<Delivery> deliveries) {
	super();
	this.project_name = project_name;
	this.environements = environements;
	this.deliveries = deliveries;
	this.description = description;

}
public Long getId_project() {
	return id_project;
}
public void setId_project(Long id_project) {
	this.id_project = id_project;
}



public Date getDate_creation() {
	return date_creation;
}


public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}


public void setDate_creation(Date date_creation) {
	this.date_creation = date_creation;
}


public String getProject_name() {
	return project_name;
}
public void setProject_name(String project_name) {
	this.project_name = project_name;
}
public List<Environement> getEnvironements() {
	return environements;
}
public void setEnvironements(List<Environement> environements) {
	this.environements = environements;
}
public List<Delivery> getDeliveries() {
	return deliveries;
}
public void setDeliveries(List<Delivery> deliveries) {
	this.deliveries = deliveries;
}



}
