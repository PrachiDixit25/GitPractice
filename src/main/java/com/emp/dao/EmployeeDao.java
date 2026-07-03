package com.emp.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.emp.entity.Employee;

@Repository
public class EmployeeDao {
	@Autowired
	SessionFactory sf;
	
	
	public String InsertData(Employee emp) {
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		ss.persist(emp);
		tr.commit();
		ss.close();
		return "Data is inserted..";
		
	}
	public String Deletedata(int eid) {
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		Employee es=ss.get(Employee.class, eid);
		ss.remove(es);
		tr.commit();
		ss.close();
		return "Data is deleted..";
	}
	public String UpdateData(Employee e,int eid) {
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		Employee es1=ss.get(Employee.class, eid);
		es1.setEname(e.getEname());
		es1.setEcity(e.getEcity());
		es1.setSalary(e.getSalary());
		ss.merge(es1);
		tr.commit();
		ss.close();
		return "Data is updated";
		
	}
	public Employee getSingleData(int eid) {
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		Employee es2=ss.get(Employee.class, eid);
		es2.getEname();
		es2.getEcity();
		es2.getSalary();
		ss.persist(es2);
		tr.commit();
		ss.close();
		return es2;
	}
	public List<Employee>getAllRecord(){
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		ArrayList<Employee> list=new ArrayList<Employee>();
	
	    Iterator<Employee>itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ss.persist(list);
		tr.commit();
		ss.close();
		return list;
		
	}
	

}
