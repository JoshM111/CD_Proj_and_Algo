package com.example.solo_proj.services;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.solo_proj.models.User;
import com.example.solo_proj.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository uRepo;
	
	public User find(Long id) {
		User user = this.uRepo.findById(id).orElse(null);
		return user;
	}
	public List<User> allUsers(){
		return this.uRepo.findAll();
	}
	public User registerUser(User user) {
		String hash= BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(hash);
		return this.uRepo.save(user);
	}
	public boolean authUser(String email, String password) {
		User user = this.uRepo.findByEmail(email);
		
		if(user == null) {
			return false;
		}
		return BCrypt.checkpw(password, user.getPassword());
	}
	public User getByEmail(String email) {
		return this.uRepo.findByEmail(email);
	}
}
