/**
 * This class contains all the methods to help manipulate the KeyedElement list.
 * 
 * @author Mikolaj Wieczorek
 * 
 */

public class LinkList {

	// firstElement is the head of LinkedList
	private KeyedElement firstElement; 

	//Setting firstElement to null.
	public LinkList() {
		// firstElement is always null
		firstElement = null;
	}

	/**
	 * Method: add adds node (KeyedElement is the node) at the beginning of the list with value and payLoad
	 * 
	 * @param position
	 * @param payLoad
	 */

	public void add(int position, int payLoad) {
		// e is the current object
		KeyedElement e = new KeyedElement(position, payLoad);
		// sets next element
		e.setNext(firstElement);
		firstElement = e;
	}

	
	/**
	 * Method: find returns boolean if number is in Linked list (TRUE vs. FALSE)
	 * 
	 * @param value
	 * @return boolean True or False
	 */
	public boolean find(int value) {
		KeyedElement e = firstElement;

		while (e != null)// while not in front
		{
			if (e.isKey(value))// if key is found then true else false
			{
				return true;
			}
			e = e.getNext();// cycles to no next number
		}
		return false;
	}
	
	/**
	 * Method: size returns total size of linked list.
	 * @return count
	 */
	
	public int size() {
		int count = 0;
		// e is current iteration
		KeyedElement e = firstElement;
		// while e is not at the front
		while (e != null) {
			++count;// counts total and sets next
			e = e.getNext();
		}
		// return total size
		return count;
	}
	
	/**
	 * Method: toString will print out the linked list.
	 * @return total 
	 */
	public String toString() {
		if (firstElement == null) // checks if list is empty
		{
			return "<>";
		} else {
			// prints the "key" and the corresponding "payLoad" in linked list
			String total = "<" + firstElement.getKey() + "-" + firstElement.getPayload();
			KeyedElement e = firstElement.getNext();
			// cycles through list to print result of both "key" and "payLoad"
			while (e != null) {
				total += ", " + e.getKey() + "-" + e.getPayload();
				e = e.getNext();
			}
			total += ">";
			return total;
		}
	}

	/**
	 * Method: remove removes the values at the position location. 
	 * For example, if in an array a position number 4 holds a number 10, if I pass 4, it will remove number 10.
	 * 
	 * @param position
	 */
	public void remove(int position) {
		if (position == 0) // checks if the position is empty
		{
			firstElement = firstElement.getNext();
		} else {
			KeyedElement e = firstElement;
			// Cycles through position location up until before the position number
			for (int i = 0; i < position - 1; i++) {
				e = e.getNext();
			}
			// shifts the current value so it gets overwritten
			e.setNext(e.getNext().getNext());
			

		}
	}

	
	/**
	 * Method get gets the value based on the position location that's passed.
	 * 
	 * @param position
	 * @return returns value at position location
	 */
	public int get(int position) {
		// checks if its empty
		if (position <= 0)
			return -1;

		KeyedElement e = firstElement.getNext();
		// cycles until index location
		for (int i = 1; i < position; i++) {
			if (e.getNext() == null)// check if number is null
				return -1;
			e = e.getNext();
		}
		return e.getPayload();// returns value at position location
	}

	/**
	 * Method FindPosition finds position based on random number passed.
	 * @param myposition
	 * @return current position location or -1
	 */
	public int FindPosition(int myposition) {
		int position = 0;
		KeyedElement e = firstElement;// e is current iteration

		while (e != null) // runs while not at the top
		{
			if (e.isKey(myposition) == true)// if the value matches then return current position
			{
				return position;
			}
			position++;// cycles through
			e = e.getNext();// cycles to next
		}
		return -1;
	}

	/**
	 * Method: sort sorts the linked list using bubble sort type
	 */
	public void order() {
		boolean check;// boolean will check if true for do while
		do {
			KeyedElement e = firstElement;// e is current
			KeyedElement previous = null;// prev is always null
			KeyedElement next = firstElement.getNext();// next is the next node ahead of e
			check = false;// boolean should be false to run

			while (next != null) // while not at the head
			{
				if (e.getKey() > next.getKey()) // runs when one index is larger then other
				{
					check = true;

					if (previous != null) // when prev not null then shift forward
					{
						KeyedElement sig = next.getNext();
						previous.setNext(next);
						next.setNext(e);
						e.setNext(sig);
					} else // otherwise the first element is now next
					{
						KeyedElement sig = next.getNext();
						firstElement = next;
						next.setNext(e);
						e.setNext(sig);
					}
					// shifts forward prev and next
					previous = next;
					next = e.getNext();
				} else {
					// shifts forward the statements
					previous = e;
					e = next;
					next = next.getNext();
				}
			}
		} while (check);
	}


}