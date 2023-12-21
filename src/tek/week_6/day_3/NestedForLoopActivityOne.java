package tek.week_6.day_3;

public class NestedForLoopActivityOne {

    public static void main(String[] args) {


        // Give me the combination of numbers between 1 to 3
        // 1 1
        // 1 2
        // 1 3
        // 2 1
        // 2 2
        // 2 3
        // 3 1
        // 3 2
        // 3 3

        //  outer = 4
        for ( int outer = 1; outer <= 3; outer++) { // ==> OUTER LOOP

            // Inner = 4
            for ( int inner = 1; inner <= 3; inner++ ) { // ==> INNER LOOP

                System.out.println("Value of Outer loop: [ " + outer + " ] " + "Value of Inner loop: [ " + inner + " ]");

            }

            System.out.println();

            /*
            * [ 1 ] [ 1 ]
            * [ 1 ] [ 2 ]
            * [ 1 ] [ 3 ]
            * [ 2 ] [ 1 ]
            * [ 2 ] [ 2 ]
            * [ 2 ] [ 3 ]
            * [ 3 ] [ 1 ]
            * [ 3 ] [ 2 ]
            * [ 3 ] [ 3 ]
            *
            * */

        }


    }

}
