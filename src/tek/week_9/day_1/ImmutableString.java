package tek.week_9.day_1;

import java.util.Scanner;

public class ImmutableString {

    public static void main(String[] args) {

        String firstName;
        String lastName;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        firstName = input.next();

        System.out.print("Enter your last name: ");
        lastName = input.next();

        System.out.println( firstName.hashCode() );
        System.out.println( lastName.hashCode() );

        String middleName = lastName;

        System.out.println( middleName.hashCode() );

    }
}
