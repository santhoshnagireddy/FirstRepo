package com.example.demo.service;

import java.util.List;

import com.example.demo.beans.Registration;
import com.example.demo.beans.RegistrationModel;

public interface RegistrationServicenterface {
//	public RegistrationModel insert(String ename, String pass, String email, long phoneNo);

	public Registration addUser(Registration reg);
	public List<Registration> getList();
}
