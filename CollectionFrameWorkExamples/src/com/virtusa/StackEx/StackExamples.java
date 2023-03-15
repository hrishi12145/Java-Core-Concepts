package com.virtusa.StackEx;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

/* Stack class extends vector class that extends List interface
 * 1. Stack is a group of elements with “last-in, first-out” retrieval.
2. In the Java stack, all operations take place at the top of the stack.
3. Push operation inserts an element to the top of stack.
4. Pop operation removes an element from the stack and returns it.
5. Stack class is synchronized. That means it is thread-safe
6. Null elements are allowed into the stack.
7. Duplicate elements are allowed into the stack.
 */
public class StackExamples {
	public static void main(String[] args) {

		Stack<String> books = new Stack<>();
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("how many books elements do you want to add: ");
			int number = input.nextInt();
			for (int i = 0; i <= number - 1; i++) {
				System.out.print("Add Books Element: ");
				String element = input.next();
				// Pushes an item onto the top of this stack. This has exactly the same effect
				// as: addElement(item)
				books.push(element);
			}
			System.out.println("Using push() method: " + books);
			// peek() - Looks at the object at the top of this stack without removing it
			// from the stack.
			String topOfStack = books.peek();
			System.out.println("Using peek() method: " + topOfStack);
			// empty() - check if the stack is empty or not
			boolean checkIfEmpty = books.empty();
			System.out.println("Using empty() method: " + checkIfEmpty);

			books.push("Maths");
			books.push("M4");
			System.out.println("Displaying Books: " + books);
			// search() - It returns the object location from the top of the stack. If it
			// returns -1, it means that the object is not on the stack.
			int location = books.search("Maths");
			System.out.println("Location of Maths book : " + location);

			// pop() - Removes the object at the top of this stack and returns thatobject as
			// the value of this function
			String removeBook=books.pop();
			System.out.println("Using pop(): "+removeBook);
			System.out.println();
			
			System.out.println("Display stack elements: ");
			Iterator<String> iteration = books.iterator();
			while(iteration.hasNext()) {
				System.out.println(iteration.next()+" ");
			}
		}

	}

}
