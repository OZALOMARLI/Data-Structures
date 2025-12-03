
public class Stack {

    int size;
    int count;

    Node top;  //Pointer to the top node (Yo can think this as Node head)

    public Stack(int size) {
        this.size = size;
        count = 0;
        top = null;
    }

    void push(int data1) {
        Node element = new Node(data1);

        if (isFull()) {
            System.out.println(" Stack is full, can't add more ! ");
        } else {
            if (isEmpty()) {
                top = element;
                System.out.println(top.data + "Added as the first element to Stack ");
            } else {
                element.next = top;
                top = element;
                System.out.println(top.data + " Added to Stack ");

            }
            count++;
        }

    }

    void pop() {

        if (isEmpty()) {
            System.out.println("Stack is empty,there is no element we can remove");
        } else {
            System.out.println(top.data + " Removed ");
        }
        count--;

    }

    void print() {

        if (isEmpty()) {
            System.out.println("Stack is empty,there is no element we can show"); 
        }else {
            Node temp = top;

            System.out.println("Datas in stack : \n");
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println("\n");
        }

    }

    void showTop() {
        if (isEmpty()) {
            System.out.println(" Stack is empty "); 
        }else {
            System.out.println("The data of top : " + top.data);
        }
    }

    boolean isFull() {
        return count == size;
    }

    boolean isEmpty() {
        return count == 0;

    }

}
