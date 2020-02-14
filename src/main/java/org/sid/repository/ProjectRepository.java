package org.sid.repository;

import java.util.List;


import org.sid.entities.Projects;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Projects, Long>{
	@Query(value="SELECT p.* FROM projects p where p.id_project NOT IN (select vp.projects_id_project from version_projects vp)",nativeQuery=true)
	public List<Projects> getProjectsNull();

}
