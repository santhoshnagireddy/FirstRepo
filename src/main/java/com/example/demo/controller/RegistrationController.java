package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.Registration;
import com.example.demo.beans.RegistrationModel;
import com.example.demo.service.RegistrationServiceImpl;

@RestController
public class RegistrationController {
	
	@Autowired
	private RegistrationServiceImpl ri;
	
	@GetMapping("/")
	public String welcome() {
		return "welcome To Spring Boot Application";
	}
	
	@PostMapping("/add") 
	public Registration addUser(@RequestBody Registration reg) {
		
		return ri.addUser(reg);
	}
	
	@GetMapping("/list")
	public List<Registration> getList(){
		return ri.getList();
	}
	
	@PutMapping("/update")
	public Registration upda(Registration reg) {
		return ri.Upda(reg);
		
		
	}
	
	@PatchMapping("/update1")
	public Registration upda1(Registration reg) {
		return ri.Upda(reg);
		
		
	}
	

}
