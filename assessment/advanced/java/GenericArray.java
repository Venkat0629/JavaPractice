package assessment.advanced.java;

import java.util.Arrays;

public class GenericArray {
    private static <T> void printArray(T[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Integer[] intArr = {5, 15, 16};
        String[] strArr = {"G1", "G2", "G2"};
        System.out.println("Integer List: ");
        printArray(intArr);
        System.out.println("String List: ");
        printArray(strArr);
    }

}
