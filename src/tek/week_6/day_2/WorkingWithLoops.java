package tek.week_6.day_2;

public class WorkingWithLoops {

    // Write a java program to print numbers from 1 to 10 but stop when we reach 5

    public static void main(String[] args) {

        // Start the loop from 1 to 10
        for ( int number = 1; number <= 10; number++ ) {
            // Check if loop has reached 5
            if ( number == 5 ) {
                // if yes stop
                System.out.println(number);
                break;
            } else {
                // else continue printing
                System.out.println(number);
            }

        }


/*        int number = 1;

        while ( number <= 10 ) {
            if ( number == 5 ) {
                System.out.println(number);
                break;
            } else {
                System.out.println(number);
                number++;
            }
        }


        do {
            if ( number == 5 ) {
                break;
            } else {
                System.out.println(number);
                number++;
            }
        } while ( number <= 10 );*/

    }

}
