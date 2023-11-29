package tek.week_3.day_2;
import java.util.Scanner;
public class ScannerExp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String firstName, lastName;
        int age;
        double salary;

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );

        System.out.print("Enter your firstName: ");
        firstName = input.nextLine();

        System.out.print("Enter your lastName: ");
        lastName = input.nextLine();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Enter your salary: ");
        salary = input.nextDouble();


        System.out.println( " * * * * * * * Your Information * * * * * * * * * * " );

        System.out.println("Your firstName is: " + firstName);
        System.out.println("Your age is: " + age);
        System.out.println("Your lastName is: " + lastName);
        System.out.println("Your salary is: " + salary);

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );

        // Enter your salary:
        // --------

        // Enter your salary: ----

    }
}
