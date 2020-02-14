package org.sid.services;

import java.util.List;

import org.sid.entities.Environement;
import org.sid.entities.Projects;
import org.sid.entities.Version;



public interface ProjectService {
	public Projects addProject(Projects Project);
	public Projects updateProject(Long id, Projects Project);
	public boolean deleteProject(Long id);
	public List<Projects> getAllProjects();
	public List<Projects> getProjectsNull();
	public List<Projects> getProjectsbyVersion(Long id);
	public List<String> getAllnameprojects();
}
