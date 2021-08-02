package com.ems.view;

import java.util.Scanner;

import com.ems.dao.EmployeeDAO;
import com.ems.model.Employee;

public class EmpUI {
	Scanner sc = new Scanner(System.in);
	EmployeeDAO empDao =new EmployeeDAO();
//	-------------------------------------------------------------------------
	public void addDetails() {
		
		System.out.println("Enter EmpId.");
		int empid = sc.nextInt();
		System.out.println("Enter Age.");
		int age = sc.nextInt();
		System.out.println("Enter Name.");
		String name  = sc.next();
		System.out.println("Enter City.");
		String city = sc.next();
		Employee emp = new Employee(empid, name, age, city);
		empDao.addEmployee(emp);
	}
//	-----------------------------------------------------------------------------
	public void update() {
		System.out.println("Enter the empid to update");
		int eno = sc.nextInt();
		if(empDao.getEmployee(eno)==null) {
			System.out.println("invalid empid. ");
		}
		else {
		System.out.println(empDao.getEmployee(eno));
		System.out.println("Enter Age.");
		int age = sc.nextInt();
		System.out.println("Enter Name.");
		String name  = sc.next();
		System.out.println("Enter City.");
		String city = sc.next();
		Employee emp = new Employee(eno, name, age, city);
		empDao.editEmployee(emp);
		}
	}
//	-----------------------------------------------------------------------------
	public void deleteDetails() {
		System.out.println("Enter the empid to update");
		int eno = sc.nextInt();
		if(empDao.getEmployee(eno)==null) {
			System.out.println("invalid empid. ");
		}
		else
		empDao.deleteEmployee(eno);
	}
//	--------------------------------------------------------------------------
	public void view() {
		System.out.println(" EmpNO  Name Age City");
		System.out.println("-----------------------");
		empDao.viewAllEmployee();
	}
		
}

