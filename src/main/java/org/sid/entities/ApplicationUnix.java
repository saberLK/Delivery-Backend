package org.sid.entities;

import javax.persistence.*;

@Entity
@Table(name="applicationUnix")
public class ApplicationUnix {
	@Id @GeneratedValue
	private Long id_appunix;
	@Column
	private String url;
	@Column
	private String username;
	@Column
	private String password;
	@Column
	private String adresse_ip;
@Column
private String nomEnv;

	public String getNomEnv() {
	return nomEnv;
}
public void setNomEnv(String nomEnv) {
	this.nomEnv = nomEnv;
}
	public Long getId_appunix() {
		return id_appunix;
	}
	public void setId_appunix(Long id_appunix) {
		this.id_appunix = id_appunix;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
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
	public String getAdresse_ip() {
		return adresse_ip;
	}
	public void setAdresse_ip(String adresse_ip) {
		this.adresse_ip = adresse_ip;
	}

	public ApplicationUnix(String nomEnv,String url, String username, String password, String adresse_ip) {
		super();
		this.url = url;
		this.username = username;
		this.password = password;
		this.adresse_ip = adresse_ip;
this.nomEnv = nomEnv;


	}
	public ApplicationUnix() {
		super();
		// TODO Auto-generated constructor stub
	}


	
}
