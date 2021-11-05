package revature;

/* create classes for node with data and pointer attributes
*  */

public class LinkedList {
    // create node class
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // node head and tail
    public Node head = null;
    public Node tail = null;

    // add new node to list
    public void addNode(int data) {
        // initialize node
        Node newNode = new Node(data);
        // check if list is empty
        if(head == null) {
            // head and tail points to new node
            head = newNode;
            tail = newNode;
        }
        else {
            // newNode is added after tail
            tail.next = newNode;
            //newNode becomes new tail
            tail = newNode;
        }
    }
    // displays all nodes in list
    public void display() {
        // Node current points to head
        Node current = head;

        if(head == null) {
            System.out.println("This list is empty");
            return;
        }

        System.out.println("Nodes of linked list");
        while(current != null) {
            // print nodes by incrementing pointer
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println(); // line break
    }

    public static void main(String[] args) {
        LinkedList sList = new LinkedList();

        // add nodes to list
        sList.addNode(10);
        sList.addNode(20);
        sList.addNode(30);
        sList.addNode(40);

        // display the list
        sList.display();
    }
}
