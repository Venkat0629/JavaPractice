package assessment.collections;

import java.util.*;

public class Example24 {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("cherry");
        arrayList.add("banana");

        System.out.println("ArrayList elements:");
        iterateAndPrint(arrayList);

        List<String> linkedList = new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("cherry");
        linkedList.add("banana");

        System.out.println("\nLinkedList elements:");
        iterateAndPrint(linkedList);

        Set<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("cherry");
        hashSet.add("banana");

        System.out.println("\nHashSet elements:");
        iterateAndPrint(hashSet);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("apple");
        treeSet.add("banana");
        treeSet.add("cherry");
        treeSet.add("banana");

        System.out.println("\nTreeSet elements:");
        iterateAndPrint(treeSet);
    }

    private static void iterateAndPrint(Collection<String> collection) {
        System.out.println(collection);
    }
}
