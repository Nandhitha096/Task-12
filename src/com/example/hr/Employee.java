/* 1. Create a package named "com.example.hr" that includes an Employee class. The Employee class should have the following fields :

name - a string that represents the employee's name
id - an integer that represents the employee's ID number
salary - a double that represents the employee's salary

The Employee class should have the following methods :

public void printName() - a method that prints the Employee's name to the console
public void printSalary() - a method that prints Employee's salary to the console

Create a second package named "com.example.hrtest" that includes a class named "EmployeeTest". The "EmployeeTest" class should include a main method that creates an instance of the Employee class, sets the employee's name, ID number, salary and calls it's method to print the employee's name and salary to the console. 

In your main method, use import statement to import the "com.example.hr" package and access the Employee class.

Finally, compile and run your program to verify that it successfully creates an instance of the Employee class and calls it's method to print the Employee's name and salary to the console. */


package com.example.hr;

public class Employee {


	    //Defining variables with respective datatypes
	
		String name;
		int id;
		double salary;
		
		//Constructor to initialize the above fields
		
		public Employee(String name, int id, double salary)
		{
			this.name=name;
			this.id=id;
			this.salary=salary;
		}
		
		//Getter and setter methods for Name
		
		public String getName()
		{
			return name;
			
		}
		
		public void setName(String name)
		{
			this.name = name;
		}
		
		//Getter and setter methods for ID
		
		public int getID()
		{
			return id;
			
		}
		
		public void setID(int id)
		{
			this.id = id;
		}
		
		//Getter and setter methods for Salary
		
		public double getSalary()
		{
			return salary;
			
		}
		
		public void setSalary(double salary)
		{
			this.salary = salary;
		}
		
		//Method to print the name of the employee
		
		public void printName()
		{
			System.out.println("Employee's Name : "+name);
		}
		
		//Method to print the salary of the employee
		
		public void printSalary()
		{
			System.out.println("Employee's Salary : "+salary);
		}		

	}

