public class Application {

	public static void main(String[] args) {
		Stack stack = new Stack(5);

		stack.push(4);
		stack.push(2);
		stack.push(5);
		stack.push(9);
		stack.push(10);
		System.out.println("Removed Element is : " + stack.pop());
		System.out.println("Removed Element is : " + stack.pop());

	}

}
