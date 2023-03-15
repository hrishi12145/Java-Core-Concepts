import java.util.Scanner;

public class InputUsingScanner {

	public static void main(String[] args) {

		System.out.println("Enter a String: ");
		try (Scanner input = new Scanner(System.in)) {
			String promptInput = input.nextLine();
			System.out.println(promptInput);
		}

	}

}
