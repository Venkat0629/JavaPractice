package assessment.exception;

public class Example11 {

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Divisor cannot be zero");
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        try {
            int result = divide(a, b);
            System.out.println(a + " / " + b + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        a = 5;
        b = 0;
        try {
            int result = divide(a, b);
            System.out.println(a + " / " + b + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        a = 20;
        b = 4;
        try {
            int result = divide(a, b);
            System.out.println(a + " / " + b + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
