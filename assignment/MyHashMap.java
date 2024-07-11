package assignment;

import java.util.*;

/*
Explanation:
Data Structure: MyHashMap uses an ArrayList of Node objects (buckets) to store the chains of key-value pairs. Each Node acts as a node in a linked list, handling collisions by chaining entries at the same index in the hash table.

Methods:

put(K key, V value): Inserts a key-value pair into the hash map. If the key already exists, it updates the value.
get(K key): Retrieves the value associated with the specified key. Returns null if the key does not exist.
remove(K key): Removes the key-value pair for the specified key.
size(): Returns the number of key-value mappings in the hash map.
Collision Handling: When multiple keys hash to the same index (getIndex method), the entries are stored in a linked list at that index (buckets).

Test Example: The main method demonstrates inserting, retrieving, and removing key-value pairs, as well as checking the size of the hash map.

 */
class MyHashMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private List<Node<K, V>> buckets;
    private int size;

    public MyHashMap() {
        this(DEFAULT_CAPACITY);
    }

    public MyHashMap(int capacity) {
        buckets = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            buckets.add(null);
        }
        size = 0;
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        Node<K, V> head = buckets.get(index);

        Node<K, V> current = head;
        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }

        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = head;
        buckets.set(index, newNode);
        size++;
    }

    public V get(K key) {
        int index = getIndex(key);
        Node<K, V> head = buckets.get(index);

        Node<K, V> current = head;
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public void remove(K key) {
        int index = getIndex(key);
        Node<K, V> head = buckets.get(index);

        Node<K, V> prev = null;
        Node<K, V> current = head;

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    buckets.set(index, current.next);
                } else {
                    prev.next = current.next;
                }
                size--;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public int size() {
        return size;
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode() % buckets.size());
    }

    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> hashMap = new MyHashMap<>();

        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        hashMap.put("Four", 4);

        System.out.println("Value of 'Two': " + hashMap.get("Two"));
        System.out.println("Value of 'Four': " + hashMap.get("Four"));

        hashMap.remove("Three");
        System.out.println("Size of HashMap after removal: " + hashMap.size());

        System.out.println("Value of 'Three' after removal: " + hashMap.get("Three"));
    }
}
