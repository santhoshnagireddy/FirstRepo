package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.Employee1;
import com.example.demo.dao.EmployeeInterafce;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeInterafce empInter;

	public Employee1 addEmployee1(Employee1 emp) {
		return empInter.save(emp);

	}

	public List<Employee1> getAllEmployee1() {

		return empInter.findAll();
	}

	public Employee1 getEmpbyId(int id) {
		return empInter.findById(id).get();

	}

	public Employee1 updateEmployee1(int id, Employee1 emp) {
		Employee1 employee = new Employee1();
		Employee1 findById = empInter.findById(id).get();
		findById.setName(emp.getName());
		findById.setSalary(emp.getSalary());
		findById.setAddress(emp.getAddress());
		Employee1 save = empInter.save(findById);
		return findById;

	}

	public List<Employee1> getEmpName(String name) {

		return empInter.findByName(name);
	}

	public String delEmpbyId(int id) {

		empInter.deleteById(id);
		return null;
	}

}
