package org.sid.services;

import java.util.List;

import org.sid.entities.Environement;
import org.sid.entities.Unix;
import org.sid.entities.Web;
import org.sid.repository.EnvironementRepository;
import org.sid.repository.UnixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnixServiceImpl implements UnixService {

	@Autowired
	private UnixRepository unixRepository;
	@Autowired
	private EnvironementRepository environementRepository;
	@Override
	public Unix updateUnix(Long id, Unix unix) {
		Unix w = unixRepository.findOne(id);
		w.setAdresse_ip(unix.getAdresse_ip());
		w.setNomEnv(unix.getNomEnv());
		w.setPassword(unix.getPassword());
		w.setUrl(unix.getUrl());
		w.setUsername(unix.getUsername());
				return unixRepository.save(w);
	}
	@Override
	public Unix saveUnix(Unix unix) {
		return unixRepository.save(unix);
	}
	@Override
	public boolean deleteUnix(Long id) {
		unixRepository.delete(id);
		return true;
	}
	@Override
	public List<Unix> getAllUnix() {
	return unixRepository.findAll();
	}
	@Override
	public Unix getunixbyenv(Long id) {
		Environement e1 = environementRepository.findOne(id);
		return e1.getUnix();
	}


}
