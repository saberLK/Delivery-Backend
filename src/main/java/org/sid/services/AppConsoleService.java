package org.sid.services;

import java.util.List;

import org.sid.entities.ApplicationConsole;
import org.sid.entities.Web;

public interface AppConsoleService {
public ApplicationConsole updateAppcs(Long id,ApplicationConsole appcs);
public ApplicationConsole saveAppcs(ApplicationConsole appcs);
public boolean deleteAppcs(Long id);
public List<ApplicationConsole> getAllAppcs();
public ApplicationConsole getappcsbyenv(Long id);
}
