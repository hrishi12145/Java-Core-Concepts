package com.virtusa.CustomExcep;

@SuppressWarnings("serial")
public class InvalidAgeException  extends Exception{

	public InvalidAgeException(String s) {
		super(s);
	}
}
