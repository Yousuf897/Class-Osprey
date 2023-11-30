package tek.week_3.day_3;

public class BooleanOperators {

/*
    Real-life analogy:
    Imagine you have two light switches controlling a single light bulb.
    For the light to turn on, specific conditions related to both switches need to be met.

    For example:

    Both switches are ON.
    Only one switch is ON, but not both.
    At least one of the switches is ON.

    These scenarios reflect the basic boolean logic operations: AND, OR, and XOR (exclusive OR).

    Java-related explanation:
    Boolean logic operations deal with true and false values and determine the result based on
    specific conditions:

    1. AND (&&): Both conditions must be true.

    true && true = true
    true && false = false
    false && true = false
    false && false = false

   if ( condition && condition )

    */

    public static void main(String[] args) {

        int number = 7;         // 5 ------- 10 --> True --> False

        if ( number >= 5 && number <= 10 ) {
            System.out.println("Yes, the number " + number + " is greater than 5 and less than 10");
        } else {
            System.out.println("The number " + number + " is not greater than 5 and less than 10.");
        }

    }
}
