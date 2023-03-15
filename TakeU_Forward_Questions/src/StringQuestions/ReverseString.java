package StringQuestions;

import java.util.*;

public class ReverseString {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static String reversedString(String inputString) {
		
		String reverse="";
		Stack stack = new Stack<>();
        
		for(int i=0;i<inputString.length();i++) {
			stack.push(inputString.charAt(i));
		}
		
		while(!stack.isEmpty()) {
			reverse = reverse + stack.pop();
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
	