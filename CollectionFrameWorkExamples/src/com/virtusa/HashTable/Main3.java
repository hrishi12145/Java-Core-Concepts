package com.virtusa.HashTable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.virtusa.LinkedHashMapex.Employees;

public class Main3 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

       Hashtable<Employees, String> employeeMap = new Hashtable<>();
       
       Employees employee1 = new Employees();
		employee1.setEmpId(1);
		employee1.setName("Hrishi");
		employee1.setSalary(70000);

		employeeMap.put(employee1, "Java developer");

		Employees employee2 = new Employees(2, "Amit", 80000);

		employeeMap.put(employee2, "Python developer");
		
		Employees employee3 = new Employees(3, "Ram", 80000);

		employeeMap.put(employee3, "JavaScript developer");
		 
	    // Obtaining an iterator for the entry set
	    Iterator<Entry<Employees, String>> it = employeeMap.entrySet().iterator();
	 
	    // Iterate through HashMap entries(Key-Value pairs)
	    System.out.println("HashMap Key-Value Pairs : ");
	    while(it.hasNext()){
	       Map.Entry details = (Map.Entry)it.next();
	       System.out.println("Key is: "+details.getKey() + 
	       " & " + 
	       " value is: "+details.getValue());
	   }
	}

}
