
public class Main {

	public static void main(String[] args) {

		// Let's create new nodes in memory first:
		Node node1 = new Node();
		Node node2 = new Node();
		Node node3 = new Node();

		// In the following lines we can define datas of all nodes, for example:
		node1.data = 1;
		node2.data = 2;
		node3.data = 3;

		// We defined the data with the data available in Node.java (Node Object)

		System.out.println(node1.data);
		System.out.println(node2.data);
		System.out.println(node3.data);
		
		/*-----------------------------------------------------------------------------------------------------------------------------------*/
		
		/*
		 * Now we'll establish the connections between the nodes. 
		  The .next used in this connection comes from the Node next definition within our Node.java object.
		 
		 * We've defined a "next" node of type Node within our Node.java object, and
		  this will represent the connection to our next object. 
		 
		 * You'll understand how to establish this connection below. 
		  If not, go back to the previous "CreatingNode"
		  folder and examine the image I've added.
		 */
		
		node1.next = node2;
		node2.next = node3;
		node3.next = null;

		/*
		 * The reason the final node is bound to null is because it's the last node and isn't bound to any object. 
		 * You'll see what I mean in the Head and Tail sections I'll cover in the next repos.
		 */
		
/*-----------------------------------------------------------------------------------------------------------------------------------*/
	
		Node temp =node1;
		
		while (temp!=null) 
		{
			System.out.println(temp.data);
			
			temp=temp.next;
			
			/*
			 * Now, we're defining the traversing operation. 
				Here, we've defined a traversing element called temp, and we want it to traverse all nodes unless this element is equal to null.
				 At the very end, we want it to print output. The next operation we added at the end allows for traversing between nodes.
			 */
		}
	}
                                        /* (: Thanks for reading. Keep  Working Hard :) */
}
