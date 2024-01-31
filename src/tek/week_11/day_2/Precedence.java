package tek.week_11.day_2;

public class Precedence {

    // ( 1 )
    // 3 * 2 * 9 * 1 * 3 + 0 * 0 + 5 = 5
    // 6 * 9 * 1 * 3 + 0 * 0 + 5
    // 54 * 1 * 3 + 0 * 0 + 5
    // 54  * 3 + 0 * 0 + 5
    // 162 + 0 * 0 + 5
    // 162 + 0 + 5
    // 167

    // ( 2 ) || 1: 656
    // ( 5 + 3 ) * 1 + 9 * 4 * ( 6 * 3 )
    // 8 * 1 + 9 * 4 * 18
    // 8 + 9 * 4 * 18
    //  8 + 9 * 72
    // 8 + 648
    // 656


    public static void main(String[] args) {

        System.out.println( 3 * 2 * 9 * 1 * 3 + 0 * 0 + 5 );

        System.out.println( ( 5 + 3 ) * 1 + 9 * 4 * ( 6 * 3 ) );


    }

}
