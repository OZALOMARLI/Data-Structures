public class SinglyLinkedList {
	// Assuming Node class is defined elsewhere (e.g., class Node { int data; Node next; })
	
	Node head = null;
	Node tail = null;
	private int size = 0; // Tracks the current number of elements for O(1) size check
	
	/**
	 * Inserts a new node at the specified index.
	 * Prints an error message and returns if the index is invalid.
	 * @param index The position (0 to size) where the element should be inserted.
	 * @param data The data for the new node.
	 */
	void addByIndex(int index, int data) {
		
		// 1. Boundary Check: Handle Invalid Index (Your preferred style: print and return)
		// The index is invalid if it's negative or greater than the current size.
		if (index < 0 || index > size) {
			System.out.println("ERROR: Invalid index. Cannot insert element at index " + index + ". Valid range is [0, " + size + "]");
			return; // Exit the method without inserting.
		}
		
		Node element = new Node();
		element.data = data;
		
		// 2. Insert at Head (index == 0)
		if (index == 0) {
			
			element.next = head;
			head = element;
			
			// If the list was empty before insertion, the new element is also the tail.
			if (tail == null) {
				tail = element;
			}
			System.out.println("An element was added to the queue according to the entered index (Head) at " + index + ".");
			size++;
			return;
		}
		
		// 3. Insert in Middle or at Tail (index > 0)
		
		// We need a pointer to locate the node *before* the insertion point.
		Node current = head;
		
		// Traverse the list until 'current' reaches the (index - 1) position.
		// This loop is safe because the index was checked against 'size'.
		for (int i = 0; i < index - 1; i++) {
			current = current.next; 
		}
		
		// 'current' is now the node just before the desired insertion point.
		
		// New node's 'next' points to what 'current' was pointing to.
		element.next = current.next;
		
		// 'current' node's 'next' now points to the new node.
		current.next = element;
		
		// 4. Tail Update Check
		// If the new element's 'next' is null, it means it was inserted at the end.
		if (element.next == null) { 
			tail = element;
			System.out.println("An element was added to the queue according to the entered index (Tail) at " + index + ".");
		} else {
			System.out.println("An element was added to the queue according to the entered index (Middle) at " + index + ".");
		}
		
		size++; // Increment the size of the list.
	}
}
