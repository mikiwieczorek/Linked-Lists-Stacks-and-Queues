public class QueueListElement<E> {

	//Data members
	private E reference;
	private QueueListElement<E> next;

	//Constructor
	public QueueListElement(E ref) {
		this.reference = ref;
	}

	// Add reference to element
	void setNext(QueueListElement<E> e) {
		next = e;
	}

	// Find next element in list
	QueueListElement<E> getNext() {
		return next;
	}

	// Returns reference to object represented by this element
	E getData() {
		return reference;
	}
}
