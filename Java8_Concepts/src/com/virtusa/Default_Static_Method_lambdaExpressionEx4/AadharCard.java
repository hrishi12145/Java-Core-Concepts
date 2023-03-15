package com.virtusa.Default_Static_Method_lambdaExpressionEx4;

@FunctionalInterface
public interface AadharCard {
	
	// same default method in voterId interface also
	default String address() {
		return "Aadhar Interface method invoked";
	}
	
	static void printItToSystemOut(){
        System.out.println("Aadhar Card Details ");
    }
	
	void aadharNo(int id);
}
