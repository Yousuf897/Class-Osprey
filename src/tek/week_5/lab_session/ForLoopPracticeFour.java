package tek.week_5.lab_session;

public class ForLoopPracticeFour {

    public static void main(String[] args) {

    // length                   1       2       3       4       5       6       7        8
    String[] studentNames = { "Alex", "Tony", "Eric", "Peter", "Bob", "Erin", "Lydia", "Paul" };
    // index                    0       1       2       3        4      5       6        7

        //               8 < 8
        for ( int i = 0; i <= studentNames.length - 1; i++ ) {
            System.out.println( studentNames[ i ] );
        }

        for ( int i = 0; i < studentNames.length; i++ ) {
            System.out.println( studentNames[ i ] );
        }

        /*
        * index  =  8
        * length =  8
        *
        * */

        /*
        * Alex
        * Tony
        * Eric
        * Peter
        * Bob
        * Erin
        * Lydia
        * Paul
        *
        * */

        /* the last index ==> N - 1 where 8 is the total length   */

    }

}
