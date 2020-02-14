package org.sid.services;

import org.sid.entities.ApplicationUnix;
import org.sid.entities.Base;
import org.sid.entities.Web;

import java.util.*;
public interface AppUnixService {
public ApplicationUnix updateAppux(Long id,ApplicationUnix appux);
public ApplicationUnix saveAppux(ApplicationUnix appux);
public boolean deleteAppux(Long id);
public List<ApplicationUnix> getAllAppux();
public ApplicationUnix getappuxbyenv(Long id);
}
