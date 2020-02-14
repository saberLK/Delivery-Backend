package org.sid.services;

import java.util.List;


import org.sid.entities.Version;

public interface VersionService {
	public Version addVersion(Version version);
	public Version updateVersion(Long id, Version version);
	public boolean deleteVersion(Long id);
	public List<Version> getAllVersions();

}
