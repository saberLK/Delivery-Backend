package org.sid.entities;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.sid.entities.Version;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="delivery")
public class Delivery {
@Id @GeneratedValue
private Long id_delivery;
@Column
private String name;
@Column
private String state;


@Temporal(TemporalType.DATE)
private Date date_creation;
@Temporal(TemporalType.DATE)
private Date date_livraison;
@Column
private String owner;
@Column 
private String author;
@OneToMany
private List<Milestone> milestones;
@ManyToMany
private List<Environement> environements;

@OneToOne
private DBFile files;




public Delivery() {
	super();
	// TODO Auto-generated constructor stub
}
 








public String getAuthor() {
	return author;
}









public void setAuthor(String author) {
	this.author = author;
}









public void setDate_creation(Date date_creation) {
	this.date_creation = date_creation;
}









public Delivery(String name, String state, Date date_creation, Date date_livraison, String owner,
		List<Milestone> milestones, List<Environement> environements,DBFile files) {
	super();
	this.name = name;
	this.state = state;
	this.date_creation = date_creation;
	this.date_livraison = date_livraison;
	this.owner = owner;
	this.milestones = milestones;
	this.environements = environements;
this.files = files;
}




public Long getId_delivery() {
	return id_delivery;
}
public void setId_delivery(Long id_delivery) {
	this.id_delivery = id_delivery;
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}


public List<Environement> getEnvironements() {
	return environements;
}
public void setEnvironements(List<Environement> target_environement) {
	this.environements = target_environement;
}

public String getOwner() {
	return owner;
}
public void setOwner(String owner) {
	this.owner = owner;
}
public Delivery(String name, String state, Date date_creation, Date date_livraison, String owner) {
	super();
	this.name = name;
	this.state = state;
	this.date_creation = date_creation;
	this.date_livraison = date_livraison;
	this.owner = owner;
}
public Date getDate_livraison() {
	return date_livraison;
}
public void setDate_livraison(Date date_livraison) {
	this.date_livraison = date_livraison;
}
public List<Milestone> getMilestones() {
	return milestones;
}
public void setMilestones(List<Milestone> milestones) {
	this.milestones = milestones;
}









public Date getDate_creation() {
	return date_creation;
}









public DBFile getFiles() {
	return files;
}









public void setFiles(DBFile files) {
	this.files = files;
}




}
