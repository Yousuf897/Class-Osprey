package tek.week_6.day_3;

public class NestedForLoopActivityTwo {

    // print the combination of the numbers from 1 all the way to 6.

    public static void main(String[] args) {

        /*
        * Expected output:
        *
        * 1 1
        * 1 2
        * 1 3
        * 1 4
        * 1 5
        * 1 6
        * 2 1
        * 2 2
        * 2 3
        * 2 4
        * 2 5
        * 2 6
        * 3 1
        * 3 2
        * 3 3
        * 3 4
        * 3 5
        * 3 6
        *
        * */

        // print the combination of the numbers from 1 all the way to 6.

        for ( int outer = 1; outer <= 6; outer++ ) {
            for ( int inner = 1; inner <= 6; inner++ ) {
                System.out.println( outer + " " + inner );
            }

            System.out.println();
        }


    }

}
