package tek.week_6.day_3;

public class ActivityFour {

    public static void main(String[] args) {

        // length            1        2       3       4         5       6       7
        String[] names = { "Alex", "Tony", "Eric", "Erin", "Trevor", "Mike", "John", "Alixe" };
        // index            0        1       2        3         4      5        6

        // formula to find the last index --> N - 1 --> 5 - 1 --> 4 ==> is the last index

        // Loop through the elements of array

        int index = 0;

       do {
            // check if we are at last index

            if ( index == names.length - 2 ) {
                // if yes, print the value first and then stop the loop
                System.out.println( names[index] );
                break;
            }
            index++;
            // else --> Do nothing!
        } while ( index < names.length);


    }

}
