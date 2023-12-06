package tek.week_4.day_2;

import java.util.Scanner;

public class ActivityThree {

/*
    Online Game Access

    Objective: Check if a user can access a specific level in an online game.

    A user wants to access a special level in a game.
    The requirements are that the user must either be a VIP member or have played the game for
    more than 100 hours.

    The user provides their details:

    boolean isVIP = false;
    int gameHoursPlayed = 105;

    (Both values can be changed for testing)

    Determine if the user can access the special level.
    if VIP member or hoursPlayed is greater than 100
    Print out if the user has access or not.
*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String isVIP;
        int gameHoursPlayed;

        System.out.println( " = = = = = = = = = = Online Game Access  = = = = = = = = = = " );

        System.out.print("How many hours have you played the game: ");
        gameHoursPlayed = input.nextInt();

        System.out.print("Are you a VIP member: ");
        isVIP = input.next();

        System.out.println(" * * * * * RESULT * * * * * ");

        /* if VIP member or hoursPlayed is greater than 100 */
        if ( isVIP.equals("Yes") || gameHoursPlayed > 100) {
            System.out.println("Congrats, you have access!");
        } else {
            System.out.println("Sorry, you do not have access to the game!");
        }



        System.out.println(" * * * * * * * * * * * * * ");


        System.out.println( "  = = = = = = = = = = = = = = = = = = = =  = = = = = = = = = =  " );



    }

}
