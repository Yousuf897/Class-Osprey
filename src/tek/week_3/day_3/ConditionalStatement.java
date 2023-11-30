package tek.week_3.day_3;

import java.util.Scanner;

public class ConditionalStatement {

    public static void main(String[] args) {

        int numberOne, numberTwo, biggerNumber = 0, smallerNumber = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        numberOne = input.nextInt();

        System.out.print("Enter the second number: ");
        numberTwo = input.nextInt();
    //          20    >      15         --> YES --> biggerNumber = number; || smallerNumber = numberTwo;
        if ( numberOne > numberTwo ) {
            biggerNumber = numberOne;
            smallerNumber = numberTwo;
        } else {
            smallerNumber = numberTwo;
        }

        System.out.println("The bigger number is: " + biggerNumber);
        System.out.println("The smaller number is: " + smallerNumber);

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );

        int bigNum;

        bigNum = ( numberOne > numberTwo ) ? numberOne : numberTwo;

        System.out.println( "The bigger number is: " + bigNum );

    }

}
