package tek.week_2.day_3;

public class Question {

 /*
 * Promotion in Real Life:

Imagine you're organizing books on a bookshelf based on their sizes, from small pocketbooks to
*  larger encyclopedias. One day, you decide to place all your books into bigger encyclopedia-sized
* boxes, regardless of their original size. Small pocketbooks, medium-sized novels, and even slightly
*  larger textbooks all get their own big encyclopedia-sized box. By doing this, you're ensuring
*  that every book has at least the space of the largest book, even if it doesn't need it.
* This act of giving all the books the same larger space is similar to promotion in Java.


Promotion in Java:

In Java, promotion refers to the process where a smaller data type is automatically converted
* (or promoted) to a larger data type without any explicit request from the developer.
* This is done mainly to prevent loss of data and ensure compatibility when performing operations
*  with variables of different data types.

Here are some general rules for promotion:

    Byte, Short, and Char: When you use the byte, short, or char data types in an expression,
    *  they are promoted to int if any operand is an int.

    Int: If one operand is a long, the whole expression is promoted to long.

    Float: If one operand is a float, the entire expression is promoted to float.

    Double: If any of the operands are double, the entire expression is promoted to double.


byte a = 10;
int b = 20;
double c = 30.5;

double result = a + b + c;  // 'a' is promoted to int, then the entire expression is promoted
* to double.



Here, the byte value a gets promoted to int for the addition operation. After that, since
*  we're adding an int and a double, the entire expression is promoted to double to accommodate
* the larger data type.

This automatic conversion is useful, as it ensures that data isn't lost unintentionally.
* However, it's also crucial to be aware of this behavior, especially when working with mixed data
*  types, to ensure the results are as expected.

 *
 * */


    public static void main(String[] args) {

        byte a = 60;
        int b = 20;
        double result = a + b; // A. 80, B. 80.0

/*        80.0  */

        System.out.println( result );

        /*  Byte, Short, and Char: When you use the byte, short, or char data types in an expression,
         *  they are promoted to int if any operand is an int. */

        byte byteNumber = 1;
        short shortNumber = 10;
        char character = 'A';
        int intPromotion = byteNumber + shortNumber + character;
        //                     1      +  10         +  65

        System.out.println( intPromotion ); // --> 76
/*
        Int: If one operand is a long, the whole expression is promoted to long.*/

        int intNumber = 10;
        long longNumber = 65L;

        System.out.println( intNumber + longNumber );
        //                  int     +       long
        //                  int  -----> long


  /*      Float: If one operand is a float, the entire expression is promoted to float.*/

        short secondShortNumber = 20;
        int SecondIntNumber = 60;

        float floatNumber = secondShortNumber + SecondIntNumber;
        //   float              short         +   int
        // short + int --> float
        // 80.0
        System.out.println( floatNumber );


/*        Double: If any of the operands are double, the entire expression is promoted to double.*/

        byte byteSecondNumber = 1;
        long longSecondNumber = 100L;

        double doubleResult = byteSecondNumber + longSecondNumber;
        //                      byte +  long
        //                      byte + long --> double

        System.out.println(  doubleResult );

 /*       101.0 */


        System.out.println( Long.MAX_VALUE );
        System.out.println( Float.MAX_VALUE );
        System.out.println( Double.MAX_VALUE );


    }



    // Question 01:

    // short, byte , double, float --> double

    // Question 02:

    //   long + byte + int --> long


   // Question 03:

  // long + float + byte + short + int + long + int + short + double --> double

    /*
    * 1. byte
    * 2. short
    * 3. int
    * 4. long
    * 5. float
    * 6. double
    * */

    // 100.5 + 10 --> 110.5
    // float + long --> float

    // 20 + 2.6 --> 22 --> 22.6

}
