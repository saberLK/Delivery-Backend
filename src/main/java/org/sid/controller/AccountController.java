package org.sid.controller;

import java.security.Principal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import org.sid.services.UserService;
import org.sid.util.CustomErrorType;
import org.sid.entities.User;

@RestController
@RequestMapping("/account")

public class AccountController {

	public static final Logger logger = LoggerFactory.getLogger(AccountController.class);

	@Autowired
	private UserService userService;

	// request method to create a new account by a guest
	@CrossOrigin
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<?> createUser(@RequestBody User newUser) {
		if (userService.find(newUser.getUsername()) != null) {
			logger.error("username Already exist " + newUser.getUsername());
			return new ResponseEntity<>(
					new CustomErrorType("user with username " + newUser.getUsername() + "already exist "),
					HttpStatus.CONFLICT);
		}
	
		
		return new ResponseEntity<User>(userService.save(newUser), HttpStatus.CREATED);
	}

	// this is the login api/service
	@CrossOrigin

	@RequestMapping("/login")
	public Principal user(Principal principal) {
		logger.info("user logged "+principal);
		return principal;
	}
	@CrossOrigin
	@RequestMapping(value="/users",method=RequestMethod.GET)
	public List<User> getUsers(){
		return userService.getAllusers();
	}
	@CrossOrigin
	@RequestMapping(value="/users/{id}",method=RequestMethod.DELETE)
	public boolean delete(@PathVariable Long id){
	userService.delete(id);
	return true;
	}

	
	@CrossOrigin
	@PostMapping(value="/users")
	public User saveUser(@RequestBody User user) {
		return userService.save(user);
	}
	@CrossOrigin
	@PutMapping(value="/users")
	public User updateUser(@RequestBody User user) {
		return userService.save(user);
	}
}
