package assessment.exception;

public class ExceptionChaining {

    public static void main(String[] args) {
        try {
            int result = divideByZero();
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            throw new RuntimeException("Error occurred during division", e);
        }
    }

    public static int divideByZero() {
        int dividend = 10;
        int divisor = 0;
        return dividend / divisor;
    }
}
