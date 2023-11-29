package tek.week_3.day_2;

import java.util.Scanner;

public class ScannerTwo {

    public static void main(String[] args) {

        int numberOne, numberTwo;
        Scanner input = new Scanner(System.in);

        System.out.print( "Enter the first Number: " );
        numberOne = input.nextInt();

        System.out.print( "Enter the second Number: " );
        numberTwo = input.nextInt();

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );

        // The result of 5 + 6 = 11
        System.out.println( "The result of " + numberOne + " + " + numberTwo + " = " + (numberOne + numberTwo));
        System.out.println( "The result of " + numberOne + " * " + numberTwo + " = " + (numberOne * numberTwo));
        System.out.println( "The result of " + numberOne + " - " + numberTwo + " = " + (numberOne - numberTwo));
        System.out.println( "The result of " + numberOne + " / " + numberTwo + " = " + (numberOne / numberTwo));

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );

    }

}
