package assessment.advanced.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class WildCard {

    public static <T extends Number & Comparable<T>> Optional<T> findMin(List<T> list) {
        return list.stream().min(Comparator.naturalOrder());
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(101, 102, 103);
        System.out.println("Minimum of " + intList + " is:");
        System.out.print(findMin(intList).get());

        System.out.println();

        List<Double> doubleList = Arrays.asList(101.02, 102.02, 103.02);
        System.out.println("Minimum of " + doubleList + " is:");
        System.out.print(findMin(doubleList).get());

    }
}
