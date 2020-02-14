package org.sid.entities;

import javax.persistence.*;

@Entity
@Table(name="applicationConsole")
public class ApplicationConsole {
@Id @GeneratedValue
private Long id_appconsole;
@Column
private String nomEnv;
@Column
private String Url;
@Column
private String Username;
@Column
private String password;
@Column
private String ip_adress;

public ApplicationConsole() {
	super();
	// TODO Auto-generated constructor stub
}


public ApplicationConsole(String nomEnv,String url, String username, String password, String ip_adress
		) {
	super();
	Url = url;
	this.Username = username;
	this.password = password;
	this.ip_adress = ip_adress;
this.nomEnv  = nomEnv;


}
public Long getId_appconsole() {
	return id_appconsole;
}
public void setId_appconsole(Long id_appconsole) {
	this.id_appconsole = id_appconsole;
}
public String getUrl() {
	return Url;
}
public void setUrl(String url) {
	this.Url = url;
}
public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	this.Username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getIp_adress() {
	return ip_adress;
}
public void setIp_adress(String ip_adress) {
	this.ip_adress = ip_adress;
}
public String getNomEnv() {
	return nomEnv;
}
public void setNomEnv(String nomEnv) {
	this.nomEnv = nomEnv;
}









}
