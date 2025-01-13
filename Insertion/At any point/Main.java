// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Main {
    Node head;
    
    public void insertAtBeg(int data){
        
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
        public void insertAtPos(int data, int position) {
        // Handle positions out of bounds
        if (position < 0) {
            System.out.println("Invalid position: cannot insert at negative index");
            return;
        }

        // Create the new node
        Node newNode = new Node(data);

        // Handle insertion at the beginning (position 0)
        if (position == 1) {
            insertAtBeginning(data);
            return;
        }

        // Traverse to the node at the position before the insertion point
        Node current = head;
        for (int i = 1; i < position && current != null; i++) {
            current = current.next;
        }

        // Check if the position is beyond the existing list length
        if (current == null) {
            System.out.println("Invalid position: position is after the end of the list");
            return;
        }

        // Insert the new node after the current node
        newNode.next = current.next;
        current.next = newNode;
    }
    public static void main(String[] args) {
        Main list = new Main();
        list.insertAtBeg(5);
        list.insertAtBeg(3);
        list.insertAtBeg(1);
        
        System.out.print("Linked List...");
        list.printList();
    }

}
