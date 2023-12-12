package tek.week_5.day_1;

public class TwoDArray {

    public static void main(String[] args) {


        // Dynamic Implementation

        String[][] firstNames = new String[2][2];
        // String[] lastNames = new String[2];

        firstNames[0][0] = "Alex";
        firstNames[0][1] = "Lydia";
        firstNames[1][0] = "Trevor";
        firstNames[1][1] = "Eric";

        System.out.println( firstNames[0][0] );
        System.out.println( firstNames[0][1] );
        System.out.println( firstNames[1][0] );
        System.out.println( firstNames[1][1] );

        // Static Implementation

        String[][] lastNames = {
                /*       0        1 */
           /* 0 */   { "Alex", "Lydia" },
         /*   1 */   { "Eric", "Bob" }
        };

        System.out.println( lastNames[1][1] );



    }

}
