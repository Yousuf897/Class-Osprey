package tek.week_6.day_3;

public class TwoDArray {

    public static void main(String[] args) {

        String[][] names = {

                //         0       1       2
                /* 0 */  {"Alex", "Erin", "Eric"},

                /* 1 */  {"Tony", "Mike"}
        };

/*        System.out.println( names[ 1 ][ 1 ] );

        System.out.println( names[ 1 ][ 2 ] );*/

        for ( int row = 0; row < names.length; row++ ) {
            for ( int col = 0; col < names[row].length; col++ ) {
                System.out.print(names[row][col] + " " );
            }
            System.out.println();
        }

    }

}
