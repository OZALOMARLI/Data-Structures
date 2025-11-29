public class Stack {

	int array[];
	int size;
	int index;

	public Stack(int size) {
		this.size = size;
		array = new int[size];
		index = -1;
	}

	void push(int data) // add
	{

		if (isFull()) {
			System.out.println("Stack if Full! ");
		} else {

			index++;
			array[index] = data;
			System.out.println("push () : " + array[index]);
		}
	}

	int pop() {
		if (!isEmpty()) {
			return array[index--];

		} else {
			System.out.println("An Array is Empty! ");
			return -1;
		}

	}

	boolean isFull() {
		return (index == size - 1);
	}

	boolean isEmpty() {
		return (index == -1);
	}

}
