package com.virtusa.UncheckedExcep;
/*
 *  Different RunTime Exception Examples with Nested Try Catch 
 */
public class RunTimeExceptionEx {

	@SuppressWarnings("null")
	public static void main(String[] args) {
     try {
		// NullPointerException
		try {
			String firstName = null;
			System.out.println("Name variable length " + firstName.length());

		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println(" NullPointer Exception Caught ..");
			System.out.println();
		}

		// StringIndexOutOfBound Exception 
		try {
			String lastName = "Lotekar";
			System.out.println("Name variable length " + lastName.length());
			char charAtIndex = lastName.charAt(10);
			System.out.println(charAtIndex);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("StringIndexOutOfBound Exception Caught ... ");
			System.out.println();
		}

		// Arithmetic exception
		try {
			int num1 = 30, num2 = 0;
			int output = num1 / num2;
			System.out.println("Result: " + output);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Arithmetic exception Caught ... ");
			System.out.println();
		}

		// ArrayIndexOutOfBounds Exception
		try {
			int[] arr = new int[5];
			// This will throw exception as Array has
		    // only 5 elements and we are trying to access
		    // 6th element.
			arr[6] = 12;

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ArrayIndexOutOfBounds Exception Caught ...");
			System.out.println();
		}
		// NumberFormat Exception
		try {
			// This exception occurs when a string is parsed to any numeric variable.
			int number = Integer.parseInt("ABC");
			System.out.println(number);
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("NumberFormat Exception Caught");
			System.out.println();
		}
		
     }
     catch(Exception e)  
     {  
       System.out.println("handled the exception (outer catch)");  
     }  
	}

}
