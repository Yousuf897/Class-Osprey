package tek.week_3.lab_session;

import java.util.Scanner;

public class ConditionalOperator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sessionStartTIme, userJoinedTime;
        String userInput;
        boolean laptopHasCharge;
        boolean isUserAllowedToEnterClass;

        sessionStartTIme = 5;

        System.out.println("Does your laptop has charge? "); // Yes or No --> Yes --> true , No --> False
        userInput = input.nextLine();

        laptopHasCharge = ( userInput.equals("Yes") ) ? true : false;

        System.out.println("When did you joined the session? " );
        userJoinedTime = input.nextInt();

        isUserAllowedToEnterClass = ( userJoinedTime < sessionStartTIme ) ? true : false;

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
