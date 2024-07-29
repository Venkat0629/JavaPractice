package assessment.exception;

import java.io.FileReader;
import java.io.IOException;

public class Example12 {
    public static void readFile() throws IOException {
        FileReader reader = null;
        try {
            String fileName = "sample.txt";
            reader = new FileReader(fileName);
            int charcter;
            while ((charcter = reader.read()) != -1) {
                System.out.println(charcter);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (null != reader) reader.close();
        }
    }

    public static void main(String[] args) throws IOException {
        readFile();
    }
}
