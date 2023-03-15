package com.virtusa.Default_Static_Method_lambdaExpressionEx4;

@FunctionalInterface
public interface VoterID {
	void voterId(int id);

	// same default method in Aadhar Card interface also
	default String address() {
		return "Voter Interface method invoked";
	}
	
	static void printItToSystemOut(){
        System.out.println("Voter ID Details");
    }
}
