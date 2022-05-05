package com.jwt.init;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.model.User;
import com.jwt.repository.UserRepository;

@Component
public class StartApplication implements CommandLineRunner {
	
	@Autowired
	UserRepository userRepository;
	
	@Transactional
	@Override
	public void run(String... args) throws Exception {
		User user = userRepository.findByUsername("admin");
		if(user==null) {
			user = new User();
			user.setName("Raquel");
			user.setPassword("123");
			user.setUsername("admin");
			user.getRoles().add("MANAGERS");
			userRepository.save(user);
		}
		user = userRepository.findByUsername("user");
		if(user==null) {
			user = new User();
			user.setName("Douglas");
			user.setPassword("123");
			user.setUsername("user");
			user.getRoles().add("USERS");
			userRepository.save(user);
		}
		
	}

}
