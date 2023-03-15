package com.virtusa.privateex1;

/*
 * Private: The private access modifier is specified using the keyword private. 
The methods or data members declared as private are accessible only within the class in which they are declared.
Any other class of the same package will not be able to access these members.
Top-level classes or interfaces can not be declared as private because
private means “only visible within the enclosing class”.
protected means “only visible within the enclosing class and any subclasses”
 */
public class Employee {
	private static int accountNo = 12345;

	private void withdraw() {
		System.out.println("Cash");
	}
    public static void main(String[] args) {
		System.out.println(accountNo);
		
		Employee employee = new Employee();
		employee.withdraw();
	}
}
