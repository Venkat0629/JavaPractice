package assessment.exception;

import java.io.IOException;

public class ExceptionWrapping {

    public static void main(String[] args) {
        try {
            readFromFile("sample.txt");
        } catch (IOException e) {
            throw new RuntimeException("Error reading file", e);
        }
    }

    public static void readFromFile(String fileName) throws IOException {
        throw new IOException("File not found: " + fileName);
    }
}
