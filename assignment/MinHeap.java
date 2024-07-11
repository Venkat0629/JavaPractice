package assignment;

import java.util.*;
/*
Explanation of MinHeap Class and Methods:
Class Variables and Constructor:

private List<Integer> heap;: This list (heap) holds the elements of the heap. It's initialized as an empty ArrayList in the constructor.
public MinHeap(): The constructor initializes an empty heap.
Insertion (insert method):

public void insert(int val): Adds a new element (val) to the heap.
The new element is appended to the end of the list (heap).
After insertion, heapifyUp(index) is called to maintain the heap property (parent node is smaller than child nodes).
Deletion of Minimum Element (deleteMin method):

public int deleteMin(): Removes and returns the smallest element (root) from the heap.
If the heap is empty, it throws a NoSuchElementException.
The smallest element (at index 0) is removed and replaced with the last element of the heap.
heapifyDown(0) is then called to restore the heap property starting from the root.
Heapify Up (heapifyUp method):

private void heapifyUp(int i): Ensures the heap property by moving the element at index i upwards until it satisfies the heap condition.
It compares the element with its parent and swaps them if necessary until the heap property is restored.
Heapify Down (heapifyDown method):

private void heapifyDown(int i): Ensures the heap property by moving the element at index i downwards until it satisfies the heap condition.
It compares the element with its children and swaps it with the smaller child if necessary, recursively checking subsequent levels.
Printing the Heap (printHeap method):

public void printHeap(): Prints the elements of the heap in their current order.
Main Method (Testing):

In the main method, we create an instance of MinHeap and insert several elements (3, 2, 1, 7, 8, 4, 10, 16).
We then print the heap, delete the minimum element (root), print the heap again to show the result after deletion.
 */

public class MinHeap {
    private List<Integer> heap;

    public MinHeap() {
        this.heap = new ArrayList<>();
    }

    public void insert(int val) {
        heap.add(val);
        int index = heap.size() - 1;
        heapifyUp(index);
    }

    public int deleteMin() {
        if (heap.isEmpty()) {
            throw new NoSuchElementException("Heap is empty");
        }
        int min = heap.get(0);
        int lastElement = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, lastElement);
            heapifyDown(0);
        }
        return min;
    }

    private void heapifyUp(int i) {
        int parent = (i - 1) / 2;
        while (i > 0 && heap.get(i) < heap.get(parent)) {
            Collections.swap(heap, i, parent);
            i = parent;
            parent = (i - 1) / 2;
        }
    }

    private void heapifyDown(int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int smallest = i;
        if (left < heap.size() && heap.get(left) < heap.get(smallest)) {
            smallest = left;
        }
        if (right < heap.size() && heap.get(right) < heap.get(smallest)) {
            smallest = right;
        }
        if (smallest != i) {
            Collections.swap(heap, i, smallest);
            heapifyDown(smallest);
        }
    }

    public void printHeap() {
        System.out.println(heap);
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();
        minHeap.insert(3);
        minHeap.insert(2);
        minHeap.insert(1);
        minHeap.insert(7);
        minHeap.insert(8);
        minHeap.insert(4);
        minHeap.insert(10);
        minHeap.insert(16);

        System.out.print("Min Heap: ");
        minHeap.printHeap();

        System.out.println("Delete Min: " + minHeap.deleteMin());
        System.out.print("Min Heap after deletion: ");
        minHeap.printHeap();
    }
}
