package com.virtusa.polymorphism;

class Language {
	public void displayInfo() {
		System.out.println("Language");
	}
}

class Marathi extends Language {
	@Override
	public void displayInfo() {
		System.out.println("Marathi Language");
	}
}

public class MethodOverridding {

	public static void main(String[] args) {


		// create an object of Language class
		Language l1 = new Language();
		l1.displayInfo();

		// create an object of Marathi class
		Marathi j1 = new Marathi();
		j1.displayInfo();
	}

}
