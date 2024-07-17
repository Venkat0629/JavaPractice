package assignment.w2d1;

import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        List<Double> doubleList = List.of(1.1, 2.2, 3.3, 4.4, 5.5);

        System.out.println("Sum of int: " + sumOfList(intList));
        System.out.println("Sum of double: " + sumOfList(doubleList));

    }

    public static double sumOfList(List<? extends Number> list) {
        return list.stream().mapToDouble(Number::doubleValue).sum();
    }
}
