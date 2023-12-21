package tek.week_6.day_3;

public class NestedForLoopActivityThree {

    /*
     *
     * 1 1 1
     * 1 1 2
     * 1 1 3
     * 1 2 1
     * 1 2 2
     * 1 2 3
     * 2 1 1
     * 2 1 2
     * 2 1 3
     * 2 2 1
     * 2 2 2
     * 2 2 3
     *
     * */

    public static void main(String[] args) {

       for ( int i = 1; i <= 3; i++ ) {
           for ( int j = 1; j <= 3; j++) {
               for ( int k = 1; k <= 3; k++ ) {
                   System.out.println( i + " " + j + " " + k );
               }
           }
           System.out.println();
       }

    }

}
