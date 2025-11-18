
public class SinglyLinkedList {
	Node head = null;
	Node tail = null;		
			void addByIndex(int index , int data) {
				Node element = new Node();
				element.data=data;
				
				if (head==null && index==0) {
					
					element.next=null;
					head=element;
					tail=element;	
					System.out.println(" The list created and first element added ");
				}
				
				else if (head != null && index==0){
					element.next=head;
					head=element;
					System.out.println(index + " An element was added to the queue according to the entered index ");
				}
				
				else {
					
					int n =0;
					Node temp = head;
					Node temp2 = head;
					while (temp!=null) {
						
						n++;
						temp=temp.next;
					}
					
					if (n==index) {
						
						temp2.next=element;
						element.next=temp;
						System.out.println("An element was added");
						
					}
					else {
						temp=head;
						int i=0;
						while ( i!=index ) {
							temp2=temp;
							temp=temp.next;
							i++;
						}
						
						temp2.next=element;
						element.next=temp;
						
						System.out.println( " An element was added to the queue according to the entered index " );
					}
				}	
	}
		
}
	


