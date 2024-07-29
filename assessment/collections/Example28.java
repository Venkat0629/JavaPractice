package assessment.collections;

import java.util.List;
import java.util.stream.Collectors;

public class Example28 {
    public static void main(String[] args) {
        List<String> textList = List.of("a", "b", "c");
        List<String> upperCasetextList = textList.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Lower Case Strings:");
        System.out.println(textList);
        System.out.println("Upper Case Strings:");
        System.out.println(upperCasetextList);
    }
}

