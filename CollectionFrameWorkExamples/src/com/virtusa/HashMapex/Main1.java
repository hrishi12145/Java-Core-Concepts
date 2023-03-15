package com.virtusa.HashMapex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main1 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		HashMap<Employees, String> employeeMap = new HashMap<Employees, String>();

		Employees employee1 = new Employees();
		employee1.setEmpId(1);
		employee1.setName("Hrishi");
		employee1.setSalary(70000);

		employeeMap.put(employee1, "Java developer");

		Employees employee2 = new Employees(2, "Amit", 80000);

		employeeMap.put(employee2, "Python developer");
		
		Employees employee3 = new Employees(3, "Ram", 80000);

		employeeMap.put(employee3, "JavaScript developer");
		
		
		// Getting a Set of Key-value pairs
	    Set entrySet = employeeMap.entrySet();
	 
	    // Obtaining an iterator for the entry set
	    Iterator it = entrySet.iterator();
	 
	    // Iterate through HashMap entries(Key-Value pairs)
	    System.out.println("HashMap Key-Value Pairs : ");
	    while(it.hasNext()){
	       Map.Entry details = (Map.Entry)it.next();
	       System.out.println("Key is: "+details.getKey() + 
	       " & " + 
	       " value is: "+details.getValue());
	   }
	    
	    // 2nd Way to Iterate
//		Iterator<?> iterator = employeeMap.entrySet().iterator();
//
//		while (iterator.hasNext()) {
//
//			Map.Entry mapElement = (Map.Entry) iterator.next();
//			String value = (String) mapElement.getValue();
//			System.out.println(mapElement.getKey() + " : " + value);
//		}
	}

}
