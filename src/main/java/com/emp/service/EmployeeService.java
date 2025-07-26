package com.emp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.dao.EmployeeDao;
import com.emp.entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao dao;
	
	public String insert(Employee e) {
	String msg=dao.InsertData(e);
	return msg;
	}
	public String Delete(int eid) {
		String msg=dao.DeleteData(eid);
		return msg;
	}
	public String Update(Employee e,int eid) {
		String msg=dao.UpdateData(e, eid);
		return msg;
	}
	public Employee getOneData(int eid) {
		Employee empl=dao.getSingleData(eid);
		return empl;
	}
	public List<Employee>getAllData(){
		List<Employee>emp=dao.getAllRecord();
		return emp;
	}
		
		
		
	}
	


