package com.virtusa.ex;
/*
 * An abstract class can have constructors like the regular class.
 *  we can access the constructor of an abstract class from the subclass using the super keyword.
 */
public class Dog extends Animal {

	String name;
	String breed;
	int cost;

	public Dog(String name, String breed, int cost) {
		super();
		System.out.println("child class dog args constructor got invoked ");
		this.name = name;
		this.breed = breed;
		this.cost = cost;
	}

	public Dog() {
		super();
		System.out.println("child class dog no-args constructor got invoked ");
		name = "Rockey";
		breed = "bulldog";
		cost = 77000;
	}

	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}

	public int getCost() {
		return cost;
	}
	
	@Override
	void voice() {
		System.out.println("Bark");

	}

}
