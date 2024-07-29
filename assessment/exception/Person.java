package assessment.exception;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        if (age <= 0) {
            throw new InvalidAgeException("Age must be a positive integer");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
