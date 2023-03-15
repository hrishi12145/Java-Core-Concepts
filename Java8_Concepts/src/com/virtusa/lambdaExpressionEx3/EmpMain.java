package com.virtusa.lambdaExpressionEx3;
// Using Lambda Expression and for sorting using comparator
import java.util.ArrayList;
import java.util.Collections;

public class EmpMain {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<>();

		Employee emp1 = new Employee(5, "Ram", 40000);
		Employee emp2 = new Employee(4, "Aditya", 65000);
		Employee emp3 = new Employee(3, "Aashish", 65000);
		Employee emp4 = new Employee(2, "Ramesh", 65000);
		Employee emp5 = new Employee(1, "Sunil", 65000);

		employees.add(emp5);
		employees.add(emp1);
		employees.add(emp3);
		employees.add(emp2);
		employees.add(emp4);
		System.out.println("Before Sorting : ");
		// for each without Lambda Expression
		for (Employee employee : employees) {
			System.out.println(employee);
		}

		Collections.sort(employees, (obj1, obj2) -> (obj1.empId - obj2.empId));

		System.out.println();
		System.out.println("After Sorting : ");
//		for (Employee employee : employees) {
//			System.out.println(employee);
//		}
		
		// for each with Lambda Expression
		employees.forEach(iteration -> System.out.println(iteration));
		
	}

}
