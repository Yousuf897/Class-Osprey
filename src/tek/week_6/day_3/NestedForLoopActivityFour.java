package tek.week_6.day_3;

public class NestedForLoopActivityFour {

    /*

    *
    * *
    * * *
    * * * *
    * * * * *
    * * * * * *
    * * * * * * *
    * * * * * * * *

    * */

    public static void main(String[] args) {

        /*  i = 4
        *   j = 1
        * */

        for ( int i = 1; i <= 8; i++ ) {

            for ( int j = 1; j <= i; j++ ) {

                System.out.print("* ");

            }
            System.out.println();
        }

    }

}
