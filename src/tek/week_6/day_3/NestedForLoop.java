package tek.week_6.day_3;

public class NestedForLoop {

    /*    Real-Life Analogy:

    Think of a clock. The minute hand completes a
    full cycle every hour, while the hour hand moves one position. Now, imagine
    if you were to describe the positions of both hands throughout the day. For every hour
    (each position of the hour hand),
    the minute hand goes through all its 60 positions. This repetitive action inside another
    action is similar to how nested loops operate.

    Programming Explanation:

    In programming, when you have a loop inside another loop, it's termed as "nested loops".
    The inner loop completes all its iterations for every single iteration of the outer loop.
    A nested for loop in Java looks like this:

    for (initialization1; condition1; iteration1) { --> outer loop

        for (initialization2; condition2; iteration2) { --> Inner loop
            // body of inner loop
        }
        // body of outer loop

    }

    */


    public static void main(String[] args) {

        for ( int i = 0; i < 3; i++ ) { // outer loop

            for ( int j = 0; j < 3; j++) { // Inner loop

                // nested for loop!

            }

        }


  /*      if ( condition ) {

            if ( condition ) {

                // nested if statement

            }

        }*/

    }

}
