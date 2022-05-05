package com.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiJWTController {
	
	@GetMapping
	public String welcome() {
		return "Welcome to My Spring Boot Web Api";
	}
	
	@GetMapping("/managers")
	public String managers() {
		return "Authorized manager";
	}
}
