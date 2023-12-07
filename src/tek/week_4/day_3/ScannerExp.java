package tek.week_4.day_3;

import java.util.Scanner;

public class ScannerExp {

    public static void main(String[] args) {

        String firstName = "Bob";

/*        names[0] = "Bob";
        names[0] =  firstName;*/

        System.out.println( firstName ); // bob

        firstName = "Alex";

        System.out.println( firstName ); // Alex

        // Grab 5 values from the user and store them in my array
        String firstValue;
        String secondValue;


        String userInput;

        String[] names = new String[2];

        Scanner input = new Scanner(System.in);

        System.out.print("Value 1: ");
        userInput = input.nextLine(); // Eric

        System.out.println( userInput ); // Eric

        names[0] = userInput; // Eric Store it in location 0

        System.out.print("Value 2: ");
        userInput = input.nextLine(); // Bob

        names[1] = userInput;

        System.out.println( userInput ); // Bob


        System.out.println( names[0] + " " + names[1]);






    }

}
