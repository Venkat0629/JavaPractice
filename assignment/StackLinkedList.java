package assignment;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    // Method to add an element to the stack
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = this.top;
        this.top = newNode;
    }

    // Method to remove and return the top element from stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("assignment.Stack is empty, cannot pop");
            return Integer.MIN_VALUE;
        }
        int popped = this.top.data;
        this.top = this.top.next;
        return popped;
    }

    // Method to return the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("assignment.Stack is empty, cannot peek");
            return Integer.MIN_VALUE;
        }
        return this.top.data;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (this.top == null);
    }

    // Method to print the stack
    public void display() {
        Node current = this.top;
        if (current == null) {
            System.out.println("assignment.Stack is empty");
            return;
        }

        System.out.print("assignment.Stack: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class StackLinkedList {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display(); // Output: assignment.Stack: 30 20 10

        System.out.println("Popped element: " + stack.pop()); // Output: Popped element: 30
        System.out.println("Top element: " + stack.peek());   // Output: Top element: 20

        stack.display(); // Output: assignment.Stack: 20 10
    }
}
