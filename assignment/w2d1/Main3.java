package assignment.w2d1;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Integer[] numsArray = {10, 20, 30, 40, 50};
        System.out.println(max(numsArray));
        String[] strArray = {"Abc", "Bca", "Cab"};
        System.out.println(max(strArray));
        Double[] doubleArray = {3.5, 7.2, 1.9, 9.1, 4.4};
        System.out.println(max(doubleArray));
    }

    public static <T extends Comparable<T>> T max(T[] arr) {
        if (null == arr || arr.length == 0)
            return null;
        return Arrays.stream(arr).max(Comparator.naturalOrder()).get();
    }
}
