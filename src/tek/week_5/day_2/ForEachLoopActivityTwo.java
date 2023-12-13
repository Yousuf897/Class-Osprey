package tek.week_5.day_2;

public class ForEachLoopActivityTwo {

    public static void main(String[] args) {

        int[] arrayNumbers = { 3, 7, 2, 8, 5 };
        int total = 0;

        for ( int number : arrayNumbers ) {
           total = total + number;
        }

        System.out.println("The sum of all elements is: " + total);

       for ( int element : arrayNumbers ) {
           if ( element % 2 == 0) {
               System.out.println( element );
           }
       }

       boolean[] booleanArray = { true, false, true, false, false, true };


       for (boolean element : booleanArray ) {
           System.out.println( element );
       }

       // Print the odd numbers
        for ( int element : arrayNumbers ) {

            if ( element % 2 != 0 ) {
                System.out.print ("Odd numbers: " + element + ", " );
            }
        }


    }

}
