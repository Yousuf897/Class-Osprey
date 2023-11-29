package tek.week_3.day_2;

public class SwitchStatement {

    public static void main(String[] args) {

        /*
        *
        * Monday        -- 1
        * Tuesday       -- 2
        * Wednesday     -- 3
        * Thursday      -- 4
        * Friday        -- 5
        * Saturday      -- 6
        * Sunday        -- 7
        *
        * */



/*        if ( weekDay == 1 ) {
            System.out.println( "Monday" );
        } else if  ( weekDay == 2 ) {
            System.out.println( "Tuesday" );
        } else if ( weekDay == 3 ) {
            System.out.println( "Wednesday" );
        } else if ( weekDay == 4 ) {
            System.out.println( "Thursday" );
        } else if ( weekDay == 5 ) {
            System.out.println( "Friday" );
        } else if ( weekDay == 6 ) {
            System.out.println( "Saturday" );
        } else {
            System.out.println( "Sunday" );
        }*/

        int weekDay = 3;

        switch( weekDay ) {
            case 1:
                System.out.println( "Monday" );
                break;
            case 2:
                System.out.println( "Tuesday" );
                break;
            case 3:
                System.out.println( "Wednesday" );
                break;
            case 4:
                System.out.println( "Thursday" );
                break;
            case 5:
                System.out.println( "Friday" );
                break;
            case 6:
                System.out.println( "Saturday" );
                break;
            case 7:
                System.out.println( "Sunday" );
                break;
            default:
                System.out.println("Invalid value, please enter again!");
        }

        System.out.println( "Compiler executed outside of switch statement!" );

    }

}
