package tek.week_3.lab_session;

import java.util.Scanner;

public class NestedIfStatementExampleTwo {

    /*
    * Wearing a jacket based  on the weather!
    *
    * */

    /*
    *   If I want to attend the class!
    *   My laptop needs to have enough charge
    *   And I cannot Join more than 5 mins passed session start time
    *   If I enter before, I can join the session
    *   Otherwise I cannot join the session
    *
    *   if my laptop dosen't have enough charge I cannot join the session
    *
    * */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sessionStartTIme, userJoinedTime;
        String userInput;
        boolean laptopHasCharge;
        boolean isUserAllowedToEnterClass;

        sessionStartTIme = 5;

        System.out.println("Does your laptop has charge? "); // Yes or No --> Yes --> true , No --> False
        userInput = input.nextLine();

        if ( userInput.equals("Yes") ) {
            laptopHasCharge = true;
        } else {
            laptopHasCharge = false;
        }

        System.out.println("When did you joined the session? " );
        userJoinedTime = input.nextInt();

        if ( userJoinedTime > 5 ) {
            isUserAllowedToEnterClass = false;
        } else {
            isUserAllowedToEnterClass = true;
        }

        // If the user laptop has enough charge and also the user joined lessthan 5 mins --> He/She can join
        // If the user laptop has enough charge but user joined late --> your late....
        // otherwise if the user laptop dosen't have charge --> The user cannot even join the class

        // laptopHasCharge --> true            | Welcome to the class | true    |  You are late to the session
        // isUserAllowedToEnterClass --> true  |                      | false   |

        // laptopHasCharge --> false | User cannot join the class


        if ( laptopHasCharge ) {

            if ( isUserAllowedToEnterClass ) {
                System.out.println("Welcome to the class!");
            } else {
                System.out.println("Your late you cannot join the session");
            }
        } else {
            System.out.println("Charge your laptop first and then join the class!");
        }


    }

}
