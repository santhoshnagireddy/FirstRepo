package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.Registration;
import com.example.demo.beans.RegistrationModel;
import com.example.demo.dao.RegistrationInterface;

@Service
public class RegistrationServiceImpl implements RegistrationServicenterface {
	
	@Autowired
	private RegistrationInterface rd;

	@Override
	public Registration addUser(Registration reg) {
		
		return rd.save(reg);
	}
	
	public List<Registration> getList(){
		return rd.findAll();
	}

public Registration Upda(Registration reg) {
		
		return rd.save(reg);
	}
public Registration Upda1(Registration reg) {
	
	return rd.save(reg);
}

}
