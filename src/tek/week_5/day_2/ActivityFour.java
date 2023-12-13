package tek.week_5.day_2;

public class ActivityFour {

/*
    Activity 3: Even Numbers

    1. Create a program that prints all even numbers between 1 and 10 using a for loop.
    2. Consider how you can determine if a number is even. (Hint: Use the modulus operator %).
    3. Print each even number with a message like "Even number: " followed by the number.

    number % 2 == 0 ==> Even number

*/

    public static void main(String[] args) {

        // Print even numbers from 1 to 10
        for ( int number = 1; number <= 10; number++ ) {
            // Even number: X
            if ( number % 2 == 0 ) {
                System.out.println( "Even number: " + number);
            }
        }

    }

}
