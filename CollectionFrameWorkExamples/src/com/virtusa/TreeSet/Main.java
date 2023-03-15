package com.virtusa.TreeSet;
/*  Java TreeSet class contains unique elements only like HashSet.
Java TreeSet class access and retrieval times are quiet fast.
Java TreeSet class doesn't allow null element.
Java TreeSet class is non synchronized.
Java TreeSet class maintains ascending order.
Java TreeSet class contains unique elements only like HashSet.
Java TreeSet class access and retrieval times are quite fast.
Java TreeSet class doesn't allow null elements.
Java TreeSet class is non-synchronized.
Java TreeSet class maintains ascending order.
The TreeSet can only allow those generic types that are comparable.
For example The Comparable interface is being implemented by the StringBuffer class.
 * 
 */
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		Set<Employee> employees = new TreeSet<Employee>();

		Employee obj1 = new Employee(5, "Ram", 40000);
		Employee obj2 = new Employee(4, "Aditya", 65000);
		Employee obj3 = new Employee(3, "Aashish", 65000);
		Employee obj4 = new Employee(2, "Ramesh", 65000);
		Employee obj5 = new Employee(1, "Sunil", 65000);

		employees.add(obj5);
		employees.add(obj4);
		employees.add(obj3);
		employees.add(obj2);
		employees.add(obj1);

		System.out.println("Displaying in Assending order by using EmpID: ");
		
		Iterator<Employee> iteration = employees.iterator();
		while (iteration.hasNext()) {
			System.out.println(iteration.next() + " ");
		}

	}

}
