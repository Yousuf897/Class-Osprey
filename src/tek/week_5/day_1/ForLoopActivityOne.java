package tek.week_5.day_1;

public class ForLoopActivityOne {

    public static void main(String[] args) {


/*              for ( Initialization (where to start); condition; Iteration ++ or --  ) {

                 }*/

        // Print the numbers from 1 to 50

            // 1, 2, 3, 4, 5, 6
        for ( int startPoint = 1; startPoint <= 5; startPoint++ ) {
            System.out.println( startPoint ); // 1 2 3 4 5
        }

        System.out.println("A message after loop block");

        // print the numbers from 10 to 1

        for ( int i = 10; i >= 1; i-- ) {
            System.out.println( i );
        }

    }

}
