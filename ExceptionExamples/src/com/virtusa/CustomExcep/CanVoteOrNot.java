package com.virtusa.CustomExcep;

import java.util.Scanner;

public class CanVoteOrNot {

	static void check(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Not Valid to Vote");
		} else {
			System.out.println("You are valid to vote");
		}
	}

	@SuppressWarnings("null")
	public static void main(String[] args) {

		System.out.println("Enter Age : ");
		try (Scanner inputAge = new Scanner(System.in)) {
			int value = inputAge.nextInt();
			check(value);
			String name = null;
			System.out.println(name.length());
			
			
		} catch (InvalidAgeException e) {
			e.printStackTrace();
			System.out.println("Invalid Age Exception Occured..");
		} catch (NullPointerException ex) {
			ex.printStackTrace();
			System.out.println("NullPointerException Caught");
			System.out.println();
		} finally {
			System.out.println("Welcome to Voting System");
			
		}

	}

}
