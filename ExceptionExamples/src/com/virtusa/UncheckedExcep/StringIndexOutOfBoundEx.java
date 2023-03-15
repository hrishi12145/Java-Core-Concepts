package com.virtusa.UncheckedExcep;

public class StringIndexOutOfBoundEx {

	public static void main(String[] args) {
        
		try {
			String name ="Hrishi" ;
			System.out.println("Name variable length "+name.length());
			
			char charAtIndex = name.charAt(10);
		    System.out.println(charAtIndex);
			
		}catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("StringIndexOutOfBound Exception Caught ... ");
		}

	}

}
