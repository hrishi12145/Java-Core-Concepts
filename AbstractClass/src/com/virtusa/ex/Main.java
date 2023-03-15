package com.virtusa.ex;

public class Main {

	public static void main(String[] args) {

		Dog one = new Dog();
		System.out.println("First Dog Details : ");
		System.out.println(one.getName());
		System.out.println(one.getBreed());
		System.out.println(one.getCost());

		one.voice();
		one.eat();

		System.out.println();

		Dog two = new Dog("Max", "Husky", 100000);
		System.out.println("Second Dog Details : ");
		System.out.println(two.getName());
		System.out.println(two.getBreed());
		System.out.println(two.getCost());

		two.voice();
		two.eat();

		System.out.println();

		System.out.println("Cat Details : ");
		Cat cat = new Cat();
		cat.voice();
		cat.eat();

	}

}
