package assessment.exception;

import java.io.FileReader;
import java.io.IOException;

class Example15 {

    public static void readFile() {
        String fileName = "sample.txt";
        try (FileReader reader = new FileReader(fileName)) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.println(character);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        readFile();
    }
}
