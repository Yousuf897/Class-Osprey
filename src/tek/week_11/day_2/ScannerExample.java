package tek.week_11.day_2;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        int numberOne, numberTwo;
        double numberThree;
        String firstName;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        numberOne = scanner.nextInt();
        System.out.print("Enter the second number: ");
        numberTwo = scanner.nextInt();
        System.out.print("Enter the third number: ");
        numberThree = scanner.nextDouble();
        System.out.print("Enter your name: ");
        firstName = scanner.nextLine();

        int result = numberOne + numberTwo;

        System.out.println(  result );


        // for double values you have to use
        // scanner.nextDouble();

        // for short values you have to use
        // scanner.nextShort()

        // for the String you have to use
        // scanner.nextLine()

        // for the strings that's not going to have space and next line, you have to use next()
        // scanner.next()


    }

}
