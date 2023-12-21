package tek.week_6.day_3;

public class ActivityOne {

    // write a java program that is going to print the elements of an array
    // String[] names = { "Alex", "Tony", "Eric", "Erin", "Trevor" };

    // when reached the second last index, stop the loop and print the value.
    // for example --> in the above array "Erin" is the second last element so stop the loop in
    // that index and only print that value

    public static void main(String[] args) {

        // length            1        2       3       4         5       6       7
        String[] names = { "Alex", "Tony", "Eric", "Erin", "Trevor", "Mike", "John" };
        // index            0        1       2        3         4      5        6

        // formula to find the last index --> N - 1 --> 5 - 1 --> 4 ==> is the last index

        // Loop through the elements of array

        for ( int index = 0; index < names.length; index++ ) {

            // check if we are at last index

            if ( index == names.length - 2 ) {
                // if yes, print the value first and then stop the loop
                System.out.println( names[index] );
                break;
            }
            // else --> Do nothing!
        }


    }

}
