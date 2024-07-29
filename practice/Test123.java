package practice;

interface Interface1 {
    default void defaultMethod() {
        System.out.println("Default1");
    }
}

interface Interface2 {
    default void defaultMethod() {
        System.out.println("Default2");
    }
}

public class Test123 implements Interface1, Interface2 {
    public static void main(String[] args) {
        Interface1 test123 = new Test123();
    }

    @Override
    public void defaultMethod() {
        Interface1.super.defaultMethod();
    }
}
