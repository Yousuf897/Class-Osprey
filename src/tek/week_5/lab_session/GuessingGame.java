package tek.week_5.lab_session;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    /*
    *  * * * Guessing Game * * *
    *
    *  Computer is going to get a random number between a specific range
    *
    *  The user need to guess the number
    *
    *  if the number in which user is guessed is less than the number that computer selected
    *       ==> print, too low, go up!
    *
    *  if the number in which user is guessed in higher than the number that computer selected
    *       ==> print, too high, go low!
    *
    *  // else if the numbers are the same then user have found the random number
    *       ==> print, congrats! you have found the number, the number is X
    *
    * */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int computerSelectedNumber, userInput, score = 100;
        boolean flag = true;

        computerSelectedNumber = random.nextInt(10);

        System.out.println(" = = = = WELCOME TO GUESSING GAME! = = = = ");

        while ( flag ) {

            System.out.print("Enter a number: ");
            userInput = input.nextInt();

            /*     *  if the number in which user is guessed is less than the number that computer selected
             *       ==> print, too low, go up! */

            if ( userInput < computerSelectedNumber ) {
                System.out.println( "too low, go up!" );
                score = score - 10;
            } else if ( userInput > computerSelectedNumber ) {
                System.out.println( "too high, go low!" );
                score = score - 10;
            } else {
                System.out.println("Congrats!, you have found the number, and the number is: " + userInput);
                System.out.println("Your score is " + score);
                flag = false;
            }
        }

        /*
        * +
        * -
        * /
        * *
        *
        * */



    }

}
