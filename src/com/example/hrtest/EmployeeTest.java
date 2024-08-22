package com.example.hrtest;

//importing "com.example.hr" package to create instance for Employee class in this package

import com.example.hr.*;

public class EmployeeTest {
	

	public static void main(String[] args) {
		
		//Creating an instance of Employee class
		
		Employee emp = new Employee("Ashok", 201,25000);
		
		//calling the methods from Employee class to print Name and Salary
		
		emp.printName();
		emp.printSalary();
	}

}



/* Output :

Employee's Name : Ashok
Employee's Salary : 25000.0

*/