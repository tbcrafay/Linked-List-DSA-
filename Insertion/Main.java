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
    
    public static void main(String[] args) {
        Main list = new Main();
        list.insertAtBeg(5);
        list.insertAtBeg(3);
        list.insertAtBeg(1);
        
        System.out.print("Linked List...");
        list.printList();
    }

}
