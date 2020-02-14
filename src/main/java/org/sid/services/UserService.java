package org.sid.services;

import org.sid.entities.User;
import java.util.*;
public interface UserService {
	public User save(User user);
	public User update(User user);
	public User find(String userName);
	public User findbyid(Long id);
	public List<User> getAllusers();
	public void delete(Long id);
}
