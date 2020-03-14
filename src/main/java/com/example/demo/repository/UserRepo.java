package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.DemoUser;

@Repository
public interface UserRepo extends JpaRepository<DemoUser, Integer> {
	Optional<DemoUser> findByUsername(String user);
	 boolean existsByUsername(String user);

}
