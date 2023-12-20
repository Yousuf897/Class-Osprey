package tek.week_6.day_2;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOne, numberTwo, choice, result = 0;
        boolean flag  = true;

        while ( flag ) {

            System.out.println(" * * * * * BASIC CALCULATOR * * * * * ");
            System.out.print("Enter the first number: ");
            numberOne = input.nextInt();

            System.out.print("Enter the second number: ");
            numberTwo = input.nextInt();

            System.out.println("Please select among one of these options to prceed with calculation: ");
            System.out.println("1. +");
            System.out.println("2. -");
            System.out.println("3. *");
            System.out.println("4. /");

            System.out.print("Your choice: ");
            choice = input.nextInt(); // 1

            //          1
            switch (choice) {
                case 1:
                    result = numberOne + numberTwo;
                    break;
                case 2:
                    result = numberOne - numberTwo;
                    break;
                case 3:
                    result = numberOne * numberTwo;
                    break;
                case 4:
                    result = numberOne / numberTwo;
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }

            System.out.println("The result: " + result);

            System.out.print("Do you want to continue? ");
            System.out.println("1. Yes");
            System.out.println("2. No");

            System.out.println("Your input: ");
            choice = input.nextInt();

            if ( choice == 1 ) {
                flag = true;
            } else if ( choice == 2 ) {
                flag = false;
            }  else {
                System.out.println("Invalid input!");
            }

        }

        /*
        *   I am going to capture two values from the user
        *   numberOne, numberTwo
        *
        *   Then, I am printing a message for the user to enter two numbers
        *   Capturing the numbers and then storing them in the variable
        *
        *   Then I am printing a menu:
        *   Please select among one of these options to proceed with calculation:
        *   1. +
        *   2. -
        *   3. *
        *   4. /
        *
        *   Capture the choice of user which is one of the options from above!
        *
        *   switch ( based on the choice of the user ) {
        *
        *       case: 1 ==> if user selected or entered 1
        *         result = numberOne + numberTwo;
        *         break;
        *
        *   }
        *
        *   print result for the user!
        *
        *   Ask the user if they want to continue or not
        *   1. Yes
        *   2. No
        *
        *
        *   switch ( choice of the user ) {
        *
        *     case 1: if user selected or entered 1
        *       flag = true;
        *
        *    case 2:
        *       flag = false;
        *
        * }
        *
        *
        *
        * */

    }

}
