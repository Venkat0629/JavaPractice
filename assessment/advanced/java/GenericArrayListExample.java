package assessment.advanced.java;

import java.util.ArrayList;

public class GenericArrayListExample {

    public static void main(String[] args) {
        ArrayList<Object> genericList = new ArrayList<>();

        addToGenericList(genericList, "Hello");
        addToGenericList(genericList, 123);
        addToGenericList(genericList, 3.14);
        addToGenericList(genericList, true);

        System.out.println("Elements in the generic list:");
        iterateGenericList(genericList);
    }

    public static <T> void addToGenericList(ArrayList<T> list, T element) {
        list.add(element);
    }

    public static <T> void iterateGenericList(ArrayList<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }
}
