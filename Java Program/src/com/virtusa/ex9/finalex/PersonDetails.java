package com.virtusa.ex9.finalex;
//Blank final variable // declared as Final class
public final class PersonDetails {
	//Blank final variable
	  final int id;
	  //parameterized constructor
	  public PersonDetails(int AadharNo) {
		
		  //Blank final variable must be initialized in constructor
		    id = AadharNo;
	}
	  void getDetails() {
		    System.out.println("Id of the Person Aadhar Id number is: " + id);
		  }
	  public static void main(String[] args) {
		PersonDetails person1 = new PersonDetails(123456);
		person1.getDetails();
	}
}
