/**
 * This class implements all methods of Java's Queue<E>.
 * The implementation is provided through my QueueList<E> class.
 */

/*
Queue List does the same methods as the native
Java Queue methods for LinkedList

These are meant to demonstrate and example of creating 
Queue methods then running Javas <LinkedList> Class

*/

import java.util.*;

public class QueueList<E> {

	// size of the stack
	public int size;
	// first element/top of the stack
	public QueueListElement<E> head;

	// Setting the first element (head) to null
	public QueueList() {
		head = null;
		size = 0;
	}

	/**
	 * Method: empty Tests whether stack is empty.
	 * 
	 * @return boolean: True/False
	 */
	public boolean empty() {
		return head == null;
	}

	/**
	 * Method: add: Adds object to top of queue list.
	 * 
	 * @param obj
	 */
	public void add(E obj) throws IllegalStateException // insert at the beginning
	{
		// Pushes a n number.
		QueueListElement<E> add = new QueueListElement(obj);
		add.setNext(head);
		head = add;
		size++;
	}

	/**
	 * Method: addLast: appends the specified element to the end of the list. So we
	 * have the numbers displayed from left to right and the head is the first one
	 * in, and later, when removing, it's the first one out.
	 * 
	 * @param obj
	 */
	public void addLast(E obj) throws IllegalStateException {
		if (head == null)// check if null
			add(obj);
		else {
			QueueListElement<E> e = head;
			while (e.getNext() != null)
				e = e.getNext();

			e.setNext(new QueueListElement(obj));
			size++;
		}
	}

	/**
	 * Method: remove removes the element at the head
	 * 
	 * @return
	 * @throws NoSuchElementException
	 */

	public E remove() throws NoSuchElementException {
		QueueListElement<E> e = head;
		// check is list is empty
		if (empty()) {
			// if list empty it throws exception since we can't remove anything
			throw new NoSuchElementException("Error: List is Empty");
		}
		// else, get next element

		head = head.getNext();
		// decrements
		size--;
		return e.getData();
	}

	/**
	 * Method: peek gets object at top of queue without removing it from there
	 * returns object. If none, returns null.
	 * 
	 * @return
	 */

	public E peek() {
		QueueListElement<E> e = head;
		if (empty() == true)
			return null;

		else
			return e.getData();
	}

	/**
	 * 
	 * Method: toString will print out the queue.
	 * 
	 * @return total
	 */

	public String toString() {
		if (head == null) {
			return "[]";
		} else {
			// prints the "key" and the corresponding "payLoad" in linked list
			String total = "[" + head.getData();
			QueueListElement<E> e = head.getNext();
			// cycles through list to print result of both "key" and "payLoad"
			while (e != null) {
				total += " " + e.getData();
				e = e.getNext();
			}
			total += "]";
			return total;
		}
	}

	/**
	 * Method: size returns total size of the list.
	 * 
	 * @return count
	 */

	/*
	 * { int count = 0; // e is current iteration QueueListElement<E> e = head; //
	 * while e is not at the front while (e != null) { ++count;// counts total and
	 * sets next e = e.getNext(); } // return total size return count; }
	 */
	// return size of queue
	public int size() {
		return size;
	}

}