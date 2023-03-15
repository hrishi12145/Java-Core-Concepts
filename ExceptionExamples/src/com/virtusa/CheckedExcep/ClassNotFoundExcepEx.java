package com.virtusa.CheckedExcep;

public class ClassNotFoundExcepEx {

	public static void main(String[] args) {

		// Unhandled exception type ClassNotFoundException
	   //  Class.forName("Main");
		try {
			Class.forName("Main");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Class not found Exception has been Occured");
		}

	}

}
