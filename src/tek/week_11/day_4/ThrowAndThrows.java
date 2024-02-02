package tek.week_11.day_4;

public class ThrowAndThrows {


    /*
    *
    * Throw: The throw keyword is used within a method to actively throw an exception. You can throw either checked or unchecked exceptions.
    * When an exception is thrown, the normal flow of the program is disrupted and control is transferred to the nearest catch block that matches the
    * type of exception thrown.

    Throws: The throws keyword is used in a method's signature to indicate that this method might throw certain types of exceptions.
    * It's a way to flag to the caller of the method that they need to handle these exceptions, either with a catch block or by declaring
    * the exception in their own throws clause.


    Throw Example
    public class Main {
    public static void main(String[] args) {
        try {
            checkAge(17);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }

    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}

Throws Example:
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            readFile("example.txt");
        } catch (IOException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }

    static void readFile(String fileName) throws IOException {
        FileInputStream file = new FileInputStream(fileName);
        // Read file content
        file.close();
    }
}
    *
    *
    * */


}
