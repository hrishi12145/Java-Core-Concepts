package com.virtusa.Default_Static_Method_lambdaExpressionEx4;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<>();
		System.out.println("static methods invoked -");
		AadharCard.printItToSystemOut();
		VoterID.printItToSystemOut();

		Employee employee1 = new Employee("Hrishi", 0121452, 02314562);
		System.out.println(employee1.address());
		System.out.println();

		// Lambda Expressions
		employees.add(employee1);
		employees.forEach(iteration -> System.out.println(iteration));
	}
}
