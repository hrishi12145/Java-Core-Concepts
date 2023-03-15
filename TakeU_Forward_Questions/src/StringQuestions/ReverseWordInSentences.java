package StringQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReverseWordInSentences {
  public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		String str = sc.nextLine();
		List<String> words = Arrays.asList(str.split("\\s+"));
		words.stream().reduce((first, second) -> second + " " + first).ifPresent(result -> System.out.println("Reversed words: " + result));
	}
  }
}

