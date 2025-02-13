package assessment.java;

public class StackArray {
    private int maxSize;
    private int[] stackArray;
    private int top;


    public StackArray(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }


    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full...");
        } else {
            stackArray[++top] = value;
        }
    }


    public int pop() {
        if (isEmpty()) {
            return -1;
        } else {
            int poppedValue = stackArray[top--];
            return poppedValue;
        }
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        } else {
            return stackArray[top];
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        StackArray stack = new StackArray(5);


        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek());
        System.out.println(stack.pop() + " popped from stack");
        System.out.println("Top element is: " + stack.peek());

        stack.push(40);
        stack.push(50);
        stack.push(60);
    }
}
