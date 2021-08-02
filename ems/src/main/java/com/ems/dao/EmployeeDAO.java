package com.ems.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ems.model.Employee;

public class EmployeeDAO {
	
	Configuration cfg=new Configuration();
    SessionFactory sFac=cfg.addAnnotatedClass(Employee.class).configure().buildSessionFactory();
    Session s=sFac.openSession();
    Transaction tx=s.beginTransaction();
	
	
	public void addEmployee(Employee emp) {
		s.save(emp);
		tx.commit();
		System.out.println("Successfully Saved.");
	}
	public void editEmployee(Employee emp) {
		if(getEmployee(emp.getEmpid())!=null) {
		Employee empO = s.get(Employee.class,emp.getEmpid());
		empO.setName(emp.getName());
		empO.setAge(emp.getAge());
		empO.setCity(emp.getCity());
		s.update(empO);
		tx.commit();
		
		System.out.println("Sucessfully Updated.");
		}
		else
			System.out.println("Invalid EmpID");
		
	}
	public void deleteEmployee(int empid)  {
			
			Employee emp = s.get(Employee.class,empid);
			s.delete(emp);
			tx.commit();
			System.out.println("Successfully Deleted.");
		
		
	}
	public Employee getEmployee(int empno) {
		return s.get(Employee.class, empno);
	}
	public void viewAllEmployee() {
		List<Employee> list = s.createQuery("from Employee").list();
		for(Employee emp:list) {
			System.out.println(emp);
		}
	}
	
}
