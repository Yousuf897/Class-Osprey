package tek.week_3.day_1;

public class IncrementAndDecrement {

/*

    Think of an elevator in a building. People can either go up one floor or down one floor at a
    time using the elevator's buttons. If they press the "up" button, the elevator ascends by one
    floor (increment). If they press the "down" button, it descends by one floor (decrement).
    This single-floor movement is analogous to incrementing or decrementing in programming.


    In Java, you can increase or decrease a variable's value by one using special operators.
    These are:

            ++ : Increment operator. It increases the variable's value by one.
            -- : Decrement operator. It decreases the variable's value by one.

    These operators can be used in two positions, prefix (++x or --x) and postfix (x++ or x--),
    and their placement can affect the order of operations in expressions.
*/

    public static void main(String[] args) {

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );


        int number = 10;

        // number = number + 1   --> 11


        System.out.println( number++ ); // --> 10

        System.out.println( number ); // --> 11

        System.out.println( number++ ); //  --> 11 + 1

        System.out.println( number ); // --> 12

        // Operation --> print
        // 10
        // 10 + 1 = 11
        // 11


        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );

        int num = 5;  // 5, 6, 7 --> 5, 7

        System.out.println(  num++  ); // 5 (printed) 5 + 1 = > 6

        System.out.println(  ++num  ); // 6 + 1 -> 7 --> (Print) -- > 7

        System.out.println( number++ ); // --> 12 (printed) --> 12 + 1 = 13
        System.out.println( ++number ); // --> 1 + 13 = 14 --> 14 (printed)

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );

        System.out.println( 5 + 1 );

        int numberOne = 5 + 1;
        System.out.println( numberOne++ ); // 6 --> 7


        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );

        double number66 = 120; //  120.0

        System.out.println(number66++); // 120.0 -- 120.0 + 1 --> 121.0

        System.out.println(number66++); // 121.0 -- 121.0 + 1 --> 122.0


        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );


        int numberTwo  = 10; // 10, 9, 7, 8

        System.out.println( numberTwo-- ); // 10 (Printed) -- 10 - 1 --> 9
        System.out.println( numberTwo-- ); // 9, || --> 9 (Printed) -- 9 - 1 --> 8
        System.out.println( --numberTwo ); // 7 || -- 8 - 1 = 7
        System.out.println( ++numberTwo ); // 8  || 7 + 1 = 8 --> 8 (Printed)


        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );
    }

}
