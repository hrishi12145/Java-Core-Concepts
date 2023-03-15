package StringQuestions;
import java.util.*;
public class CheckPalindrome {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static String isPalindrome(String inputString){
		Stack stack = new Stack<>();
		String reverseString="";
		
		for(int i=0;i<inputString.length();i++) {
			stack.push(inputString.charAt(i));
		}
		
		while(!stack.isEmpty()){
			reverseString = reverseString + stack.pop();
		}
		
		if(inputString.equals(reverseString)) 
			return "Palindrome";
		else 
			return "not Palindrome";
		
	}

	public static void main(String[] args) {

		System.out.print("Enter any string:");
        try (Scanner in = new Scanner(System.in)) {
			String inputString = in.nextLine().toLowerCase();
			
			String output = isPalindrome(inputString);
			System.out.println(output);
			
		}

    
	}

}
