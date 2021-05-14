package com.example.solo_proj.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.solo_proj.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
	List<User> findAll();
	boolean existsByEmail(String email);
	User findByEmail(String email);
}
