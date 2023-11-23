package tek.week_2.day_3;

public class Precedence {
/*

    Precedence in Daily Life:

    Imagine you're at a dinner party and you're deciding the order in which you'll eat your food.
    Based on etiquette or personal preference, you might follow these steps:

    Starters/Appetizers: Maybe some soup or salad.
    Main Course: Perhaps a steak or some pasta.
    Dessert: A slice of cake or ice cream.

            Even if all the dishes are placed in front of you at the same time, you'll have an
            inherent understanding of which dish to start with and which to finish with.
            This is because, in our cultural or personal understanding, there's a "precedence"
            or order to things.

    Precedence in Java:

    In Java (and most programming languages), certain operations are performed before others
    based on their "precedence". This is essential to ensure calculations and evaluations are
     done in the correct order, especially when multiple operations are combined in a single
     expression.

    For example, in the mathematical expression 3 + 5 * 2, even though addition comes first from
    left to right, multiplication has a higher precedence. So, the multiplication is done before
     the addition, resulting in 3 + 10 = 13, and not (3 + 5) * 2 = 16.

    When you're not sure about the order, or when you want to override the natural precedence,
    you can use parentheses () to make things clear. Just like in mathematics, operations inside
    parentheses will be executed before those outside.

    For example:

            3 + 5 * 2 would be 13 because multiplication comes before addition.
            (3 + 5) * 2 would be 16 because the parentheses change the order of operations.

    Understanding operator precedence is key to writing clear and correct expressions in Java.
*/

    public static void main(String[] args) {

        // Question 01
        // 4 + 3 * ( 2 + 4 ) // 1. 22   2. 42
        // A.  4 + 3 * 6
        // B. 4 + 18
        // C. 22

        // Question 02
        // 10 * 2 + 3 + 4 + 5 - 5 * [ 2 + ( 1 + 3 ) + 5 ] + 5 // A.32 B. 66 C. 250 D. 25.5, E.-18
        // A. 10 * 2 + 3 + 4 + 5 - 5 * [ 2 + 4 + 5 ] + 5
        // B. 10 * 2 + 3 + 4 + 5 - 5 * 11 + 5
        // C. 20 + 3 + 4 + 5 - 55 + 5
        // D. 23 + 4 - 50 + 5
        // E. 27 - 50 + 5
        // F. - 23 + 5
        // G. -18

        /* -18
        -18
*/


        System.out.println( 10 * 2 + 3 + 4 + 5 - 5 * ( 2 + ( 1 + 3 ) + 5 ) + 5  );

        int result =
                 10 * 2 + 3 + 4 + 5 - 5 *  (  2 + ( 1 + 3 ) + 5 ) + 5;

        System.out.println( result );


        System.out.println( ( 72 / 2 ) / 3 );

        System.out.println( ( 3 * ( 2 * 4 + 5 - 3 ) + 1 ) + ( 1 + 6 ) );

/*        38  */
    }


    // Question 03;
    // Question: ( 72 / 2 ) / 3 --> Answers --> A. 12
    // A. 36 / 3
    // B. 12

    // Question 04;
    // Question: ( 3 * ( 2 * 4 + 5 - 3 ) + 1 ) + ( 1 + 6 ) --> Answers --> A. 28, B. 38, C. 48
    // A. ( 3 * ( 8 + 5 - 3 ) + 1 ) + ( 1 + 6 )
    // B. ( 3 * ( 8 + 5 - 3 ) + 1 ) + ( 1 + 6 )
    // C. ( 3 * ( 13 - 3 ) + 1 ) + ( 1 + 6 )
    // D. ( 3 * 10 + 1 ) + ( 1 + 6 )
    // E. ( 30 + 1 ) + ( 1 + 6 )
    // F. 31 + 7
    // G. 38
}
