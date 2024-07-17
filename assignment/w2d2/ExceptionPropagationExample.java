package assignment.w2d2;

public class ExceptionPropagationExample {

    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        try {
            method2();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException in method1: " + e.getMessage());
        }
    }

    public static void method2() {
        int[] arr = new int[3];
        try {
            arr[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException in method2: " + e.getMessage());
            throw e;
        } finally {
            System.out.println("Finally block executed in method2");
        }
    }
}
