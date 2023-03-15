package com.virtusa.scenario;

import java.io.IOException;

public class Child extends Parent{

	// method() declaring Checked Exception IOException
	  void method() throws IOException {
	 
	    // IOException is of type Checked Exception
	    // so the compiler will give Error
	 
	    System.out.println("SubClass");
	  }
	 
	  // Driver code
	  public static void main(String args[]) {
	    Parent s = new Child();
	    s.method();
	  }
}
