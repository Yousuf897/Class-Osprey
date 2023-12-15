package tek.week_5.lab_session;

import java.util.Scanner;

public class ForLoopPracticeTwo {

    public static void main(String[] args) {

        /*  1 to X
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
        int number, endPoint;

        System.out.print("Enter a number in which you want to see its multiplication table: ");
        number= input.nextInt();

        System.out.print("And where do you want the table to be stopped: ");
        endPoint= input.nextInt();

        for ( int i = 1; i <= endPoint; i++ ) {
            System.out.println( i + " * " + number + " = " + ( i * number ) );
        }


    }

}
