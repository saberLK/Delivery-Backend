package org.sid.entities;
import javax.persistence.*;

@Entity
@Table(name="unix")
public class Unix {
@Id @GeneratedValue
private Long id_unix;
@Column
private String url;
@Column(unique=true,nullable=false)
private String username;
@Column
private String password;
@Column
private String adresse_ip;
@Column
private String nomEnv;

public Unix() {
	super();
	// TODO Auto-generated constructor stub
}

public Long getId_unix() {
	return id_unix;
}

public void setId_unix(Long id_unix) {
	this.id_unix = id_unix;
}

public Unix(String nomEnv,String url, String username, String password, String adresse_ip) {
	super();
	this.url = url;
	this.username = username;
	this.password = password;
	this.adresse_ip = adresse_ip;
	this.nomEnv = nomEnv;


}
public Long getId() {
	return id_unix;
}
public void setId(Long id) {
	this.id_unix = id;
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
public String getNomEnv() {
	return nomEnv;
}
public void setNomEnv(String nomEnv) {
	this.nomEnv = nomEnv;
}






}
