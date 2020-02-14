package org.sid.services;

import java.util.ArrayList;
import java.util.List;

import org.sid.entities.ApplicationConsole;
import org.sid.entities.ApplicationUnix;
import org.sid.entities.Environement;
import org.sid.repository.AppConsoleRepository;
import org.sid.repository.EnvironementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AppConsoleServiceImpl implements AppConsoleService{

	
	@Autowired
	private AppConsoleRepository appConsoleRepository;
	@Autowired
	private EnvironementRepository environementRepository;
	
	@Override
	public ApplicationConsole updateAppcs(Long id, ApplicationConsole appcs) {
		ApplicationConsole w = appConsoleRepository.findOne(id);
		w.setIp_adress(appcs.getIp_adress());
		w.setNomEnv(appcs.getNomEnv());
		w.setPassword(appcs.getPassword());
		w.setUrl(appcs.getUrl());
		w.setUsername(appcs.getUsername());
				return appConsoleRepository.save(w);
	}
	@Override
	public ApplicationConsole saveAppcs(ApplicationConsole appcs) {
	return appConsoleRepository.save(appcs);
	}
	@Override
	public boolean deleteAppcs(Long id) {
	 appConsoleRepository.delete(id);

	 return true;
	}
	@Override
	public List<ApplicationConsole> getAllAppcs() {
		return appConsoleRepository.findAll();
	}
	@Override
	public ApplicationConsole getappcsbyenv(Long id) {
		Environement e1 = environementRepository.findOne(id);
		return e1.getAppcs();
	}


	

}
