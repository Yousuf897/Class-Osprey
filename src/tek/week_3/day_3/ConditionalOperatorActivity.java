package tek.week_3.day_3;

import java.util.Scanner;

public class ConditionalOperatorActivity {

/*
    Question: Favorite Color Picker

    You have two color options: String color1 = "Red"; and String color2 = "Blue";.
    You like the color "Red" more than "Blue".
    Using the conditional operator, determine which color is your favorite.
    Store your favorite color in a variable called favoriteColor.
    Print out your favorite color. What is the color?
*/

    public static void main(String[] args) {

        String color1 = "Red";
        String color2 = "Blue";
        String favoriteColor;

        // Color of choice --> Red

        favoriteColor  = ( color1.equals("Blue") ) ? color1 : color2;

        System.out.println("My favorite color is: " + favoriteColor);

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );



        Scanner input = new Scanner(System.in);
        String colorOne, colorTwo, favColor;

        System.out.println("First of all, enter two colors!");

        System.out.print("Enter first color: ");
        colorOne = input.nextLine();

        System.out.print("Enter second color: ");
        colorTwo = input.nextLine();

        System.out.print("And which one is your Fav color:  ");
        favColor = input.nextLine();

        favoriteColor = ( colorOne.equals(favColor) ) ? colorOne : colorTwo;

        System.out.println( favoriteColor + " is your favorite color!" );



        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );


    }

}
