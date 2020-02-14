package org.sid.services;

import java.util.List;

import org.sid.entities.Role;
import org.sid.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService{
@Autowired
private RoleRepository rolerepository;

@Override
public Role saveRole(Role role) {
return rolerepository.save(role);
}

@Override
public List<Role> getall() {
return rolerepository.findAll();
}


}
