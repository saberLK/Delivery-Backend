package org.sid.services;

import java.util.List;

import org.sid.entities.Role;

public interface RoleService {
public Role saveRole(Role role);
public List<Role> getall();
}
