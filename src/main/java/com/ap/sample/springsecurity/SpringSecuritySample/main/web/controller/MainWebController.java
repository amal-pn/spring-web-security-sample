package com.ap.sample.springsecurity.SpringSecuritySample.main.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainWebController {
	@GetMapping("/")
	public String home() {
		return "Spring boot app is working";
	}

	@GetMapping("/user") 
	public String user() {
		return "User has logged in";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "Admin has logged in";
	}
	
}
