package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.beans.Employee1;



@Repository
public interface EmployeeInterafce extends JpaRepository<Employee1, Integer> {

	List<Employee1> findByName(String name);

  

	

}
