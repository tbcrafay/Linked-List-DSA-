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

    public int deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty.");
            return -1; // Or throw an exception
        }

        int deletedData = head.data; 
        head = head.next; 
        return deletedData;
    }

    public int deleteAtPosition(int position) {
        if (position < 0) {
            System.out.println("Invalid position: cannot delete at negative index");
            return -1; // Or throw an exception
        }

        if (position == 0) {
            return deleteAtBeginning(); 
        }

        Node current = head;
        Node previous = null;

        for (int i = 0; i < position && current != null; i++) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Invalid position: position is beyond the end of the list");
            return -1; // Or throw an exception
        }

        int deletedData = current.data;
        previous.next = current.next;
        current.next = null;

        return deletedData;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBeginning(5);
        list.insertAtBeginning(3);
        list.insertAtBeginning(1);

        System.out.print("Linked List: ");
        list.printList();

        int deletedData = list.deleteAtBeginning();
        System.out.println("Deleted data from beginning: " + deletedData);

        System.out.print("Linked List after deleting from beginning: ");
        list.printList();

        deletedData = list.deleteAtPosition(1); 
        System.out.println("Deleted data from position 1: " + deletedData);

        System.out.print("Linked List after deleting from position 1: ");
        list.printList();
    }
}
