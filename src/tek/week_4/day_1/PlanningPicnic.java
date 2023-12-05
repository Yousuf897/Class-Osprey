package tek.week_4.day_1;

import java.util.Scanner;

public class PlanningPicnic {

    /*
    *   Question: Planning a Picnic

        You check the weather forecast and find out two details:
        *
        boolean isSunny = true; (This indicates if the day is sunny.)
        boolean isPleasantTemperature = false; (This indicates if the temperature is pleasant.)
        *
        Determine if:
        *
        Both conditions are met for a perfect picnic.
        At least one condition is favorable.
        The weather is not sunny.
        Based on the conditions, decide if you'll go on the picnic or postpone it.
        Print out your decision.
    * */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean isSunny, isPleasantTemperature;
        int userSelection;

        System.out.println("Is the weather sunny?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print("Your Answer: ");
        userSelection = input.nextInt();

        isSunny = ( userSelection == 1 ) ?  true : false;

        System.out.println("Is the temperature pleasant?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print("Your Answer: ");
        userSelection = input.nextInt();

        isPleasantTemperature = ( userSelection == 1 ) ?  true : false;

        if ( isSunny && isPleasantTemperature ) {
            System.out.println( "We can go to the picnic!" );
        } else if ( isSunny || isPleasantTemperature ) {
            System.out.println( "We can go to the picnic!" );
        } else {
            System.out.println("We cannot go to the picnic!");
        }


    }
}
