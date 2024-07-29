package assessment.advanced.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperLowerBounded {
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Upper Bounded: ");
        System.out.println(sumOfList(Arrays.asList(1.102, 1.03, 1.004)));
        System.out.println("Lower Bounded: ");
        List<Object> numbers = new ArrayList<>();
        addNumbers(numbers);
        System.out.println(numbers);
    }


}
