package assessment.exception;


public class Example14 {

    public static void validateAge(int age) {
        try {
            if (age <= 0) {
                throw new InvalidAgeException("Age must be a positive integer");
            }
            System.out.println("Age validated successfully: " + age);
        } catch (InvalidAgeException e) {
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(25);
            validateAge(0);
            validateAge(-5);
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age encountered: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Other exception caught: " + e.getMessage());
        }
    }
}
