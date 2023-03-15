package com.virtusa.Default_Static_Method_lambdaExpressionEx4;

// Default method - Multiple Interface Inheritance Rules and Using Lambda Expressions
public class Employee implements AadharCard, VoterID {

	String name;
	int aadharNo;
	int voterId;

	@Override
	public void voterId(int id) {
		this.voterId = id;
		System.out.println("Voter Id - " + this.voterId);

	}

	@Override
	public void aadharNo(int id) {
		this.aadharNo = id;
		System.out.println("Aadhar Id- " + this.aadharNo);
	}

	// overriding the common default method using
	// <interface-name>.super.<method-name()>
	// we can override both the default method
	@Override
	public String address() {
		System.out.println();
		System.out.println("Defult methods invoked -");
		return AadharCard.super.address()+ "\n" + VoterID.super.address();
	}
	
	
	public Employee() {

	}

	public Employee(String name, int aadharNo, int voterId) {
		super();
		this.name = name;
		this.aadharNo = aadharNo;
		this.voterId = voterId;
	}

	public String getName() {
		return name;
	}

	public int getAadharNo() {
		return aadharNo;
	}

	public int getVoterId() {
		return voterId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAadharNo(int aadharNo) {
		this.aadharNo = aadharNo;
	}

	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", aadharNo=" + aadharNo + ", voterId=" + voterId + "]";
	}

}
