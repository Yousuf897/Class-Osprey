package tek.week_3.lab_session;

import java.util.Scanner;

public class ScannerExampleTwo {

    // Two numbers
    // NumberOne = X
    // NumberTwo = Y


    /*
    *   The sum of X + Y = Z
    *   The Multiplication of X * Y = Z
    *   The Subtraction of X - Y = Z
    *   The division of X / Y = Z
    *
    * */


    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int numberOne, numberTwo, sumOfNumber;

        System.out.print("Enter the first number: ");
        numberOne = userInput.nextInt();

        System.out.print("Enter the second number: ");
        numberTwo = userInput.nextInt();

        sumOfNumber = numberOne + numberTwo;

        System.out.println("The Sum of " + numberOne + " + " + numberTwo + " = " + sumOfNumber );
        System.out.println("The Multiplication of " + numberOne + " * " + numberTwo + " = " + (numberOne * numberTwo) );
        System.out.println("The Subtraction of " + numberOne + " - " + numberTwo + " = " + (numberOne - numberTwo) );
        System.out.println("The Division of " + numberOne + " / " + numberTwo + " = " + (numberOne / numberTwo) );


    }

}
