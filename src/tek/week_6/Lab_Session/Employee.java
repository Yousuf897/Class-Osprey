package tek.week_6.Lab_Session;

import java.util.Scanner;

public class Employee {



    // Attributes or Fields or Variables

    String firstName;
    String lastName;
    String middleName;
    String emailAddress;
    String phoneNumber;
    double salary;
    byte age;
    String dateOfBirth;
    String occupation;

    // Method to print the Employee information

    void printEmployeeInformation() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Email Address: " + emailAddress);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Occupation: " + occupation);
    }


    /* In the above example for method, we see void and "printEmployeeInformation"
    *  1. void --> This is the return type of the method, which means this method is going to return
    *  nothing.
    *
    *  2. "printEmployeeInformation" --> This is the name of the method, so in order to differentiate
    *  between different methods, every method needs to have their own name.
    *  Just like the variables, where each variable is going to have their own name for example
    *  String firstName and String lastName are two different variable and we can differentiate between
    *  them based on their name! just like the variables we have multiple methods and their name can
    *  be different and based on their name we can differentiate between them.
    *  */

    void collectEmployeeInformation() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        firstName = input.next();

        System.out.print("Enter your last name: ");
        lastName = input.next();

        System.out.print("Enter your middle name: ");
        middleName = input.next();

        System.out.print("Enter your email address: ");
        emailAddress = input.next();

        System.out.print("Enter your phone number: ");
        phoneNumber = input.next();

        System.out.print("Enter your salary: ");
        salary = input.nextDouble();

        System.out.print("Enter your age: ");
        age  = input.nextByte();

        System.out.print("Enter your date of birth: ");
        dateOfBirth = input.next();

        System.out.print("Enter your occupation: ");
        occupation = input.next();

    }
}
