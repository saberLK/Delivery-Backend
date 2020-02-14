package org.sid.entities;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name="web")
public class Web implements Serializable{
@Id @GeneratedValue
private Long id_web;
@Column(nullable=false,unique=true)
private String adresse_ip;
@Column(nullable=false,unique=true)
private String username;
@Column
private String nomEnv;
@Column(nullable=false)
private String password;
@Column(nullable=false)
private String url;

public Web() {
	super();
	// TODO Auto-generated constructor stub
}
public Web(String nomEnv,String adresse_ip, String username, String password, String url) {
	super();
	this.adresse_ip = adresse_ip;
	this.username = username;
	this.password = password;
	this.url = url;
this.nomEnv = nomEnv;

	
	
}




public Long getId_web() {
	return id_web;
}
public void setId_web(Long id_web) {
	this.id_web = id_web;
}
public Long getId() {
	return id_web;
}
public void setId(Long id) {
	this.id_web = id;
}
public String getAdresse_ip() {
	return adresse_ip;
}
public void setAdresse_ip(String adresse_ip) {
	this.adresse_ip = adresse_ip;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getNomEnv() {
	return nomEnv;
}
public void setNomEnv(String nomEnv) {
	this.nomEnv = nomEnv;
}



	
}
