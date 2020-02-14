package org.sid.entities;
import javax.persistence.*;

@Entity
@Table(name="base")
public class Base {
 @Id @GeneratedValue
 private Long id_base;
 @Column(nullable=false,unique=true)
 private String Username;
 @Column(nullable=false,unique=true)
 private String adresse_ip;

 public String getAdresse_ip() {
	return adresse_ip;
}
public void setAdresse_ip(String adresse_ip) {
	this.adresse_ip = adresse_ip;
}
@Column(nullable=false)
private String url;
@Column(nullable=false)
 private String Password;
@Column
private String nomEnv;

public Base() {
	super();
	// TODO Auto-generated constructor stub
}


public Base(String nomEnv,String url,String username, String password,String adresse_ip ) {
	super();
	this.url = url;
this.Username = username;
this.Password = password;
	this.adresse_ip = adresse_ip;

this.nomEnv =  nomEnv;

}



public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public Long getId_base() {
	return id_base;
}
public void setId_base(Long id_base) {
	this.id_base = id_base;
}
public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	Username = username;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getNomEnv() {
	return nomEnv;
}
public void setNomEnv(String nomEnv) {
	this.nomEnv = nomEnv;
}

 
 
}
