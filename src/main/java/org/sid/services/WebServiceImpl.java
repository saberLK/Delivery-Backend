package org.sid.services;

import java.util.ArrayList;
import java.util.List;

import org.sid.entities.Environement;
import org.sid.entities.Web;
import org.sid.repository.EnvironementRepository;
import org.sid.repository.WebRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class WebServiceImpl implements WebService{

	@Autowired
	private WebRepository webRepository;

	@Autowired
	private EnvironementRepository environementRepository;
	@Override
	public Web updateWeb(Long id, Web web) {
		Web w = webRepository.findOne(id);
w.setAdresse_ip(web.getAdresse_ip());
w.setNomEnv(web.getNomEnv());
w.setPassword(web.getPassword());
w.setUrl(web.getUrl());
w.setUsername(web.getUsername());
		return webRepository.save(w);
	}
	@Override
	public List<Web> getAllWebs() {
	return webRepository.findAll();
	}
	@Override
	public Web saveWeb(Web web) {
		return  webRepository.save(web);

	
		
	}
	@Override
	public boolean deleteWeb(Long id) {
	 webRepository.delete(id);
	 return true;
	}
	@Override
	public Web getwebbyenv(Long id) {
		Environement e1 = environementRepository.findOne(id);
		return e1.getWeb();
	}
	



}
