package tek.week_4.day_2;

public class EqualityAndInequalityOperator {

    /*
    *   In genral, we have two data types in java!
    *
    *  1. Primitive Data Types: byte, short, int, long, float, double, boolean, char
    *  2. Non-Primitive Data Types (Reference): String, array, object, class, interfaces
    *
    *
    * */


/*
    Real-life analogy:
    Imagine you have two apples. You want to compare if they weigh the same or not.
    You place them on two sides of a balance scale. If they weigh the same,
    the scale remains balanced. If one apple is heavier, the scale will tip to one side.

    In Java, equality operators are used to compare two values:

    == (Equality): This operator checks if two values are equal. If they are, it returns true;
    otherwise, it returns false.

    != (Inequality): This operator checks if two values are not equal. If they are not equal,
    it returns true; otherwise, it returns false.


    It's crucial to note that for primitive types (int, char, double, etc.), these operators compare
    the actual values. But for objects, they compare memory locations (i.e., reference equality),
    not the actual content of the objects. For content equality with objects, one often uses methods like
    .equals().
*/



    public static void main(String[] args) {

        String firstName = "Bob";        // Bob --> 101 --> firstName = 101
        String lastName = "Alexander";  // Alexander --> 102 --> lastName = 102

        System.out.println( firstName.equals(lastName) );

        int numberOne = 100;            // numberOne = 100
        int numberTwo = 200;            // numberTwo = 200

        System.out.println( numberOne == numberTwo );

        /*
        *
        *   1. ( = ): Assignment --> Assign a value to your variable
        *   2. ( == ): Equality Operator --> Compare two primitive data types (or if uses with reference
        *       data types, it's going to compare their address (reference) not their actual value).\
        *   3. ( ,equals() ): Equality --> It's compare the actual values of two or multiple reference
        *       data types
        *
        * */

        // Compare if two numbers are not equal with each other, print if they are not equal
        // print "XYZ" if they are equal

        //  100  with 200
        if ( numberOne != numberTwo) {
            System.out.println( numberOne + " is not equal to " + numberTwo );
        } else {
            System.out.println( numberOne + " is equal to " + numberTwo);
        }


    }

}
