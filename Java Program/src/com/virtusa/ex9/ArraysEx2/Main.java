package com.virtusa.ex9.ArraysEx2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Employee[] employee = new Employee[5];

		Employee obj1 = new Employee(5, "Ram", 40000);
		Employee obj2 = new Employee(4, "Aditya", 65000);
		Employee obj3 = new Employee(3, "Aashish", 65000);
		Employee obj4 = new Employee(2, "Ramesh", 65000);
		Employee obj5 = new Employee(1, "Sunil", 65000);

		employee[0] = obj1;
		employee[1] = obj2;
		employee[2] = obj3;
		employee[3] = obj4;
		employee[4] = obj5;

		System.out.println("Before sorting the Employee by ID :");
		System.out.println(Arrays.toString(employee));

		Arrays.sort(employee);
		System.out.println("After sorting the Employee by ID :");
		for (Employee temp : employee) {
			System.out.println("Employee [empId=" + temp.getEmpId() + ", name=" + temp.getName() + ", salary="
					+ temp.getSalary() + "]");

		} 

	}

}
