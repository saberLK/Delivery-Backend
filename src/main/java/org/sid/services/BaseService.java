package org.sid.services;

import java.util.List;
import org.sid.entities.*;
public interface BaseService {
	public Base saveBase(Base base);
	public boolean deleteBase(Long id);
public Base updateBase(Long id,Base base);
public List<Base> getAllBase();
public Base getbasebyenv(Long id);
}
