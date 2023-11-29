package tek.week_3.day_2;

import java.util.Scanner;

public class IfStatement {

    /*

    If Control Statement

    Real-life analogy:
    Imagine you're about to leave your house. Before you step out, you peek through the window.
    If it's raining, you decide to take an umbrella with you.

    Java-related explanation:
    The "if" control statement in Java allows you to make a decision based on a condition.
    If the condition is true, then the code inside the "if" block gets executed.

if (isRaining) {
    takeUmbrella();
}

if ( Condition ) {


 } else {


 }


*/


    public static void main(String[] args) {

        // Ask the user for int number
        // if the user number is equal to 5 --> Print you are passed!
        // else we are going to print --> The number is not equal to 5!

        Scanner input = new Scanner(System.in);
        int userNumber;

        System.out.println( " Enter a number: " );
        userNumber = input.nextInt();

        if ( userNumber ==  5 ) {
            System.out.println( "you are passed!" );
        } else {
            System.out.println( "The number is not equal to 5!" );
        }

        System.out.println( "I am outside of the if statement" );

    }


}
