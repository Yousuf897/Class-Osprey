package tek.week_6.day_3;

public class LocalVariable {

    public static void main(String[] args) { // ==> Opening Block for main method

        /*    1. Local Scope (Method/Block Scope):
    •	Variables declared within a method or block are local to that method or block.
    •	They cannot be accessed outside of that method or block.
    •	Their lifetime starts when the method or block is entered and ends when it exits.
*/
        String firstName = "Alex"; // Local Variable

        System.out.println( firstName );


        if ( true ) { // ==> Opening Block for if statement

            int number = 10; // Local Variable

            System.out.println( number );
            System.out.println( firstName );

        } // ==> Closing Block for if statement

        System.out.println( number );

        for ( int i = 0; i <= 10; i++ ) { // ==> Opening Block of for loop

            System.out.println( i );

        } // ==> Closing Block of for loop

        System.out.println( i );


    } // ==> Closing Block for main method

    System.out.println( firstName );

}
