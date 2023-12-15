package tek.week_5.lab_session;

public class Loops {

    public static void main(String[] args) {


        // 1. for loop

        /*
        *
        *   for ( Initialization; condition; iteration ) {
        *       // what ever you want you want to execute!
        *   }
        *
        * */
                // value of i = 4
        for ( int i = 1; i <= 3; i++ ) {
            System.out.println("TekSchool");
        }

        // TekSchool
        // TekSchool
        // TekSchool

        // Multiplication table for a specific number: for example number = 4

        /* 1 to 10
        *
        * 1 * 4 = 4
        * 2 * 4 = 8
        * 3 * 4 = 12
        * 4 * 4 = 16
        * ..
        * ..
        * ..
        *
        * */


        // Multiplication table for a specific number: for example number = 4

        /* 1 to 10
         *
         * 1 * 4 = 4
         * 2 * 4 = 8
         * 3 * 4 = 12
         * 4 * 4 = 16
         * ..
         * ..
         * ..
         *
         * */

        int number = 7;

        for ( int i = 1; i <= 10; i++ ) {
            System.out.println( i + " * " + number + " = " + ( i * number ) );
        }

        // 2. for each loop (enh

        // 2. for each loop (enhanced loop)
        // 3. while loop


    }

}
