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

    // Method to add an element to the queue
    public void enQueue(int data) {
        Node newNode = new Node(data);

        // If queue is empty, then new node is both front and rear
        if (isEmpty()) {
            this.front = this.rear = newNode;
            return;
        }

        // Add the new node at the end of queue and change rear
        this.rear.next = newNode;
        this.rear = newNode;
    }

    // Method to remove an element from queue
    public void deQueue() {
        // If queue is empty, return null
        if (isEmpty()) {
            System.out.println("assignment.Queue is empty, cannot dequeue");
            return;
        }

        // Store the previous front and move front one node ahead
        Node temp = this.front;
        this.front = this.front.next;

        // If front becomes null, then change rear also as null
        if (this.front == null) {
            this.rear = null;
        }

        System.out.println("Dequeued element: " + temp.data);
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return (this.front == null);
    }

    // Method to print the queue
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

        queue.display(); // Output: assignment.Queue: 10 20 30

        queue.deQueue();
        queue.display(); // Output: assignment.Queue: 20 30

        queue.deQueue();
        queue.display(); // Output: assignment.Queue: 30

        queue.deQueue();
        queue.display(); // Output: assignment.Queue is empty
    }
}
