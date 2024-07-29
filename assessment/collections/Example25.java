
package assessment.collections;

import java.util.*;

public class Example25 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(7);
        numbers.add(3);
        numbers.add(1);

        System.out.println("Original list: " + numbers);
        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);

        int key = 3;
        int index = Collections.binarySearch(numbers, key);
        System.out.println("Index of " + key + " in sorted list: " + index);

        Collections.reverse(numbers);
        System.out.println("Reversed list: " + numbers);

        Collections.shuffle(numbers);
        System.out.println("Shuffled list: " + numbers);

        Integer[] numbersArray = numbers.toArray(new Integer[0]);
        System.out.println("Array from list: " + Arrays.toString(numbersArray));

        Arrays.sort(numbersArray);
        System.out.println("Sorted array: " + Arrays.toString(numbersArray));

        int keyArray = 7;
        int indexArray = Arrays.binarySearch(numbersArray, keyArray);
        System.out.println("Index of " + keyArray + " in sorted array: " + indexArray);

        Arrays.fill(numbersArray, 0);
        System.out.println("Array filled with zeros: " + Arrays.toString(numbersArray));
    }
}
