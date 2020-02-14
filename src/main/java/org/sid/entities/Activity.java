package org.sid.entities;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="activity")
public class Activity {
@Id @GeneratedValue
private Long id_activity;
@Column(nullable=false)
private String name_activity;
@Column(nullable=false)
private String owner;
@Column(nullable=false)
private String headline;
@Column(nullable=false)
private String state;
@Column(nullable=false)
private String priority;


@Temporal(TemporalType.DATE)
private Date date_creation;
@Column(nullable=false)
private String author;

public Activity( String owner, String headline, String state, String priority, Date date_creation, String author,String name_activity) {
	super();

	this.owner = owner;
	this.headline = headline;
	this.state = state;
	this.priority = priority;
this.name_activity =  name_activity;
	this.date_creation = date_creation;
	this.author = author;

}
public Activity() {
	super();
	// TODO Auto-generated constructor stub
}

public Long getId_activity() {
	return id_activity;
}
public void setId_activity(Long id_activity) {
	this.id_activity = id_activity;
}
public String getOwner() {
	return owner;
}
public void setOwner(String owner) {
	this.owner = owner;
}
public String getHeadline() {
	return headline;
}
public void setHeadline(String headline) {
	this.headline = headline;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getPriority() {
	return priority;
}
public void setPriority(String priority) {
	this.priority = priority;
}

public Date getDate_creation() {
	return date_creation;
}
public void setDate_creation(Date date_creation) {
	this.date_creation = date_creation;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getName_activity() {
	return name_activity;
}
public void setName_activity(String name_activity) {
	this.name_activity = name_activity;
}



}
