package assignment.w2d2;

public class ClassCastExceptionExample {

    public static void main(String[] args) {
        try {
            Object obj = new Integer(100);
            String str = (String) obj;
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }
}
