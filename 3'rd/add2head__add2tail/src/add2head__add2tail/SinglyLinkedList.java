package add2head__add2tail;

public class SinglyLInkedList {
	
	Node head = null;
	Node tail = null;
	
	void add2Head(int data) {
		Node element = new Node();
		element.data=data;
		
		//First, we check whether there is any element in the list.
		if (head==null) {
			
			element.next=null;
			head=element;
			tail=element;	
			System.out.println(" The list created and first element added "); 
		}
		
		/*
		 * If there is an element, we add it before the head and use the .next operation to add it to the head. 
		 * Then, we define this element as the head.
		 */
		
		else {
			element.next=head;
			head=element;
			System.out.println(" Element added to head ");
		}}
		
		void add2Tail(int data) {
			Node element = new Node();
			element.data=data;
			
			//Here we provide controls again
			if (head==null) {
				
				element.next=null;
				head=element;
				tail=element;	
				System.out.println(" The list created and first element added ");
			}
			/*
			 * If there's an element in the list, we add the new tail as follows: 
			 * First, we need to define the .next of the new element as null, because this element will be the new tail.
			 * We then bind the .next of the tail we normally define to this element, and finally, we define this element as the tail.
			 */
			
			else {
				
				element.next=null; 
				tail.next=element; 
				tail=element;
				System.out.println(" Element added to tail ");
			}	
	}
		
}
