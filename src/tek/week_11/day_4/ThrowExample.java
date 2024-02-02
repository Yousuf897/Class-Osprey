package tek.week_11.day_4;

import java.io.FileInputStream;
import java.io.IOException;

public class ThrowExample {

    public static void main(String[] args) {

    try {
        checkAge(15);
    } catch (ArithmeticException e) {
        e.printStackTrace();
    }

    try {
        readFile("Student.txt");
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        System.out.println("File not found!");
    }

    }

    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    static void readFile(String fileName) throws IOException {
        FileInputStream file = new FileInputStream(fileName);
        // Read file content
        file.close();
    }

}
