package tek.week_3.day_1;

public class ActivityFive {

    public static void main(String[] args) {

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );

        int number = 15; // 16, 17, 16, 15, 14, 15

        System.out.println( number++ ); // --> 15
        System.out.println( number++ ); // --> 16
        System.out.println( number-- ); // --> 17
        System.out.println( number-- ); // --> 16
        System.out.println( --number ); // --> 14
        System.out.println( ++number ); // --> 15
        System.out.println( number ); // --> 14, 15

/*      Step 01: 15 (Printed) then --> 15 + 1 = 16
*       Step 02: 16 (Printed) then --> 16 + 1 = 17
*       Step 03: 17 (Printed) then --> 17 - 1 = 16
*       Step 04: 16 (Printed) then --> 16 - 1 = 15
*       Step 05: 15 -1 (Performed first) then --> 14 (Printed)
*       Step 06: 14 + 1 (Performed first) then --> 15 (Printed)
*       Step 07: 15
*
*  */

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );


    }

}
