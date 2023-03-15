package com.virtusa.ex1;
// how we can say String is immutable ? 
public class Employee {
      public static void main(String[] args) {
		String email = "hrishi@gmail.com" ;
		email.concat("lotekar@gamil.com");
		
		String password = "123456";
		password.concat("0000");
		
		String empId = "88142";
		empId.concat("74125");
		
		// email still refers to "hrishi@gmail.com"
        System.out.println("email refers to " + email);
        
        // password still refers to "123456"
        System.out.println("password refers to " + password);
        
        // empId still refers to "88142"
        System.out.println("empId refers to " + empId);
	}
}
