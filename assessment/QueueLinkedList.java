package assessment;

//class Node {
//    int data;
//    Node next;
//
//    public Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}

public class QueueLinkedList {
    private Node front;
    private Node rear;

    public QueueLinkedList() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println(data + " enqueued to queue");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty...");
            return -1;
        } else {
            int dequeuedValue = front.data;
            front = front.next;

            if (front == null) {
                rear = null;
            }

            return dequeuedValue;
        }
    }

    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue() + " dequeued from queue");

        queue.enqueue(40);
        queue.enqueue(50);

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue() + " dequeued from queue");
        }

        System.out.println(queue.dequeue() + " dequeued from queue");
    }
}
