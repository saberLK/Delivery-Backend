package org.sid.services;

import java.util.ArrayList;
import java.util.List;

import org.sid.entities.ApplicationConsole;
import org.sid.entities.ApplicationUnix;
import org.sid.entities.Base;
import org.sid.entities.Environement;
import org.sid.entities.Milestone;
import org.sid.entities.Projects;
import org.sid.entities.Unix;
import org.sid.entities.Version;
import org.sid.entities.Web;
import org.sid.repository.AppConsoleRepository;
import org.sid.repository.AppUnixRepository;
import org.sid.repository.BaseRepository;
import org.sid.repository.EnvironementRepository;
import org.sid.repository.ProjectRepository;
import org.sid.repository.UnixRepository;
import org.sid.repository.WebRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@org.springframework.transaction.annotation.Transactional
public class EnvironementServiceImpl implements EnvironementService{

	
	@Autowired
	private EnvironementRepository environementRepository;
	@Autowired
	private ProjectRepository projectRepository;
	@Autowired
	private WebRepository  webRepository;
	@Autowired
	private BaseRepository baseRepository;
	@Autowired
	private UnixRepository  unixRepository;
	@Autowired
	private AppConsoleRepository appcsRepository;
	@Autowired
	private AppUnixRepository  appuxRepository;
	
	@Override
	public List<Environement> getAllEnvironements() {
	return environementRepository.findAll();
	}
	@Override
	public Environement addEnvironement(Environement environement) {
	return environementRepository.save(environement);
	}
	@Override
	public boolean deleteEnvironement(Long id) {
		 environementRepository.delete(id);
		 return true;
	}
	@Override
	public Environement updateEnvironement(Long id, Environement environement) {
	Environement e1 = environementRepository.findOne(id);
	e1.setNomEnv(environement.getNomEnv());
	e1.setType_environement(environement.getType_environement());
	e1.setAppcs(environement.getAppcs());
	e1.setAppux(environement.getAppux());
	e1.setUnix(environement.getUnix());
	e1.setWeb(environement.getWeb());
	e1.setBase(environement.getBase());
	return environementRepository.save(environement);
	}
	@Override
	public Environement getEnvById(Long id) {
	return environementRepository.findOne(id);
	}
	@Override
	public List<Environement> getEnvByProject(Long id) {
Projects p1 = projectRepository.findOne(id);
return p1.getEnvironements();
	}
	@Override
	public List<Environement> getEnvnocnx() {
		List<Environement> ll2 = new ArrayList<Environement>();
		List<Environement> ll1 = environementRepository.findAll();
	for (Environement environement : ll1) {
		if(environement.getWeb() ==null && environement.getUnix() ==null &&
				environement.getBase() ==null  && environement.getAppux() ==null  &&
				environement.getAppcs() ==null ) {
			ll2.add(environement);
		}
	}
		return ll2;
	}
	@Override
	public Environement addWebtoEnv(Web web, Long id) {
	webRepository.save(web);
	
	Environement e1 =  environementRepository.findOne(id);
	e1.setWeb(web);
	return environementRepository.save(e1);
	}
	@Override
	public Environement addUnixtoEnv(Unix unix, Long id) {
		unixRepository.save(unix);
		
		Environement e1 =  environementRepository.findOne(id);
		e1.setUnix(unix);
		return environementRepository.save(e1);
	}
	@Override
	public Environement addAppcstoEnv(ApplicationConsole appcs, Long id) {
		appcsRepository.save(appcs);
		
		Environement e1 =  environementRepository.findOne(id);
		e1.setAppcs(appcs);
		return environementRepository.save(e1);
	}
	@Override
	public Environement addAppuxtoEnv(ApplicationUnix appux, Long id) {
		appuxRepository.save(appux);
		
		Environement e1 =  environementRepository.findOne(id);
		e1.setAppux(appux);
		return environementRepository.save(e1);
	}
	@Override
	public Environement addBasetoEnv(Base base, Long id) {
		baseRepository.save(base);
		
		Environement e1 =  environementRepository.findOne(id);
		e1.setBase(base);
		return environementRepository.save(e1);
	}
	@Override
	public List<Environement> getenvnull() {
return environementRepository.getEnvironementsNull();
	}


	
	}



	


