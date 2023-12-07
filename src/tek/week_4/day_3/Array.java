package tek.week_4.day_3;

import java.util.Arrays;

public class Array {

/*

    Arrays

    Real-life Example:

    Imagine you have a bookshelf in your room. This bookshelf has a specific number of slots where
    you can place books. Each slot holds exactly one book. If you want to refer to a book,
    you know its position on the shelf, like the third book from the left or the fifth book from the right.
    An array works similarly.

    Programming Explanation:

    In programming, an array is a data structure that can hold more than one value at a time.
    It is a collection of variables that are accessed with an index number.
    All items in an array are of the same data type and each has a unique index,
    starting from 0 (similar to the slot number in our bookshelf example).

    Java Implementation:

    There are mainly two ways to initialize an array:

    Static Initialization: Here, you specify the size of the array and initialize
    it with values at the same time.


    int[] numbers = {10, 20, 30, 40, 50};


    Dynamic Initialization: In this method, you specify the size of the array first, and then you
    can set values using the index.

    int[] numbers = new int[5]; // Declare an array of size 5
    numbers[0] = 10;  // The first element
    numbers[1] = 20;  // The second element
// ... and so on.

*/


    public static void main(String[] args) {

        byte byteNumber = 10;
        short shortNumber = 20;
        int intNumber = 5;
        long longNumber = 10000L;
        float floatNumber = 10.5f;
        double doubleNumber = 20.5;
        char character = 'A';
        boolean booleanValue = true;
        String message = "Welcome to TekSchool!";
//        String firstName = "Bob";

        int number; // single empty box that can store one single value!
        number = 30;

        System.out.println( number );

        // DataType[] arrayName = new DataType[ArraySize];
        int[] numbers = new int[15]; // Single empty box that can store 5 int values!

        // Do I have anything in this location? n - 1 --> 5 - 1 = 4  || 15 - 1 = 14
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // How Can I print the values inside my array?

        System.out.println( numbers[0] );
        System.out.println( numbers[1] );
        System.out.println( numbers[2] );
        System.out.println( numbers[3] );
        System.out.println( numbers[4] );

        // I have 5 empty locations and right now I have stored 5 values, what if I want to store the sixth value?
        numbers[3] = 60;

        System.out.println( numbers[3] + " " +  numbers[4] );

        // How do I know what is the length of my array? .length --> Give you the length of array
        System.out.println("The length of my array is: " + numbers.length );

/*      String firstName = "Bob";
        String firstNames = new String[10];
        char[] characters = new char[5];
        char*/

        char[] characters = new char[5];
        String names = Arrays.toString(new String[10]);
        String[] lastNames = new String[10];
        boolean[] booleanValues = new boolean[2];

        booleanValues[0] = true;
        booleanValues[1] = false;

        characters[0] = 'A';
        characters[1] = 'B';


    }

}
