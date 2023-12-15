package tek.week_5.lab_session;

public class WhileLoop {

    public static void main(String[] args) {

        /*
        *  Initialization
        *
        * while ( condition ) {
        *       body of your loop
        *
        *       iteration;
        *   }
        *
        * */

        // print the numbers from 1 to 10 using while loop!
        int number = 1;
        //        11    <= 10
        while ( number <= 10 ) {
            System.out.println( number );
            number++;
        }

        System.out.println( "Value of number after loop: " + number );

        /*
        * 1
        * 2
        * 3
        * .
        * .
        * .
        * 10
        * */

    }

}
