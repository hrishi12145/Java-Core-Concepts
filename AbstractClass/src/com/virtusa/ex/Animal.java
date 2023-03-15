package com.virtusa.ex;

abstract class Animal {
	abstract void voice();

	public void eat() {
		System.out.println("eat.");
	}

	public Animal() {
           System.out.println("parent class Animal constructor got invoked");
	}
}