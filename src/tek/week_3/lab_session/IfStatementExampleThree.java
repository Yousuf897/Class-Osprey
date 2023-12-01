package tek.week_3.lab_session;

import java.util.Scanner;

public class IfStatementExampleThree {

    /*
    *   Please select from the options below:
    *   1. Enter Two Numbers and see the sum of two numbers
    *   2. Enter your firstName and see it in console
    *   3. Print GoodBye message
    *
    *   Your choice: X
    * */

    /*
    * 1. if user selects the first option --> Then we need to grab two values and we want to display the sum!
    * 2. if user selects the second option --> Ask the user for the first name and we need to do a sout!
    * 3. if user selects the third option --> Print a good bye message!
    *
    * */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int option, numberOne, numberTwo, sumResult;
        String firstName;

        System.out.println("Please select from the options below: ");
        System.out.println("1. Enter Two Numbers and see the sum of two numbers");
        System.out.println("2. Enter your firstName and see it in console");
        System.out.println("3. Print GoodBye message");
        System.out.print("Your choice: ");
        option = input.nextInt();

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );

        if ( option == 1) {
            System.out.print("Enter the firstNumber: ");
            numberOne = input.nextInt();
            System.out.print("Enter the secondNumber: ");
            numberTwo = input.nextInt();
            sumResult = numberOne + numberTwo;
            System.out.println("The sum of " + numberOne + " + " + numberTwo + " = " + sumResult);
        } else if ( option == 2 ) {
            System.out.print("Enter the first name: ");
            firstName = input.next();
            System.out.print("Your firstName is: " + firstName);
        } else {
            System.out.println("Good Bye!");
        }

        /*
        * nextLine() --> some value -- space
        *           -- some value
        * next() --> some value -- space --
        *
        * */

    }

}
