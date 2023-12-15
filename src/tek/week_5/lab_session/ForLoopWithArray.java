package tek.week_5.lab_session;

public class ForLoopWithArray {

    public static void main(String[] args) {

        int[] numbers = { 10, 5, 2, 5, 7, 8, 9 };

        // what if I want to see the 2x value for each one of the above elements of array
        // for example

        // the first element 10 * 2 = 20

        //                  numbers[0] * 2

        // second element 5 * 2 = 10

        // expected output: 20, 10, ....

        for ( int i = 0; i < numbers.length; i++ ) {
            System.out.print( ( numbers[ i ] * 2 ) + " " );
            //
        }

    }
}
