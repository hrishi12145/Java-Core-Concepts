package com.virtusa.TreeMap;

public class Person implements Comparable<Person> {

	int aadharNo;
	String name;
	String city;

	public Person() {
	}

	public Person(int aadharNo, String name, String city) {
		super();
		this.aadharNo = aadharNo;
		this.name = name;
		this.city = city;
	}

	public int getAadharNo() {
		return aadharNo;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public void setAadharNo(int aadharNo) {
		this.aadharNo = aadharNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public int compareTo(Person aadharId) {
		int comparePersonByAadharID = ((Person) aadharId).getAadharNo();
		// for ascending order
		return this.aadharNo - comparePersonByAadharID;

		// for descending order
		// return compareEmpByID - this.empId ;
	}

	@Override
	public String toString() {
		return "[aadharNo=" + aadharNo + ", name=" + name + ", city=" + city + "]";
	}

}
