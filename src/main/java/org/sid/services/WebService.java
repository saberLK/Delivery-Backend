package org.sid.services;

import java.util.List;

import org.sid.entities.Web;

public interface WebService {
public Web updateWeb(Long id,Web web);
public List<Web> getAllWebs();
public Web saveWeb(Web web);
public boolean deleteWeb(Long id);
public Web getwebbyenv(Long id);

}
