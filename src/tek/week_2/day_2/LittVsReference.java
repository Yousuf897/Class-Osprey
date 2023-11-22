package tek.week_2.day_2;

public class LittVsReference {

    /*
    * 1. What is a Literal?

        In programming, a literal refers to any value that's directly written into the code.
        * It represents a fixed value. You can think of literals as the explicit data we
        * provide in our programs.
    *
    *
    * 2. Reference Variable?
    *
    * 2. What is a Reference Variable?

A reference variable is a variable that holds the memory address (or reference) of an object,
* rather than the actual object itself. It's essentially a pointer to the location in memory
* where the object data is stored.

In Java, all non-primitive data types (like objects and arrays) are referred to by reference
* variables. The basic data types (int, char, float, etc.) are the exception; they use value
* variables, not reference variables.

Example:

Let's consider a simple String:

java

String greeting = "Hello";

Here, greeting is a reference variable. It doesn't contain the string "Hello" directly; instead,
* it holds a reference (think of it as an address) to the memory location where "Hello" is stored.
    *
    *  1.  greeting --> BOX --> 101
    *  2.  greetingTwo --> BOX --> 101
    *  3. String value = "Hello"; --> 101
    *
    *   MEMORY --> 1. Hello -->> ADDRESS: 101
    *
    *
    * */


    public static void main(String[] args) {



        /*
        * number = 1 --> int Literal
        * character = A  --> character Literal
        * String = "Hello Java" --> String Literal
        * boolean = false --> boolean Literal
        *
        * */

        int number = 1; // -->

        String firstName = "Alex"; // --> Alex --> 105
        String lastName = "Alex"; // --> 105

        String middleName = "Eric"; // --> Eric --> 110
        String name = "Eric"; // --> 110

    }
}
