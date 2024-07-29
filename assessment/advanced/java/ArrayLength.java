package assessment.advanced.java;

public class ArrayLength {

    private static <T extends Object> int getArrayLength(T[] array) {
        return array.length;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Hello", "World"};

        int length1 = getArrayLength(intArray);
        System.out.println("Length of Integer array: " + length1);

        int length2 = getArrayLength(strArray);
        System.out.println("Length of String array: " + length2);
    }
}
