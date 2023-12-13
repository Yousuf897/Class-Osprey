package tek.week_5.day_2;

public class ForLoopActivityOne {

    public static void main(String[] args) {

        String[] names = { "Bob", "Eric", "Tony", "Lydia", "John", "Trevor", "Erin" };

        System.out.println("The length of array is: " + names.length ); // index - 0 - 7 - 1 = 6

/*      System.out.println( names[ 0 ] );
        System.out.println( names[ 1 ] );
        System.out.println( names[ 2 ] );
        System.out.println( names[ 3 ] );
        System.out.println( names[ 4 ] );
        System.out.println( names[ 5 ] );
        System.out.println( names[ 6 ] );     startPoint = 0  || start++
                                              condition =  startPoint <= 6

        array length is ==> 7 - 1 = 6
*/

        for ( int index = 0; index <= 6; index++ ) {
            System.out.println( index + 1 + ". " + names[ index ] + " is located at index [ " + index + " ]"  );
        }

        /*
            0   + 1 = 1
            1 + 1 =  2
            2 + 1 = 3
        * index + 1 = 1
        *
        * */


        /*
            1. Bob is located at index [ 0 ]

        * */


    }

}
