package com.emp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Employee {
	
	@Id
	private int eid;
	private String ename;
	private String ecity;
	private int salary;
	public Employee() {
	
		
	}
	public Employee(int eid, String ename, String ecity, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.ecity = ecity;
		this.salary = salary;
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
	public String getEcity() {
		return ecity;
	}
	public void setEcity(String ecity) {
		this.ecity = ecity;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", ecity=" + ecity + ", salary=" + salary + "]";
	}
	
	
}