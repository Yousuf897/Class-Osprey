package tek.week_3.lab_session;

import java.util.Scanner;

public class SwitchStatement {

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

        switch ( option ) {
            case 1:
                System.out.print("Enter the firstNumber: ");
                numberOne = input.nextInt();
                System.out.print("Enter the secondNumber: ");
                numberTwo = input.nextInt();
                sumResult = numberOne + numberTwo;
                System.out.println("The sum of " + numberOne + " + " + numberTwo + " = " + sumResult);
                break;
            case 2:
                System.out.print("Enter the first name: ");
                firstName = input.next();
                System.out.print("Your firstName is: " + firstName);
                break;
            case 3:
                System.out.println("Good Bye!");
                break;
            default:
                System.out.println("Please select the correct option!");
                break;
        }


        /*
        *
        *   switch ( value that  you are going to check ) {
        *
        *           case value to be checked:
        *               true block;
        *               break;
        *           case value to be checked:
        *               true block;
        *               break;
        *          default:
        *               true block
        *               break;
        *      }
        *
        * */


    }

}
