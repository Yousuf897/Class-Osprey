package tek.week_2.day_1;

public class DataTypes {

    /*
    *   A: Primitive Data Types
    *
    *       1. byte  --> number
    *       2. short --> number
    *       3. int --> number
    *       4. long --> number
    *       5. float --> number (decimal values)
    *       6. double --> number (decimal values)
    *       7. char --> characters
    *       8. boolean  --> true, false
    *
    *
* Byte: Like a tiny jar, it holds small integer values ranging from -128 to 127.
byte smallNumber = 100;

Short: A slightly bigger jar that holds a wider range of integers (-32,768 to 32,767).
short mediumNumber = 30000;

int: The most commonly used jar for integers, with a range from -2^31 to (2^31 - 1).
int age = 30;

Long: A big jar for really large integers.
long bigNumber = 3000000000L;

Float: A bottle for floating-point (decimal) numbers, with 6-7 decimal places of precision. Float literals need an 'F' at the end.
float height = 5.9F;

Double: Like a bigger bottle for floating-point numbers, with up to 15 decimal places of precision.
double pi = 3.141592653589793;

Char: A tiny box for a single character.
char initial = 'A';

Boolean: A toggle switch that can be either true or false.
boolean isActive = true;

    *
    *   B: Non-Primitive Data Types (Reference Data Types)
    *
    *
Non-Primitive Data Types

These are more complex containers that can hold multiple values or a mix of different types. The main non-primitive types are:

String: Like a text box, holds a sequence of characters.
String name = "Alice";

Arrays: Like a tray with multiple slots, an array can hold multiple values of the same type.
int[] scores = {90, 85, 77};

Classes and Objects: Think of these as customizable containers that can hold both variables and
* methods.

Interfaces: These are like templates for classes, specifying what methods a class must have.


Understanding data types is crucial because it helps you choose the right type of "container"
* for your data, making your code both efficient and functional. Just like you wouldn't
* store milk in a basket or apples in a bottle, you want to make sure you're using the appropriate
*  data type for each piece of information in your Java programs.
    *
    * */



    public static void main(String[] args) {

        // byte -127 -- 127
        // (-32,768 to 32,767)

        byte byteNumber = 127;
        short shortNumber = 32767;

        // How to find min and max range of a specific data type?
        short shortMaxRange = Short.MAX_VALUE;
        short shortMinRange = Short.MIN_VALUE;

        System.out.println( "Short max range: " + shortMaxRange );
        System.out.println( "Short min range: " + shortMinRange );

/*      Short max range: 32767
        Short min range: -32768
*/

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * *" );

        System.out.println( "Int min value: " + Integer.MIN_VALUE );
        System.out.println( "Int max value: " +  Integer.MAX_VALUE );
/*
        Int min value: -214_748_364_8
        Int max value: 214_748_364_7
*/

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * *" );

        long longNumber = 9_223_372_036_854_775_807L;

        System.out.println( "Long min value:" + Long.MIN_VALUE );
        System.out.println( "Long max value:" + Long.MAX_VALUE );
/*
        Long min value: -9_223_372_036_854_775_808
        Long max value: 9_223_372_036_854_775_807
*/

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * *" );

        System.out.println( "Float min range: " + Float.MIN_VALUE);
        System.out.println( "Float max range: " + Float.MAX_VALUE);

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * *" );

        System.out.println( "Double min range: " + Double.MIN_VALUE);
        System.out.println( "Double max range: " + Double.MAX_VALUE);

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * *" );

/*
        * * * * * * * * * * * * * * * * * * * * * * * *
        *
        Float min range: 1.4E-45
        Float max range: 3.4028235E38
        *
        * * * * * * * * * * * * * * * * * * * * * * * *
        *
        Double min range: 4.9E-324
        Double max range: 1.7976931348623157E308
        *
        * * * * * * * * * * * * * * * * * * * * * * * *
    */


        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * *" );

        char singleLetter = 'A';

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * *" );


        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * *" );

        boolean isRecordingOn = true;
        boolean isStudentPassed = false;

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * *" );

        int number = 10;

        int[] numbers = {10, 20, 30, 40, 560};

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * *" );


    }



}
