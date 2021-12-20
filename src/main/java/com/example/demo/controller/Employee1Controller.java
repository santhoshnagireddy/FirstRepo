package com.example.demo.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.Employee1;

import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/Rest")
public class Employee1Controller {

	@Autowired
	private EmployeeService empservice;

	@GetMapping("/test1")
	public String adder() {
		return "hello welcome to rest api";
	}

	// to save purpose
	@PostMapping("/insert")
	public ResponseEntity<Employee1> addEmployee1(@RequestBody Employee1 emp) {
		Employee1 addEmployee1 = empservice.addEmployee1(emp);
		return new ResponseEntity<Employee1>(addEmployee1, HttpStatus.CREATED);

	}

	// to retrive purpose
	@GetMapping(value = "list")
	public ResponseEntity<List<Employee1>> getAllEmployee1s() {
		List<Employee1> allEmployee1s = empservice.getAllEmployee1();
		return new ResponseEntity<List<Employee1>>(allEmployee1s, HttpStatus.OK);

	}

	// to retrive data based on id

	@GetMapping("/get/{id}")
	public ResponseEntity<Employee1> getEmpbyId(@PathVariable("id") int id) {
		Employee1 empbyId = empservice.getEmpbyId(id);
		return new ResponseEntity<Employee1>(empbyId, HttpStatus.OK);

	}

	// to update data based on id
	@PutMapping("/update/{id}")
	public ResponseEntity<Employee1> updateEmployee1(@RequestBody Employee1 emp, @PathVariable("id") int id) {
		Employee1 empbyId = empservice.updateEmployee1(id, emp);
		return new ResponseEntity<Employee1>(empbyId, HttpStatus.OK);

	}

	// to retrive data based on name
	@GetMapping("/list/{name}")
	public ResponseEntity<List<Employee1>> getEmpName(@PathVariable("name") String name) {
		List<Employee1> empName = empservice.getEmpName(name);
		return new ResponseEntity<List<Employee1>>(empName, HttpStatus.OK);

	}

	// to delete the data based on id
	@DeleteMapping("/del/{id}")
	public String delEmpbyId(@PathVariable("id") int id) {
		String empbyId = empservice.delEmpbyId(id);
		return "deleted Successfully";
	}
}
