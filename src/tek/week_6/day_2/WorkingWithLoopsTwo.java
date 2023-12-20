package tek.week_6.day_2;

public class WorkingWithLoopsTwo {

    // Print the numbers from 1 to 15 but do not print 5, 7 and 10

    // use continue keyword in order to skip a specific iteration

    public static void main(String[] args) {

        // Start a loop from 1 to 15
        for ( int number = 1; number <= 15; number++ ) {
            // check if the loop is at 5, 7 and 10
            // if Yes, skip!
            if ( number == 5 || number == 7 || number == 10) {
                continue;
            } else {
                // otherwise just print the other values!
                System.out.print(number + " ");
            }
        }

        System.out.println();

        System.out.println(" = = = = = = =  = = = = = = =  = = = = = = = ");

        // Start a loop from 1 to 15
        for ( int number = 1; number <= 15; number++ ) {
            // check if the loop is at 5, 7 and 10
            // if Yes, skip!
            if ( number == 5 || number == 7 || number == 10) {
                System.out.println("Skipped: " + number);
                continue;
            }
        }

    }
}
