package tek.week_4.day_2;

public class RelationalOperator {

    /*  Relational Operators:

    * 1. less than ( < ):
    * 2. greater than ( > ):
    * 3. less than and equal ( <= ):
    * 4. greater than and equal ( >= ):
    *
    * */

  /*  Imagine you're lining up books on a shelf based on their heights.
  You will need to compare the heights of these books to decide their positions:
  which book is taller, which one is shorter, and which ones are of equal height.


    Java-related explanation:
    Relational operators are used in Java to compare two values and establish a relationship between
    them:

    > (Greater Than): Checks if the value on the left is greater than the one on the right.
    < (Less Than): Checks if the value on the left is less than the one on the right.
    >= (Greater Than or Equal To): Checks if the value on the left is greater than or equal to the one on the right.
    <= (Less Than or Equal To): Checks if the value on the left is less than or equal to the one on the right.
*/

    public static void main(String[] args) {

//  > (Greater Than): Checks if the value on the left is greater than the one on the right.
        System.out.println( 10 > 10 );
        int numberOne = 20;
        int numberTwo = 20;
        System.out.println( numberOne > numberTwo );

        if ( numberOne > numberTwo ) System.out.println("true");
        else System.out.println("false");

//  >= (Greater Than or Equal To): Checks if the value on the left is greater than or equal to the one on the right.

        System.out.println( 10 >= 10 );
        System.out.println( numberOne >= numberTwo );

        if ( numberOne >= numberTwo ) System.out.println("true");
        else System.out.println("false");

//  < (Less Than): Checks if the value on the left is less than the one on the right.

        System.out.println( 10 < 10 );
        System.out.println( numberOne < numberTwo );

        if ( numberOne < numberTwo ) System.out.println("false");
        else System.out.println("true");

//  <= (Less Than or Equal To): Checks if the value on the left is less than or equal to the one on the right

        System.out.println( 10 <= 10 );
        System.out.println( numberOne <= numberTwo );

        if ( numberOne <= numberTwo ) System.out.println("true");
        else System.out.println("false");

    }
}
