package tek.week_5.lab_session;

import java.util.Scanner;

public class ForLoopPracticeThree {

    public static void main(String[] args) {

        /*  Y to X
         *
         *  1 * 4 = 4
         *  2 * 4 = 8
         *  3 * 4 = 12
         *  4 * 4 = 16
         *  ..
         *  ..
         *  ..
         *
         * */

        Scanner input = new Scanner(System.in);
        int number, endPoint, startPoint;

        System.out.print("Enter a number in which you want to see its multiplication table: ");
        number= input.nextInt();

        System.out.print("Where do you want the table to be Start: ");
        startPoint = input.nextInt();

        System.out.print("And where do you want the table to be stopped: ");
        endPoint= input.nextInt();

        for ( int i = startPoint; i <= endPoint; i++ ) {
            System.out.println( i + " * " + number + " = " + ( i * number ) );
        }


    }

}
