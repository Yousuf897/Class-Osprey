package tek.week_5.day_3;

public class WhileLoop {


    // keyword = while
    // Syntax of while loop
    /*
     *
     * int i = 10;
     *
     * while ( condition ) {
     *
     *
     *   iteration;
     *
     * }
     *
     *
     * */


    public static void main(String[] args) {

/*
        int number = 1;

        while (  number <= 4 ) {

            System.out.print( number + " " );  // 1 2 3 4

            number++;

        }
*/

/*        for ( int i = 0; i <= 5; i++) {

            System.out.print( i + " " ); // 0 1 2 3 4 5

        }*/
        //
        //                  1       2       3       4
        String[] names = {"Tony", "Alex", "Erin", "John"};
        //                  0       1       2       3

        /*        System.out.println( names[0] );*/

        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]); // Tony, Alex
        }


        int[] numbers = {10, 50, 80, 90, 10, 80, 10, 0, 1, 28};
        int total = 0;
        for (int number : numbers) {
            total = total + number;
        }

        System.out.println(" your total is:" + total);
    }

}
