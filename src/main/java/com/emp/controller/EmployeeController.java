package com.emp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emp.entity.Employee;
import com.emp.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@PostMapping("/Insert")
	public String Insert(@RequestBody Employee em) {
		String msg=service.insert(em);
		return msg;
		
	}
	@DeleteMapping("/delete/{eid}")
	public String Delete(@PathVariable int eid) {
		String msg=service.Delete(eid);
		return msg;
	}
	@PutMapping("/update/{eid}")
	public String Update(@RequestBody Employee employee,@PathVariable int eid) {
		String msg=service.Update(employee, eid);
		return msg;
	}
	@GetMapping("/Get/{eid}")
	public Employee getData(@RequestBody Employee emp,@PathVariable int eid) {
		Employee em=service.getOneData(eid);
		return em;
	}
	@GetMapping("/GetAll")
	public List<Employee>getAllData(){
		List<Employee>er=service.getAllData();
		return er;
	}

}
