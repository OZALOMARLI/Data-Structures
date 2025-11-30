public class Stack {

	int array[]; // Array to hold the stack
	int size;    // Capacity of the stack
	int index;   // Index of the top element of the stack

	// Constructor: Called when a stack is created.
	public Stack(int size) {
		this.size = size;           // The size of the stack is determined.
		array = new int[size];      // An array of the specified size is created.
		index = -1;                 // The index is set to -1 because the stack is initially empty.
	}

	// Adds a new element to the stack (push).
	void push(int data) // add
	{		
		// Checks if the stack is full.
		if (isFull()) {
			System.out.println("Stack is Full!"); // Prints a warning message if the stack is full.
		} 
		else {
			index++;                    // Increments the index.
			array[index] = data;        // Adds the new element to the top of the array.
			System.out.println("push() : " + array[index]); // Prints the added element to the screen.
		}
	}

	// Removes an element from the stack (pop).
	int pop() {
		// Checks if the stack is empty.
		if (!isEmpty()) {
			return array[index--]; // Returns the top element and decrements the index.
		} 
		else {
			System.out.println("The Array is Empty!"); // Prints a warning message if the stack is empty.
			return -1; // Returns -1 to indicate an error.
		}
	}

	// Checks if the stack is full.
	boolean isFull() {
		return (index == size - 1); // If the index is equal to the last index of the array, the stack is full.
	}

	// Checks if the stack is empty.
	boolean isEmpty() {
		return (index == -1); // If the index is -1, the stack is empty.
	}
}
