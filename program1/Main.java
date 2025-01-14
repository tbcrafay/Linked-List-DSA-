class Student {
    String name;
    int roll_no;
    Student next;

    Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
        this.next = null;
    }
}

class Main {
    Student head;

    // Insert a new student at the beginning of the list
    public void insertAtBeginning(String name, int roll_no) {
        Student student = new Student(name, roll_no);
        student.next = head; // Link the new node to the current head
        head = student; // Update the head to point to the new node
    }

    // Insert a new student at a specific position
    public void insertAtPosition(String name, int roll_no, int position) {
        if (position < 0) {
            System.out.println("Invalid position: cannot insert at negative index");
            return;
        }

        Student student = new Student(name, roll_no);

        if (position == 0) {
            insertAtBeginning(name, roll_no);
            return;
        }

        Student current = head;
        for (int i = 1; i < position && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Invalid position: position is after the end of the list");
            return;
        }

        // Fix: Link the new node after the current node
        student.next = current.next;
        current.next = student;
    }

    // Display all students in the list
    public void display() {
        Student temp = head;
        while (temp != null) {
            System.out.println("Name: " + temp.name + ", Roll No: " + temp.roll_no);
            temp = temp.next;
        }
    }

    // Search for a student by roll number
    public Student search(int roll_no) {
        Student temp = head;
        while (temp != null) {
            if (temp.roll_no == roll_no) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
       public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete from beginning.");
            return;
        }

        head = head.next; // Update head to point to the second node
    }

    public static void main(String[] args) {
        Main studentList = new Main();

        studentList.insertAtBeginning("rafay", 71);
        studentList.insertAtBeginning("Arham", 89);
        studentList.insertAtPosition("Student", 11, 0);

        System.out.println("Student Records (Before Deletion):");
        studentList.display();

        studentList.deleteAtBeginning();

        System.out.println("Student Records (After Deletion):");
        studentList.display();
    }
}
