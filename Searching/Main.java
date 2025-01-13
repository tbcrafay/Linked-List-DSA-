class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head; // Head of the list

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public Node search(int item) {
        Node current = head; // Start from the beginning of the list

        while (current != null) {
            if (current.data == item) {
                return current; // Found the item, return the node
            }
            current = current.next; // Move to the next node
        }

        return null; // Item not found
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBeginning(5);
        list.insertAtBeginning(3);
        list.insertAtBeginning(1);

        System.out.print("Linked List: ");
        list.printList();

        Node foundNode = list.search(3); 
        if (foundNode != null) {
            System.out.println("Element 3 found in the list.");
        } else {
            System.out.println("Element 3 not found in the list.");
        }
    }
}
