package assessment.advanced.java;

import java.util.Arrays;
import java.util.List;

class Box<T> {
    private T value;

    public void setValue(T t) {
        this.value = t;
    }

    public T getValue() {
        return value;
    }
}

public class GenericClass {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Generic Box");
        System.out.println(stringBox.getValue());
        Box<List<Integer>> listBox = new Box<>();
        listBox.setValue(Arrays.asList(15, 22, 25, 61));
        System.out.println(listBox.getValue());
    }
}
