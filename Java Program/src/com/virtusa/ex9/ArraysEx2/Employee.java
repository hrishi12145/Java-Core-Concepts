package com.virtusa.ex9.ArraysEx2;

/* create an Employee class with field empId , name , salary 
 *  main class create different employee objects , assign values to them 
 *  then sort the employee object based on empId 
 */
/*
 * To sort an Object by its property, 
 * you have to make the Object implement the Comparable interface 
 * and override the compareTo() method.
 */
public class Employee implements Comparable<Employee> {

	int empId;
	String name;
	int salary;
	
	public Employee() {
		
	} 
	
	public Employee(int empId, String name, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee empById) {
	    int compareEmpByID = ((Employee) empById).getEmpId();
	  // for ascending order
	  	return this.empId - compareEmpByID;
	  		
	  // for descending order
	  		//return compareEmpByID - this.empId ;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "] \n";
		
	}
	
	

}
