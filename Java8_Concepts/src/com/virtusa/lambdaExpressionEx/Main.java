package com.virtusa.lambdaExpressionEx;

public class Main {

	public static void main(String[] args) {

		// Ex1
//		TestFunctionInterface one = (i) -> System.out.println("Excecuted");
//		one.test(1);
		
		// Ex2
//		TestFunctionInterface functionInterface = (i)-> i ;
//		System.out.println(functionInterface.test(2));

		// Ex3
		TestFunctionInterface add =(s1,s2)-> s1 +" "+ s2 ;
		System.out.println(add.test("Hello", "World"));
	}
	

}
