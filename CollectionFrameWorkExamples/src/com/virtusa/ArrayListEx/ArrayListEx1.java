package com.virtusa.ArrayListEx;
/*  1. ArrayList internally make use of Dynamic Data Structures .
 *  2. It is an Ordered Collection of data .
 *  3. Allows Duplicate elements
 *  4. It allows homogenius as well as hetrogenius data
 *  5. elements are added at the rare end. 
 */
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList<String> employees = new ArrayList<String>();
		// Adding the elements in the Arraylist
		employees.add("Hrishi");
		employees.add("Aashish");
		employees.add("Mukund");
		employees.add("Mahesh");
		employees.add("Sachin");
		
		System.out.println("Displaying the employees after using add() method " + employees);
		employees.add(0, "Akshay");
		System.out.println("Displaying the employees after using add(index,element) method " + employees);
		System.out.println("Using .get(index) method to get the element value of that index " + employees.get(0));
		System.out.println(
				"removing element using remove(index) " + employees.remove(0) + " After removing " + employees);
		System.out.println(
				"removing element using remove(element) " + employees.remove("Sachin") + "After removing " + employees);
		// contains check weather object is present or not returns boolen value
		System.out.println("Check Mahesh is present or not using contains() - " + employees.contains("Mahesh"));

		// set is used for updating the arraylist using index
		employees.set(0, "Hrishikesh");
		System.out.println("set is used for updating the arraylist using index - ");
		System.out.println(employees);

		// size or length of the ArrayList we can find using
		System.out.println("Size of an Arraylist " + employees.size());

		// Sort
		Collections.sort(employees);

		for (String elements : employees) {
			System.out.println(elements);

		}

		// clear() is used for removing all the elements in one go
		employees.clear();

		System.out.println("clear() is used for removing all the elements in one go " + employees);

	}
}
