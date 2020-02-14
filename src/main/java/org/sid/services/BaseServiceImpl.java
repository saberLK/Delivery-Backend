package org.sid.services;

import java.util.*;

import org.sid.entities.Base;
import org.sid.entities.Environement;
import org.sid.entities.Unix;
import org.sid.repository.BaseRepository;
import org.sid.repository.EnvironementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BaseServiceImpl implements BaseService{

	
	@Autowired
	private BaseRepository baseRepository;
	
	@Autowired
	private EnvironementRepository environementRepository;
	
	@Override
	public Base updateBase(Long id, Base base) {
		Base w = baseRepository.findOne(id);
		w.setAdresse_ip(base.getAdresse_ip());
		w.setNomEnv(base.getNomEnv());
		w.setPassword(base.getPassword());
		w.setUrl(base.getUrl());
		w.setUsername(base.getUsername());
				return baseRepository.save(w);
	}
	@Override
	public Base saveBase(Base base) {
	return baseRepository.save(base);
	}
	@Override
	public boolean deleteBase(Long id) {
		baseRepository.delete(id);
		return true;
	}
	@Override
	public List<Base> getAllBase() {
return baseRepository.findAll();
	}
	@Override
	public Base getbasebyenv(Long id) {
		Environement e1 = environementRepository.findOne(id);
		return e1.getBase();
	}


}
