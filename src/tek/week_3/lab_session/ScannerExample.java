package tek.week_3.lab_session;

import java.util.Scanner;

public class ScannerExample {

    // Scanner is a class -> giving us the ability to capture the information or the data from the user.
    // for example --> firstName = "Bob"; || what if the user is going to enter their firstName --> Use Scanner
    // In order to use Scanner you have to import the Scanner class from it's package.
    // import java.util.Scanner;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstName, lastName, middleName, dateOfBirth, occupation;
        String gender;
        int age;


        System.out.print("Enter your firstName: ");
        firstName = scanner.nextLine();

        System.out.print("Enter your lastName: ");
        lastName = scanner.nextLine();

        System.out.print("Enter your MiddleName: ");
        middleName = scanner.nextLine();

        System.out.print("Enter your date of birth: ");
        dateOfBirth = scanner.nextLine();

        System.out.print("Enter your occupation: ");
        occupation = scanner.nextLine();

        System.out.print("Enter your gender: ");
        gender = scanner.next();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();


        System.out.println("Your firstName is: " + firstName);
        System.out.println("Your middleName is: " + middleName);
        System.out.println("Your lastName is: " + lastName);
        System.out.println("Your date of birth is: " + dateOfBirth);
        System.out.println("Your occupation is: " + occupation);
        System.out.println("Your gender is: " + gender);
        System.out.println("Your: " + age);






    }

}
