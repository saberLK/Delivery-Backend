package org.sid.controller;

import java.util.List;

import org.sid.entities.Milestone;
import org.sid.entities.Projects;
import org.sid.entities.Version;
import org.sid.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;

	
	
	@CrossOrigin
	@GetMapping(value="/projects")
	public List<Projects> getAllProjects(){
		return projectService.getAllProjects();
	}
	@CrossOrigin
	@GetMapping(value="/projectsname")
	public List<String> getnameprojects(){
		return projectService.getAllnameprojects();
	}
	@CrossOrigin
	@GetMapping(value="/projectsByVersion/{id:.+}")
	public List<Projects> getAllProjectsbyversion(@PathVariable Long id){
		return projectService.getProjectsbyVersion(id);
	}
	@CrossOrigin
	@GetMapping(value="/projectsNull")
	public List<Projects> getProjectsNull(){
		return projectService.getProjectsNull();
	}
	@CrossOrigin
	@PostMapping(value="/project")
	public Projects addProjects(@RequestBody Projects project){
	return projectService.addProject(project);
	}

	@CrossOrigin
	@DeleteMapping(value="/project/{id:.+}")
	public boolean deleteProjects(@PathVariable Long id){
		projectService.deleteProject(id);
		 return true;
	}
	@CrossOrigin
	@PutMapping(value="/project/{id:.+}")
	public Projects updateProjects(@RequestBody Projects project,@PathVariable Long id) {
		
	return projectService.updateProject(id,project);
	}
}
