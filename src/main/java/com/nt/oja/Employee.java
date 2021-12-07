package com.nt.oja;

public class Employee {

	private int eid;
	private String ename;
	private String Skillset;
	public Employee() {
		super();
		
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
	public String getSkillset() {
		return Skillset;
	}

	public void setSkillset(String skillset) {
		Skillset = skillset;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", Skillset=" + Skillset + "]";
	}

	
	
	
		
	}


