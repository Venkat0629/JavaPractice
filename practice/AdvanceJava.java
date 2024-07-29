package practice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AdvanceJava {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 11, 12, 13, 15);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }
}
