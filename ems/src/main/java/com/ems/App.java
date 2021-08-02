package com.ems;

import java.util.Scanner;


import com.ems.view.EmpUI;




public class App 
{
	
    public static void main( String[] args )
    {	
    	
    	Scanner sc = new Scanner(System.in);
    	
        boolean exit = true;
        while(exit) {
        System.out.println("EMS");
        System.out.println("1.New Employee");
        System.out.println("2.Edit Employee");
        System.out.println("3.Delete Employee");
        System.out.println("4.View All Employees");
        System.out.println("5.Exit");
        int choice = sc.nextInt();
        switch(choice) {
        case 1: EmpUI empui1 =new EmpUI();
        empui1.addDetails();
        break;
        case 2: EmpUI empui2 =new EmpUI();
        empui2.update();
        break;
        case 3: EmpUI empui3 =new EmpUI();
        empui3.deleteDetails();
        break;
        case 4:  EmpUI empui4 =new EmpUI();
        empui4.view();
        break;
        case 5: exit=false;
        break;
        	}
        System.out.println("----------------");
        }
        sc.close();
    }
}
