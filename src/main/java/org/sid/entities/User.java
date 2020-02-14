package org.sid.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import javax.persistence.*;

import org.springframework.context.annotation.Scope;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name="User")
@Scope("session")
public  class User {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * Description of the property id.
	 */
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id ;
	/**
	 * Description of the property email.
	 */
	@Column(unique = true)
	private String username ;
	/**
	 * Description of the property password.
	 */
	@OneToOne
	 private Role roles;
	private String password ;
	/**
	 * Description of the property role , to grant authority to the user .
	 */
  
    /**
	 * Description of the property full name.
	 */


    public User(){
    	
    }
    
    public Role getRoles() {
		return roles;
	}

	public void setRoles(Role roles) {
		this.roles = roles;
	}

	public User(String username,String password,Role roles){
    	this.username=username;
    	this.password= password;
    	this.roles = roles;
    	
    }
	

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", role="  +
				 ",]";
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}


	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}
	



	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
