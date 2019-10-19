
/**
 * This class implements a test program of my QueueList<E> (implementation) as well as built-in Java's interface Queue<E>.
 * It also compares the results of peek and remove between the two.
 * @author Mikolaj Wieczorek
 */

import java.util.*;

public class TestQueue<E> {
	public static void main(String[] args) {

		/*
		 * FIFO (First-In-First-Out) Here, my QueueList<E> reads left to right, meaning
		 * that the top (head) of the list is the the first object to the left. When
		 * removing objects, my QueueList<E> removes from the top, meaning it removes
		 * from the left side as we see it displayed (FIFO).
		 */
		int value = 1;
		Random number = new Random();
		// Queue List is essentially a LinkedList
		QueueList<Integer> Queue = new QueueList();
		System.out.println("***QueueList and LinkedList Testing***");
		System.out.println("");
		System.out.println("**QueueList Testing**");

		for (int i = 1; i <= 25; i++) {
			// it generated a random list of integers between 0 and 8
			// this is for the number being loaded
			int n = number.nextInt(8) + 1;
			for (int j = 0; j < n; j++) {
				// Uncomment the 2 lines below if want values randomly generated and pushed into
				// the list.
				// int value1 = number.nextInt(11);
				// Queue.add(value1);

				// Comment the 2 lines below if want values randomly generated and pushed into
				// the list.
				Queue.addLast(value);
				// After the value is added. We add 1 so that there is a sequential order of
				// integers in the list.
				value = value + 1;
			}
			System.out.println("Iteration" + " " + i + " " + "Add Count=" + n);
			System.out.println("Post-Add:" + Queue.toString());
			// FIFO, head is first and head is removed first
			System.out.println("Head of the Queue is: " + Queue.peek());
			System.out.println("Size of the Queue is: " + Queue.size());

			// Create a r that has generated a list of integers between 0 and 7 for the
			// remove
			// function (removing object at the top of the stack)
			// Max is 7 so the remove function doesn't empty the list (r < n in this case)
			int r = number.nextInt(7) + 1;
			// random number of removing the head of the list
			System.out.println("RemoveCount=" + r);
			try {

				// Random number of removing cycled through from value 0 to less than p (whose
				// max is
				// 7)
				for (int random = 0; random < r; random++) {
					Queue.remove();

				}
			}

			catch (NoSuchElementException e) {
				System.out.println("Error: List Empty");

				// Print an empty line since if exception caught, the iteration i ends with the
				// error message.
				System.out.println("");

				// Continue to print next iterations
				continue;
			}

			System.out.println("Post-Remove:" + Queue.toString());
			System.out.println("Head of the Queue is:" + Queue.peek());
			System.out.println("Size of the Queue is: " + Queue.size());
			System.out.println("");
		}

		System.out.println("**Java's Class Queue<E>**");
		System.out.println("");
		// Value is already declared. Reassigning 1 to it.
		value = 1;

		Queue<Integer> JavaQueue = new LinkedList<>();
		for (int i = 1; i <= 25; i++) {
			int n = number.nextInt(10) + 1;// load random num between 1-10
			for (int j = 0; j < n; j++) {

				// Uncomment the 2 lines below if want values randomly generated and pushed into
				// the list.
				// int value1 = number.nextInt(11);
				// JavaQueue.add(value1);

				// Comment the 2 lines below if want values randomly generated and pushed into
				// the list.
				JavaQueue.add(value);
				// After the value is added. We add 1 so that there is a sequential order of
				// integers in the list.
				value = value + 1;

			}
			System.out.println("Iteration" + " " + i + " " + "Add Count=" + n);
			System.out.println("Post-Add:" + JavaQueue);
			// FIFO, head is first and head is removed first
			System.out.println("Head of the Queue is: " + JavaQueue.peek());
			System.out.println("Size of the Queue is: " + JavaQueue.size());

			try {
				// Create a jr that has generated a list of integers between 0 and 7 for the
				// remove
				// function (removing object at the top of the stack)
				// Max is 7 so the remove function doesn't empty the list (jr < n in this case)
				int jr = number.nextInt(7) + 1;
				// random number of removing the head of the list
				System.out.println("RemoveCount=" + jr);

				for (int random = 0; random < jr; random++)
					// It is popping/removing objects from the right side since the top was the last
					// number reading left to right.
					JavaQueue.remove();

				// int removedN = queue.remove();//removes the head num.
				// System.out.print("The number(s):" + queue.remove() + " were removed");

			} catch (NoSuchElementException ex) {
				System.out.println("Error: List Empty");
				// Print an empty line since if exception caught, the iteration i ends with the
				// error message.
				System.out.println("");
				// Continue to print next iterations
				continue;
			}

			System.out.println("Post-Remove:" + JavaQueue);
			System.out.println("Head of the Queue is:" + JavaQueue.peek());
			System.out.println("Size of the Queue is: " + JavaQueue.size());
			System.out.println("");

		}

	}

}