public class Application {

	public static void main(String[] args) {
		// Create a new Stack object with a capacity of 5.
		Stack stack = new Stack(5);

		// Push 5 elements onto the stack.
		stack.push(4);
		stack.push(2);
		stack.push(5);
		stack.push(9);
		stack.push(10);

		// Pop two elements from the stack and print them.
		System.out.println("Removed Element is : " + stack.pop());
		System.out.println("Removed Element is : " + stack.pop());
	}

}
