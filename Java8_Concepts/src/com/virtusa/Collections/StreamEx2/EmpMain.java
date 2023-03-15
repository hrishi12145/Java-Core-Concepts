package com.virtusa.Collections.StreamEx2;
// Using Lambda Expression and for sorting using comparator
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpMain {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<>();

		Employee emp1 = new Employee(5, "RAM", 40000);
		Employee emp2 = new Employee(4, "Aditya", 75000);
		Employee emp3 = new Employee(3, "Aashish", 85000);
		Employee emp4 = new Employee(2, "Ramesh", 95000);
		Employee emp5 = new Employee(1, "Sunil", 65000);

		
		employees.add(emp1);
		employees.add(emp3);
		employees.add(emp2);
		employees.add(emp4);
		employees.add(emp5);

		
		Stream<Employee> salaryGreaterThan =employees.stream().filter(e->e.getSalary() > 65000);
		
		System.out.println("Employee Salary Greater than Rs 65000 are -");
		
		salaryGreaterThan.forEach(e -> System.out.println(e));
		
		System.out.println();
		System.out.println("Employee whose Name Start With Letter 'A' -");
		employees.stream().map(n-> n.getName() +"").filter(n-> n.startsWith("A")).forEach(System.out::println);
		
		System.out.println();
		System.out.println("Employee whose EmpId is Even -");
		employees.stream().filter(e ->e.getEmpId() %2 == 0).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println();
		System.out.println("Employee whose EmpId is Odd -");
		employees.stream().filter(e ->e.getEmpId() %2 == 1).collect(Collectors.toList()).forEach(System.out::println);
	
	}

}
