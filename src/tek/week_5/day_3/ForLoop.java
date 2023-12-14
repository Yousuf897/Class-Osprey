package tek.week_5.day_3;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {

        // print the numbers from 1 to X
        //                      1  to


        for ( int i = 1; i <= 15; i++) {
            System.out.print( i + " " );
        }

        // Ask the user to enter the end point of the number for example if user enters 20
        // the numbers should be printed from 1 to 20, if user enters 30, the numbers
        // should be printed from 1 to 30.

        Scanner input = new Scanner(System.in);
        int startPoint, endPoint;

        System.out.println();

        System.out.print("Where do you want the print to start: (Please enter a number) ");
        startPoint = input.nextInt();

        System.out.print("Where do you want the print to stop: (Please enter a number) ");
        endPoint = input.nextInt();

/*        for ( int i = 1; i <= userChoice; i++) {
            System.out.print( i + " " );
        }

        System.out.println();

        // Print the elements of an array using the for loop (NOT ENHANCED FOR LOOP!)


        // i = 1; i <= 15               || i = 1; i <= userChoice; i++

        for ( int i = 1; i <= userChoice; i++) {
            if ( i % 2 == 0 ) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        for ( int i = userChoice; i >= 1; i--) {
            System.out.print( i + " ");
        }
        */

        int countEvenNumbers = 0;

        // ( i = 1; i <= 20; i++ ) || i = startPoint; i <= endPoint; i++ \

        for ( int i = startPoint; i <= endPoint; i++ ) {
            if ( i % 2 == 0) {
                countEvenNumbers++;
                System.out.print(i + " ");
            }
        }

        System.out.println();

        /*
        * X = startPoint
        * Y = endPoint
        * Z = countEvenNumbers
        *
        * */
        // between the range of X and Y there are Z amount even numbers!

        System.out.println("Between the range of " + startPoint +" and " + endPoint + " " +
                "there are " +  countEvenNumbers + " even numbers!");



    }

}
