package org.sid.services;

import java.util.List;

import org.sid.entities.Unix;
import org.sid.entities.Web;

public interface UnixService {
public Unix updateUnix(Long id,Unix unix);
public Unix saveUnix(Unix unix);
public boolean deleteUnix(Long id);
public List<Unix> getAllUnix();
public Unix getunixbyenv(Long id);
}
