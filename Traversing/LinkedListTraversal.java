// Improved code with explanations

class Node {
    int data;
    Node next = null;

    public Node(int data) {
        this.data = data;
    }
}

public class LinkedListTraversal {
    Node head;

    public static void main(String[] args) {
        LinkedListTraversal list = new LinkedListTraversal();

        // Create nodes
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        // Build the linked list manually
        list.head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        System.out.print("Linked List: ");
        list.traverse(list.head);
    }

    public void traverse(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
