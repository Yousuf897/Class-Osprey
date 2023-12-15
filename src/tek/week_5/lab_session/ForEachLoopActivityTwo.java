package tek.week_5.lab_session;

public class ForEachLoopActivityTwo {

    public static void main(String[] args) {

        /*

        *  for ( DataType IteratorName : NameOfArray ) {
        *
        *       // body of loop
        *
        *   }
        *
        * */

        String[] arrayOfNames = { "Alex", "Mike", "Lydia", "Eric" };
        int[] arrayOfNumbers = { 10, 20, 30, 40, 50 };

        for ( String name : arrayOfNames ) {
            System.out.print( name + " " );
        }

        System.out.println();

        for ( int i = 0; i < arrayOfNames.length; i++ ) {
            System.out.print( arrayOfNames[ i ] + " " );
        }

        System.out.println();

        for ( int number : arrayOfNumbers ) {
            System.out.print( number + " " );
        }

    }


}
