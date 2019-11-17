package com.amal.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.amal.demo.models.Role;

public interface RoleRepository extends CrudRepository<Role, Long>  {
	 List<Role> findAll();
	    
	    List<Role> findByName(String name);
}
