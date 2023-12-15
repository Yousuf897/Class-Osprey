package tek.week_5.lab_session;

import java.util.Scanner;

public class WhyScanner {

    public static void main(String[] args) {

        int number;
        String firstName;
        char character;
        boolean booleanValue;
        double decimalNumber;

        /* Scanner ( Read the input from keyboard or read a file ) */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();

        System.out.print("Enter your firstName: ");
        firstName= input.next();

        System.out.println(firstName);


/*        System.out.println( number );
        System.out.println( firstName );
        System.out.println( character );
        System.out.println( booleanValue );
        System.out.println( decimalNumber );*/


    }

}
