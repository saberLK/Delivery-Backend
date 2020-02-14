package org.sid.entities;
import java.util.List;

import javax.persistence.*;

import org.sid.entities.Version;


@Entity
@Table(name="environement")
public class Environement {
@Id @GeneratedValue 
private Long id_environement;
@Column
private String nomEnv;
@OneToOne
private Web web;

@OneToOne
private Base base;
@OneToOne
private ApplicationConsole appcs;
@OneToOne
private ApplicationUnix appux;
@OneToOne
private Unix unix;
@Column
private String type_environement;

@ManyToMany
private List<Delivery> delivery;

public List<Delivery> getDelivery() {
	return delivery;
}
public void setDelivery(List<Delivery> delivery) {
	this.delivery = delivery;
}
public String getType_environement() {
	return type_environement;
}
public void setType_environement(String type_environement) {
	this.type_environement = type_environement;
}
public Environement() {
	super();
	// TODO Auto-generated constructor stub
}
public Environement(String nomEnv,String type_environement,Web w,Base b,ApplicationConsole appcs,
		ApplicationUnix appux,Unix u) {
	super();
	this.nomEnv = nomEnv;

	this.type_environement = type_environement;
this.web = w;
this.base = b;
this.appcs  = appcs;
this.appux = appux;
this.unix = u;
}




public String getNomEnv() {
	return nomEnv;
}
public void setNomEnv(String nomEnv) {
	this.nomEnv = nomEnv;
}
public Long getId_environement() {
	return id_environement;
}
public void setId_environement(Long id_environement) {
	this.id_environement = id_environement;
}
public Web getWeb() {
	return web;
}
public void setWeb(Web web) {
	this.web = web;
}
public Base getBase() {
	return base;
}
public void setBase(Base base) {
	this.base = base;
}
public ApplicationConsole getAppcs() {
	return appcs;
}
public void setAppcs(ApplicationConsole appcs) {
	this.appcs = appcs;
}
public ApplicationUnix getAppux() {
	return appux;
}
public void setAppux(ApplicationUnix appux) {
	this.appux = appux;
}
public Unix getUnix() {
	return unix;
}
public void setUnix(Unix unix) {
	this.unix = unix;
}







}
