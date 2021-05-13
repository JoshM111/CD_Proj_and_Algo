package com.example.solo_proj.repositorites;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.examples.solo_proj.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
	List<User> findAll();
	boolean existsByEmail(String email);
	User findByEmail(String email);
}
