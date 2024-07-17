package assignment.w2d1;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};
        printArray(nums);
        String[] strings = {"Abc", "Bca", "Cab"};
        printArray(strings);
        Boolean[] booleans = {true, false, true};
        printArray(booleans);
    }

    public static <T> void printArray(T[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
