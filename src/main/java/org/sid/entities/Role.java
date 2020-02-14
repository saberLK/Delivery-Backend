package org.sid.entities;
import javax.persistence.*;

@Entity
@Table(name="role")
public class Role {
@GeneratedValue @Id
private Long id;
private String name;
public Role() {
	super();
	// TODO Auto-generated constructor stub
}
public Role(String name) {
	super();
	this.name = name;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
