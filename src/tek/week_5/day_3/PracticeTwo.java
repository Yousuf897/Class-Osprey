package tek.week_5.day_3;

import java.util.Scanner;

public class PracticeTwo {

    // 5. Ask the user to enter a name to search in the array
    // If array contains the name:
    // else print ==> "DESIRED NAME" is not available in the list.

    public static void main(String[] args) {

        String[] firstNames = {"Eric", "Alex", "John", "Martin", "Matt", "Tony"};

        Scanner input = new Scanner(System.in);
        String name;

        System.out.print("Enter a name to search for in the array: ");
        name = input.next();

        for ( int index = 0; index < firstNames.length; index++ ) {

            if ( name.equals(firstNames[index]) ) {
                System.out.println( firstNames[index] + " is located at index [ " + index + " ]" );
                break;
            } else {
                System.out.println( name + " is not available in the list" );
            }

/*            if ( name.equals(firstNames[index]) ) {
                System.out.println( firstNames[index] + " is located at index [ " + index + " ]" );
                break;
            }*/

        }


    }

}
