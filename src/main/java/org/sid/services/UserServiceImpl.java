package org.sid.services;

import java.util.List;

import org.sid.entities.User;
import org.sid.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public User update(User user) {
		User user2 = userRepository.findOne(user.getId());
		
	
		user2.setPassword(user.getPassword());
		user2.setRoles(user.getRoles());
		user2.setUsername(user.getUsername());
		
		userRepository.save(user2);
		return user2;
	}

	@Override
	public User find(String userName) {
		return userRepository.findOneByUsername(userName);
	}

	@Override
	public User findbyid(Long id) {
		return userRepository.findOne(id);
	}

	@Override
	public List<User> getAllusers() {
	return userRepository.findAll();
	}

	@Override
	public void delete(Long id) {
	userRepository.delete(id);
	}

}
