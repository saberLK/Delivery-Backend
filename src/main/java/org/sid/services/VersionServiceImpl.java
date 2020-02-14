package org.sid.services;

import java.util.*;

import org.sid.entities.Environement;
import org.sid.entities.Projects;
import org.sid.entities.Version;
import org.sid.repository.VersionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class VersionServiceImpl implements VersionService{

	@Autowired 
	private VersionRepository versionRepository;
	@Override
	public Version addVersion(Version version) {
	return versionRepository.save(version);
	}

	@Override
	public Version updateVersion(Long id, Version version) {
		Version v2 = versionRepository.findOne(id);
		v2.setNomVersion(version.getNomVersion());
		v2.setProjects(version.getProjects());
	


				return versionRepository.save(v2);
	}

	@Override
	public boolean deleteVersion(Long id) {
		versionRepository.delete(id);
		return true;
	}

	@Override
	public List<Version> getAllVersions() {
		return versionRepository.findAll();
	}

	
	
	

}
