package com.virtusa.UncheckedExcep;
/*
 * NullPointerException
extends RuntimeException
Thrown when an application attempts to use null in a case where an object is required.
These include:
             Calling the instance method of a null object.
             Accessing or modifying the field of a null object.
             Taking the length of null as if it were an array.
             Accessing or modifying the slots of null as if it were an array.
             Throwing null as if it were a Throwable value.
              Applications should throw instances of this class to indicate other illegal uses of the null object. 
              NullPointerException objects may be constructed by the virtual machine as if suppression
               were disabled and/or the stack trace was not writable.
 */

public class NullPointerExcepEx {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		// Initializing String variable with null value
				

				// Checking if ptr.equals null or works fine.
				try
				{
					String name = null;
					System.out.println(name.length());
					
				}
				catch (NullPointerException ex)
				{
					ex.printStackTrace();
					System.out.print("NullPointerException Caught");
				}
		

	}
}
