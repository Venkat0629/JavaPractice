package assessment.exception;

import java.io.FileReader;
import java.io.IOException;

public class Example10 {
    public static void readFile() {
        try {
            String fileName = "sample.txt";
            FileReader reader = new FileReader(fileName);
            int charcter;
            while ((charcter = reader.read()) != -1) {
                System.out.println(charcter);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        readFile();
    }
}




