package org.sid.services;

import java.util.*;

import org.sid.entities.ApplicationUnix;
import org.sid.entities.Base;
import org.sid.entities.Environement;
import org.sid.repository.AppUnixRepository;
import org.sid.repository.EnvironementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AppUnixServiceImpl implements AppUnixService{
@Autowired
private AppUnixRepository appUnixRepository;
@Autowired
private EnvironementRepository environementRepository;
@Override
public ApplicationUnix updateAppux(Long id, ApplicationUnix appux) {
	ApplicationUnix w = appUnixRepository.findOne(id);
	w.setAdresse_ip(appux.getAdresse_ip());
	w.setNomEnv(appux.getNomEnv());
	w.setPassword(appux.getPassword());
	w.setUrl(appux.getUrl());
	w.setUsername(appux.getUsername());
			return appUnixRepository.save(w);
}

@Override
public ApplicationUnix saveAppux(ApplicationUnix appux) {
	return appUnixRepository.save(appux);
}

@Override
public boolean deleteAppux(Long id) {
	appUnixRepository.delete(id);
	return true;
}

@Override
public List<ApplicationUnix> getAllAppux() {
	return appUnixRepository.findAll();
}

@Override
public ApplicationUnix getappuxbyenv(Long id) {
	Environement e1 = environementRepository.findOne(id);
	return e1.getAppux();
}




}
