/**
 * This class represents the object pairing a key with a payLoad value.
 * 
 * @author Mikolaj Wieczorek
 *
 */

//searches based upon some key value
public class KeyedElement {

	// key is index location
	private int key;

	// payLoad is an object value stored
	private Integer payLoad;

	// next iterates to next element in LinkedList
	private KeyedElement next; // type is the same as class type, reference pointing at the next one in the
								// list

	/**
	 * Constructor.
	 * 
	 * @param key int value for uniquely identifying the elements.
	 * @param Integer value represents the data payLoad.
	 * @return The number of objects contained.
	 */

	public KeyedElement(int key, Integer value) // doesn't know anything bout the list
	{
		this.key = key;
		payLoad = value;
		next = null;
	}

	/**
	 * Method: getKey returns the key field from this object
	 * 
	 * @return Key field (int) found in this object
	 */

	int getKey() {
		return key;

	}

	// Return the payLoad object (an Integer object) found in this object
	Integer getPayload() {
		return payLoad;

	}

	// Find any next KeyedElement relative to this object. If none, it returns null.
	// gives me ref to the next item in the list
	KeyedElement getNext() {
		return next;
	}

	// Link this object to the next KeyElement.
	void setNext(KeyedElement next) {
		this.next = next;
	}

	// Compare this object's key value to an input int value, returning true if
	// found.
	boolean isKey(int value) {
		if (key == value)
			return true;
		else
			return false;

	}
}
