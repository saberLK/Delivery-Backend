package org.sid.entities;



import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="version")
public class Version {
@Id @GeneratedValue
private Long id_version;

@Column(nullable=false)
private String nomVersion;
@OneToMany
private List<Projects> projects;
public Version() {
	super();
	// TODO Auto-generated constructor stub
}
public Version(String nomVersion) {
	super();
	this.nomVersion = nomVersion;


}


public Version(String nomVersion, List<Projects> projects) {
	super();
	this.nomVersion = nomVersion;
	this.projects = projects;
}


public List<Projects> getProjects() {
	return projects;
}
public void setProjects(List<Projects> projects) {
	this.projects = projects;
}
public Long getId() {
	return id_version;
}
public void setId(Long id) {
	this.id_version = id;
}
public String getNomVersion() {
	return nomVersion;
}
public void setNomVersion(String nomVersion) {
	this.nomVersion = nomVersion;
}
public Long getId_version() {
	return id_version;
}
public void setId_version(Long id_version) {
	this.id_version = id_version;
}






}
