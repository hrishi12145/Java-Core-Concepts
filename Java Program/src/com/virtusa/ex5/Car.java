package com.virtusa.ex5;

/* write a Constructor in the car initialize the Brand class field with String "Ford".
 * call the getBrand() method in the main method of class and store the value of the brand in a variable and print the value.
 */
public class Car {
	String Brand;

	public Car() {
		Brand = "Ford";
	}

	public String getBrand() {
		return Brand;
	}

}
