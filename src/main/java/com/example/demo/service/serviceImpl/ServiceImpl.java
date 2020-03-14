package com.example.demo.service.serviceImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.DemoUser;
import com.example.demo.repository.UserRepo;
import com.example.demo.service.UserService;


@Service
public class ServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;
	
	
	
	public DemoUser createUser(DemoUser user) {
	
		return userRepo.save(user);
		
			
	}    

	public DemoUser updateUser(DemoUser user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
		
	}

	public void deleteUser( Integer id) {
		// TODO Auto-generated method stub
		 userRepo.deleteById(id);
	}

	public List<DemoUser> getUser() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public Optional<DemoUser> findByUsername(String user) {
		// TODO Auto-generated method stub
		return userRepo.findByUsername(user);
	}

	@Override
	public boolean existsByUsername(String user) {
		
		return userRepo.existsByUsername(user);
	}

	
	

}