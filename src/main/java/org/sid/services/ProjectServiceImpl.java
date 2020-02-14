package org.sid.services;

import java.util.ArrayList;
import java.util.List;

import org.sid.entities.Milestone;
import org.sid.entities.Projects;
import org.sid.entities.Version;
import org.sid.repository.ProjectRepository;
import org.sid.repository.VersionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService{
@Autowired
private ProjectRepository projectRepository;
@Autowired
private VersionRepository versionRepository;
@Override
public Projects addProject(Projects Project) {
	return projectRepository.save(Project);
}

@Override
public Projects updateProject(Long id, Projects Project) {
	Projects p2 = projectRepository.findOne(id);
p2.setProject_name(Project.getProject_name());
p2.setDeliveries(Project.getDeliveries());
p2.setEnvironements(Project.getEnvironements());



		return projectRepository.save(p2);
}

@Override
public boolean deleteProject(Long id) {
	projectRepository.delete(id);
	return true;
}

@Override
public List<Projects> getAllProjects() {
return projectRepository.findAll();
}

@Override
public List<Projects> getProjectsNull() {
	return projectRepository.getProjectsNull();
}

@Override
public List<Projects> getProjectsbyVersion(Long id) {
	List<Projects> ll1 = new ArrayList<Projects>();
	List<Version> ll2 = versionRepository.findAll();
	for (Version version2 : ll2) {
		if(version2.getId_version()==id) {
			ll1.addAll(version2.getProjects());
		}
	}
	return ll1;
}

@Override
public List<String> getAllnameprojects() {
	List<String> ll2 = new ArrayList<String>();
List<Projects> ll = projectRepository.findAll();
for (Projects projects : ll) {
	ll2.add(projects.getProject_name());
}
return ll2;
}
}
