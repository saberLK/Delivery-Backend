package org.sid.controller;

import java.util.List;

import org.sid.entities.ApplicationConsole;
import org.sid.entities.ApplicationUnix;
import org.sid.entities.Base;
import org.sid.entities.Environement;
import org.sid.entities.Projects;
import org.sid.entities.User;
import org.sid.entities.Version;
import org.sid.entities.Web;
import org.sid.services.AppConsoleService;
import org.sid.services.AppUnixService;
import org.sid.services.BaseService;
import org.sid.services.EnvironementService;
import org.sid.services.ProjectService;
import org.sid.services.VersionService;
import org.sid.services.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class VersionController {
	
	@Autowired
	private VersionService versionService;

	
	
	@CrossOrigin
	@GetMapping(value="/versions")
	public List<Version> getAllVersions(){
		return versionService.getAllVersions();
	}

	@CrossOrigin
	@PostMapping(value="/version")
	public Version addVersion(@RequestBody Version version){
	return versionService.addVersion(version);
	}
	
	@CrossOrigin
	@DeleteMapping(value="/version/{id:.+}")
	public boolean deleteVersion(@PathVariable Long id){
		versionService.deleteVersion(id);
		 return true;
	}
	@CrossOrigin
	@PutMapping(value="/version/{id:.+}")
	public Version updateVersion(@RequestBody Version version,@PathVariable Long id) {
		
	return versionService.updateVersion(id,version);
	}
	

}
