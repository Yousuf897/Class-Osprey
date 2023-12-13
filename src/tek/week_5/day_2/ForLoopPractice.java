package tek.week_5.day_2;

import java.util.Scanner;

public class ForLoopPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int startPoint, endPoint, desiredNumber;

        /*
        *  4 * 1 = 4  ( desiredNumber * loopNumber )
        *  4 * 2 = 8
        *  4 * 3 = 12
        *  4 * 4 = 16
        *
        *
        * */

        System.out.print("Enter the desired number in which you want to print its table: ");
        desiredNumber = input.nextInt();

        System.out.print("From where do you want the multiplication table to start: ");
        startPoint = input.nextInt();

        System.out.print("Where do you want the multiplication table to end: ");
        endPoint = input.nextInt();

        // 1     || 4
        for ( int i = startPoint; i <= endPoint; i++) {
            System.out.println( desiredNumber + " * " + i + " = " + ( desiredNumber * i ) );
        }
/*

        for ( int i = 1; i <= 10; i++) {
            System.out.println( desiredNumber + " * " + i + " = " + ( desiredNumber * i ) );
        }
*/


    }

}
