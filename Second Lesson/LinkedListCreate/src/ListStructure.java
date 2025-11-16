
public class ListStructure {
	/*
	 * We need to define two elements named as "head" & "tail". 
	 * Because in linked list we need to these elements for making list. 
	 * "head" is the first element of a list, which the list begins.
	 * And tail is the last element of a list, which the list ends.
	 * "tail" should not be set to null because tail is the last element and no other element comes after it, 
	 * and because each element has a node after itself, the next of tail should be null.
	 */
	
	Node head = null;
	Node tail = null;

	void add(int x) {
		Node element = new Node(); // We add new Node (object) named as element to here
		element.data = x;
		element.next = null;
		System.out.println("");
		
		if (head == null) {

			head = element;
			tail = element;
			
			System.out.println("List was created and first element ( object/node ) was added !");
		} 
		else {
			tail.next = element;
			tail=element;
			element.next = null; //We can update tail with this way
			System.out.println(" New element ( object/node ) was added to end of the list ! ");

		}

	}
	
	void printing () {
		// Now we need to defining,  printing operation 
		if (head==null) {
			System.out.println(" The list is empty! "); 
		}
		else {
			Node temp=head;
			System.out.print("\nHead --> ");
			while ( temp!= null) {
				System.out.print( temp.data + " --> ");
				temp=temp.next;
			}
			System.out.print(" End. ");
			
		}
		
		
	};

}
