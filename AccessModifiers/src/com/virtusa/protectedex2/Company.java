package com.virtusa.protectedex2;

import com.virtusa.protectedex1.Employee;

public class Company extends Employee {

	public static void main(String[] args) {

		Company company = new Company();

		company.display();

		System.out.println(company.aadharNo);
	}

}
