package tek.week_3.lab_session;

import java.util.Scanner;

public class NestedIfStatementExample {


/*
    2. Nested Conditions:
    In a game, a character can attack an enemy if they have a weapon and enough energy.
    If the hasWeapon variable is true and the energyLevel is greater than 50, display "Attack the enemy!".
    If hasWeapon is true but energy is not sufficient, display "Need more energy to attack.".
    If hasWeapon is false, regardless of the energy level, show "Find a weapon first!"
*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean hasWeapon;
        int energyLevel;

        System.out.print("Do you have weapon: (true or false) " );
        hasWeapon = input.nextBoolean();

        System.out.print("What is your energy level: ");
        energyLevel = input.nextInt();

        if ( hasWeapon ) {

            if ( energyLevel > 50) {
                System.out.println("Attack the enemy!");
            } else {
                System.out.println("Need more energy to attack.");
            }

        } else {
            System.out.println("Find a weapon first!");
        }

    }

}
