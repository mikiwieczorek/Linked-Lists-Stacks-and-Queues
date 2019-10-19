
/**
 * This class implements a test program of my StackList<E> as well as built-in Java's class Stack<E>
 * @author Mikolaj Wieczorek
 */

import java.util.Random;
import java.util.Stack;
import java.util.*;

public class TestStackList<E> {
	public static void main(String[] args) {

		/*
		 * Here, my StackList<E> reads right to left, meaning that the top of the list
		 * is the the first object to the left as we see it. When removing objects, my
		 * StackList<E> removes from the top, meaning it removes from the left side as
		 * we see it displayed.
		 * 
		 * LIFO (Last-In-First-Out)
		 */
		// Declare the value that will be added to the list.
		int value = 1;
		// Random number generator
		Random number = new Random();
		StackList<Integer> list = new StackList();
		System.out.println("***Stack and StackList Testing***");
		System.out.println("");
		System.out.println("**StackList Testing**");
		for (int i = 1; i <= 25; i++) {
			// it generated a random list of integers between 0 and 8
			// this is for the number being loaded

			int n = number.nextInt(8) + 1;
			for (int j = 0; j < n; j++) {

				// Uncomment the 2 lines below if want values randomly generated and pushed into
				// the list.
				// int value1 = number.nextInt(11);
				// list.push(value1);

				// Comment the 2 lines below if want values randomly generated and pushed into
				// the list.
				list.push(value);
				// After the value is pushed. We add 1 so that there is a sequential order of
				// integers in the list.
				value = value + 1;

			}
			System.out.println("Iteration" + " " + i + " " + "Push Count=" + n);
			System.out.println("Post-Push:" + list.toString());
			//System.out.println("Number at the top of the list is: " + list.peek());
			System.out.println("Head of the Stack is: " + list.peek());
			System.out.println("Size of the Stack is: " + list.size());

			// Create a p that has generated a list of integers between 0 and 7 for the pop
			// function (removing object at the top of the queue)
			// Max is 7 so the pop function doesn't empty the list (p < n in this case)
			int p = number.nextInt(7) + 1;
			// random number of popping/removing from the top of the list
			System.out.println("PopCount:" + p);
			try {
				// Random number of pop cycled through from value 0 to less than p (whose max is
				// 7)
				for (int random = 0; random < p; random++) {
					list.pop();
				}

				// The exception will apply when the random number to pop/remove objects from
				// stack list exceeds
				// the number of objects that is already there (Post-Push)
				// however, if we are to pop exact number of objects that the stack list has,
				// the
				// exception will not apply
				// the list will be displayed as empty brackets []
			} catch (NoSuchElementException e)

			{
				System.out.println("Error: List Empty");

				// Print an empty line since if exception caught, the iteration i ends with the
				// error message.
				System.out.println("");

				// Continue to print next iterations
				continue;

			}

			System.out.println("Post-Pop:" + list.toString());
			System.out.println("Head of the Stack is:" + list.peek());
			System.out.println("Size of the Stack is: " + list.size());
			//list.empty();
			System.out.println("");
		}

		/*
		 * Now compare theStackList to JAVA Class Stack
		 * 
		 * Here, JAVA Class Stack reads left to right, meaning that the top of the list
		 * is the the last object to the right. When removing objects, JAVA Class Stack
		 * removes from the top, meaning it removes from the right side as we see it
		 * displayed.
		 * Still, LIFO.
		 * 
		 * LIFO (Last-In-First-Out)
		 */

		System.out.println("**Java's Class Stack<E>**");
		System.out.println("");
		// Value is already declared. Reassigning 1 to it.
		value = 1;
		Stack JavaStack = new Stack();

		for (int i = 1; i <= 25; i++) {
			int n = number.nextInt(8) + 1;
			for (int j = 0; j < n; j++) {

				// Uncomment the 2 lines below if want values randomly generated and pushed into
				// the list.
				// int random = number.nextInt(11);
				// JavaStack.push(random);

				// Comment the 2 lines below if want values randomly generated and pushed into
				// the list.
				JavaStack.push(value);
				// After the value is pushed. We add 1 so that there is a sequential order of
				// integers in the list.
				value = value + 1;

			}
			System.out.println("Iteration" + " " + i + " " + "Push Count=" + n);
			System.out.println("Post-Push:" + JavaStack.toString());
			// Number at the top of the list is the last one (to the right) when using
			// Java's class
			//System.out.println("Number at the top of the list is: " + JavaStack.peek());
			System.out.println("Head of the Queue is: " + JavaStack.peek());
			System.out.println("Size of the Queue is: " + JavaStack.size());

			try {

				// Create a jp that has generated a list of integers between 0 and 7 for the pop
				// function (removing object at the top of the stack)
				// Max is 7 so the remove function doesn't empty the list (p < n in this case)
				int jp = number.nextInt(7) + 1;
				System.out.println("PopCount:" + jp);

				// Random number of remove cycled through from value 0 to less than p (whose max
				// is
				// 7)
				for (int random = 0; random < jp; random++) {
					// It is popping/removing objects from the right side since the top was the last
					// number reading left to right.
					JavaStack.pop();
				}

				// The exception will apply when the random number to pop/remove objects from
				// stack list exceeds
				// the number of objects that is already there (Post-Push)
				// however, if we are to pop exact number of objects that the stack list has,
				// the
				// exception will not apply
				// the list will be displayed as empty brackets []
				System.out.println("Head of the Stack is:" + JavaStack.peek());
			} catch (EmptyStackException ex) {
				System.out.println("Error: List Empty");
				System.out.println("");
				
				continue;
			}

			System.out.println("Post-Pop:" + JavaStack.toString());
			
			System.out.println("Size of the Stack is: " + JavaStack.size());
			//JavaStack.empty();
			System.out.println("");

		}

	}

}