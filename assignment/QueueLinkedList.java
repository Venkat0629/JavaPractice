package assignment;//class Node {
//    int data;
//    Node next;
//
//    public Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}

class Queue {
    private Node front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    public void enQueue(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            this.front = this.rear = newNode;
            return;
        }
        this.rear.next = newNode;
        this.rear = newNode;
    }

    public void deQueue() {
        if (isEmpty()) {
            System.out.println("assignment.Queue is empty, cannot dequeue");
            return;
        }

        Node temp = this.front;
        this.front = this.front.next;

        if (this.front == null) {
            this.rear = null;
        }

        System.out.println("Dequeued element: " + temp.data);
    }

    public boolean isEmpty() {
        return (this.front == null);
    }

    public void display() {
        Node current = this.front;
        if (current == null) {
            System.out.println("assignment.Queue is empty");
            return;
        }

        System.out.print("assignment.Queue: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class QueueLinkedList {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);

        queue.display();

        queue.deQueue();
        queue.display();
        queue.deQueue();
        queue.display();

        queue.deQueue();
        queue.display();
    }
}
