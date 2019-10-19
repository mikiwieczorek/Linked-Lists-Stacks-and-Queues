public class StackListElement<E> {
	// Data members
	private E obj;
	private StackListElement<E> next;


	// Constructor
	public StackListElement(E obj) {
		this.obj = obj;

	}

	// Add reference to element
	void setNext(StackListElement<E> e) {
		next = e;
	}

	// Find next element in list
	StackListElement<E> getNext() {
		return next;
	}
	

	// Returns reference to object represented by this element
	E getData() {
		return obj;
	}

}