package tek.week_6.day_3;

import java.util.Scanner;

public class NestedForLoopActivityFive {

    /*

     * * * * * * * *
     * * * * * * *
     * * * * * *
     * * * * *
     * * * *
     * * *
     * *
     *

     * */

    public static void main(String[] args) {

/*      Scanner input = new Scanner(System.in);
        int shapeValue;

        System.out.print("Enter a value to draw a shape: ");
        shapeValue = input.nextInt();*/

        for ( int i = 8; i >= 1; i-- ) {
            for ( int j = 1; j < i; j++ ) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


        for ( int i = 1; i <= 5; i++ ) {
            for ( int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
