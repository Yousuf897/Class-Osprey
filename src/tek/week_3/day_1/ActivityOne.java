package tek.week_3.day_1;

public class ActivityOne {

/*
    Activity 1: Widening Casting

    Objective: Understand how Java automatically casts from smaller to larger data types.

    Instructions:

    1. Declare a variable of type int and assign it a value.
    2. Declare a variable of type double.
    3. Assign the int variable to the double variable without using explicit casting.
    4. Print both variables and observe the results.

    */

    public static void main(String[] args) {

        int number = 10;

        double decimalNumber;

        decimalNumber = number;

        System.out.println( number );

        System.out.println( decimalNumber );

    }
}
