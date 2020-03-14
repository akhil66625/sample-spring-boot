package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.domain.DemoUser;


public interface UserService {
	
	DemoUser createUser(DemoUser user);
	DemoUser updateUser( DemoUser user);
	void deleteUser(Integer id);
	List<DemoUser>getUser();
	Optional<DemoUser> findByUsername(String user);
	 boolean existsByUsername(String user);
	
	

}
