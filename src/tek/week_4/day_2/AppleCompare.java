package tek.week_4.day_2;

import java.util.Scanner;

public class AppleCompare {

/*
    Question: Apple Comparison
    You have two apples with weights: double apple1Weight = 150.0; and double apple2Weight = 155.5;.
    Compare the weights of the two apples.

    Determine:

    If the weights are the same.
    If the weights are different.
    Print out the results of your comparisons.
*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double firstAppleWeight, secondAppleWeight;

        System.out.println("Enter the weight of the first apple: ");
        firstAppleWeight = input.nextDouble();

        System.out.println("Enter the weight of the first apple: ");
        secondAppleWeight = input.nextDouble();

        if ( firstAppleWeight == secondAppleWeight ) {
            System.out.println("The weight of both apples are the same!");
        } else {
            System.out.println("The weight of both apples are not the same!");
        }

        // If my first apple is heavier than second one --> first apple is heavier
        if ( firstAppleWeight > secondAppleWeight ) {
            System.out.println("The first apple is heavier with the weight of " +  firstAppleWeight);
        } else if ( firstAppleWeight < secondAppleWeight ) { // if weight of the first apple is less than second one
                // --> second apple is heavier
            System.out.println("The second apple is heavier with the weight of " +  secondAppleWeight);
        } else { // else print a message for the user and mention that both of the apples are weight the same!
            System.out.println("Both apples are the same!");
        }





    }
}
