package add2head__add2tail;

public class Main {

	public static void main(String[] args) {
		
		SinglyLinkedList list = new SinglyLinkedList();
		
		list.add2Head(10);
		list.add2Head(110);
		list.add2Tail(32);
		list.add2Tail(99);
		
		System.out.println("The element in head :" + list.head.data);
		System.out.println("The element in tail :" + list.tail.data);

	}

}
