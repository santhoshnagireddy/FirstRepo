package com.example.demo.beans;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity

public class Employee1 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	//@Column(nullable = false) it doesnt allow null values
	private String name;

	private Float salary;

	private String address;

	@Column(updatable = false)

	@CreationTimestamp

	@Temporal(TemporalType.TIMESTAMP)
	private Date CreationTime;

	@Column(insertable = false)
	@UpdateTimestamp

	@Temporal(TemporalType.TIMESTAMP)
	private Date ModifiedTime;

	public Employee1(int id, String name, Float salary, String address, Date creationTime, Date modifiedTime) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		CreationTime = creationTime;
		ModifiedTime = modifiedTime;
	}

	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getCreationTime() {
		return CreationTime;
	}

	public void setCreationTime(Date creationTime) {
		CreationTime = creationTime;
	}

	public Date getModifiedTime() {
		return ModifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		ModifiedTime = modifiedTime;
	}

	
	
}
