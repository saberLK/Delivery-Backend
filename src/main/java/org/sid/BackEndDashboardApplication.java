package org.sid;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;


import org.sid.entities.Activity;
import org.sid.entities.ApplicationConsole;
import org.sid.entities.ApplicationUnix;
import org.sid.entities.Base;
import org.sid.entities.Delivery;
import org.sid.entities.Environement;
import org.sid.entities.Milestone;
import org.sid.entities.Role;
import org.sid.entities.Unix;
import org.sid.entities.User;
import org.sid.entities.Version;
import org.sid.entities.Web;
import org.sid.services.ActivityService;
import org.sid.services.AppConsoleService;
import org.sid.services.AppUnixService;
import org.sid.services.BaseService;
import org.sid.services.DBFileStorageService;
import org.sid.services.DeliveryService;
import org.sid.services.EnvironementService;
import org.sid.services.MilestoneService;
import org.sid.services.RoleService;
import org.sid.services.UnixService;
import org.sid.services.UserService;
import org.sid.services.VersionService;
import org.sid.services.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackEndDashboardApplication implements CommandLineRunner{
@Autowired
private UserService userService;
@Autowired
private DeliveryService deliveryService;
@Autowired
private EnvironementService environementService;
@Autowired
private VersionService versionService;
@Autowired
private WebService webService;
@Autowired
private AppUnixService appUnixService;
@Autowired
private BaseService baseService;
@Autowired 
private AppConsoleService appConsoleService;
@Autowired
private UnixService unixService;
@Autowired
private MilestoneService milestoneService;
@Autowired
private ActivityService activityService;
@Autowired
private RoleService roleService;
	public static void main(String[] args) {

		SpringApplication.run(BackEndDashboardApplication.class, args);
		
	}

	@Override
	public void run(String... arg0) throws Exception {
/*Role r1 = new Role("ADMIN");
Role r2 = new Role("USER");
roleService.saveRole(r1);
roleService.saveRole(r2);
User u1 = new User("Khalid","123456",r1);
User u2 = new User("Saber","123456",r2);
User u3 = new User("John","123456",r1);
User u4 = new User("Mick","123456",r2);
	userService.save(u1);	
	userService.save(u2);	
	userService.save(u3);	
	userService.save(u4);*/
	
	
	
//Web w1 = new Web("env11111","192.168.1.1","saberyo","1234","www.google.com");
//Base b1=new Base("env11111","192.168.1.1","saberyo","1234","www.google.com");
//ApplicationConsole appcs1= new ApplicationConsole("env11111","192.168.1.1","saberyo","1234","www.google.com");
//ApplicationUnix appux1 = new ApplicationUnix("env11111","192.168.1.1","saberyo","1234","www.google.com");
//Unix ux1 = new Unix("env11111","192.168.1.1","saberyo","1234","www.google.com");
//
///Environement e1e = new Environement("env11111","integration",w1,b1,ux1,appcs1,appux1);
		

	}
}
