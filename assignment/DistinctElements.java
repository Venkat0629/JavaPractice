package assignment;

import java.util.Arrays;

public class DistinctElements {
    public static void main(String[] args) {
        int[] array = {1, -1, 3, 0, 9, 1, 5, -3, 3, 4, 2, -2, 2, 1};
        System.out.println("Array=> " + Arrays.toString(array));
        int[] distinctArray = distinctElements(array);
        System.out.println("Distinct Array=> " + Arrays.toString(distinctArray));
    }

    private static int[] distinctElements(int[] array) {
        return Arrays.stream(array)
                .distinct()
                .sorted()
                .toArray();
    }
}
