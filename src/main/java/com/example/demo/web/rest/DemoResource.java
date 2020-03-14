package com.example.demo.web.rest;


import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.DemoUser;
import com.example.demo.service.UserService;




@RestController
@RequestMapping("/api")
@CrossOrigin
public class DemoResource {
	@Autowired
	UserService userService;
	
	private final Logger log= LoggerFactory.getLogger(DemoResource.class);
	
	@PostMapping("/create")
	
	public DemoUser create (@RequestBody DemoUser user) {
	 
		if( !userService.existsByUsername(user.getUsername())) {
		   userService.createUser(user);
	   }
		  
	return user;
	}
	
	@PutMapping("/update")
	public DemoUser update (@RequestBody DemoUser user) {
		return userService.updateUser(user);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Integer id) {
		 userService.deleteUser(id);
	}
	@GetMapping("/findAllUsers")
	List<DemoUser>getUser(){
		return userService.getUser();
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/findUser/{user}")
	Optional<DemoUser> findByUsername(@PathVariable String user){
		return userService.findByUsername(user);
	}
}
