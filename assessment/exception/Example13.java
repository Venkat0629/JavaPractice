package assessment.exception;


public class Example13 {
    public static void main(String[] args) {
        try {
            Person person1 = new Person("Alice", 0);
            System.out.println(person1.getName() + "'s age is " + person1.getAge());
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age encountered: " + e.getMessage());
        }

        try {
            Person person2 = new Person("Bob", 25);
            System.out.println(person2.getName() + "'s age is " + person2.getAge());
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age encountered: " + e.getMessage());
        }
    }
}

