package org.sid.controller;

import java.util.List;

import org.sid.entities.Role;
import org.sid.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	
@CrossOrigin
@GetMapping(value="/roles")
public List<Role> getRoles(){
	return roleService.getall();
}
}
