/**
 * This class implements all methods of Java's Stack<E>
 * @author Mikolaj Wieczorek
 */

import java.io.*;
import java.util.*;
import java.util.NoSuchElementException;

public class StackList<E> {
	// size of the stack
	public int size;
	// first element/top of the stack
	public StackListElement<E> head;

	// Setting the first element (head) to null
	public StackList() {
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
	 * Method: push: Adds (pushes) object to top of stack.
	 * 
	 * @param object
	 */

	public void push(E obj) // insert at the beginning
	{
		// pushes a n number
		StackListElement<E> add = new StackListElement(obj);
		add.setNext(head);
		head = add;
		size++;
	}

	/**
	 * 
	 * Method: pop pops element from the top of the stack. Removes object at top of
	 * stack, returns object. If none, throws EmptyStackException
	 * 
	 * @return object
	 * @throws EmptyStackException
	 */
	public StackListElement<E> pop() throws EmptyStackException {
		// check is list is empty
		if (empty()) {
			// if list empty it throws exception since we can't pop anything
			throw new NoSuchElementException("Error: List is empty");
		}

		// else, get next element
		// save it as object to return later
		StackListElement<E> object = head.getNext();
		// delete first node
		head = head.getNext();
		// decrements
		size--;
		// return the new saved item
		return object;
	}

	/**
	 * Method: peek gets object at top of stack without removing it from stack,
	 * returns object. If none, returns null.
	 * 
	 * @return
	 */

	/*public E peek() throws EmptyStackException {
		// returning whatever is the first element (header)
		StackListElement<E> e = head;
		// if empty, throwing exception
		if (empty())
			throw new NoSuchElementException("Error: List is empty");
		return e.getData();
	}*/
	
	/**
	 * Method: peek gets object at top of queue without removing it from stack
	 * returns object. If none, returns null.
	 * 
	 * @return
	 */

	public E peek() {
		StackListElement<E> e = head;
		if (empty() == true)
			return null;

		else
			return e.getData();
	}

	/**
	 * 
	 * Method: toString will print out the list.
	 * 
	 * @return total
	 */

	public String toString() {
		if (head == null) {
			return "[]";
		} else {

			String total = "[" + head.getData();
			StackListElement<E> e = head.getNext();
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
	/*{
		int count = 0;
		// e is current iteration
		StackListElement<E> e = head;
		// while e is not at the front
		while (e != null) {
			++count;// counts total and sets next
			e = e.getNext();
		}
		// return total size
		return count;
	}*/
	public int size() {
		return size;
	}

}
