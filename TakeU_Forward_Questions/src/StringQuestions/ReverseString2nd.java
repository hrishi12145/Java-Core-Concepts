package StringQuestions;

import java.util.Scanner;


public class ReverseString2nd {

	public static String reversedString(String inputString) {

		String reverse = "";
		for (int i=inputString.length()-1;i<0;i--) {
			reverse = reverse + inputString.charAt(i);
		}
		return reverse;
	}

	public static void main(String[] args) {

		System.out.println("Enter a String");
		try (Scanner in = new Scanner(System.in)) {
			String inputString = in.nextLine();

			String output = reversedString(inputString);

			System.out.println(output);
		}

	}
}
