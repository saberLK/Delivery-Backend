package org.sid.services;

import java.util.List;

import org.sid.entities.ApplicationConsole;
import org.sid.entities.ApplicationUnix;
import org.sid.entities.Base;
import org.sid.entities.Environement;
import org.sid.entities.Projects;
import org.sid.entities.Unix;
import org.sid.entities.Web;



public interface EnvironementService {
public Environement addEnvironement(Environement environement);
public boolean deleteEnvironement(Long id);
public Environement updateEnvironement(Long id,Environement environement);
public Environement getEnvById(Long id);
public List<Environement> getEnvByProject(Long id);
public List<Environement> getEnvnocnx();
	public List<Environement> getAllEnvironements();
	public List<Environement> getenvnull();
public Environement addWebtoEnv(Web web,Long id);
public Environement addUnixtoEnv(Unix unix,Long id);
public Environement addAppcstoEnv(ApplicationConsole appcs,Long id);
public Environement addAppuxtoEnv(ApplicationUnix appux,Long id);
public Environement addBasetoEnv(Base base,Long id);


}
