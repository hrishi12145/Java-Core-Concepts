package com.virtusa.ex9.finalex;
//Note : If a class is declared as final as by default all of the methods present in that class are automatically final, but variables are not. 
//Java program to illustrate final keyword
final class Google {

	// by default it is final.
	void hover() {}

	// by default it is not final.
	static int search = 30;

public static void main(String[] args)
	{
		// See modified contents of variable j.
		search = 36;
		System.out.println(search);
	}
}
