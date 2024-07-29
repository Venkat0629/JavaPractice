package assessment.java;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
    }

    public void delete(int nodeVal) {
        if (isEmpty()) {
            System.out.println("List is empty, cannot delete");
            return;
        }
        while (head != null && head.data == nodeVal) {
            head = head.next;
        }
        Node current = head;
        while (current != null && current.next != null) {
            if (current.next.data == nodeVal) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }


    public boolean isEmpty() {
        return (this.head == null);
    }


    public void display() {
        Node current = this.head;
        if (current == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class SingleLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insert(20);
        linkedList.insert(10);
        linkedList.insert(30);

        linkedList.display();

        linkedList.delete(20);

        linkedList.display();
    }
}
