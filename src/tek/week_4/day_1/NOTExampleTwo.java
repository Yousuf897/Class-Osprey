
package tek.week_4.day_1;

import java.util.Scanner;

public class NOTExampleTwo {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double originalPrice;
        int userSelectOption;
        boolean isMember = false;
        double finalPrice = 0;
        double discount  = 0;

        System.out.print("What is the original price for the item: ");
        originalPrice = input.nextInt();

        System.out.println("Are you a member of our store: (true, false)");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print("Please enter your choice: ");
        userSelectOption = input.nextInt();

        switch ( userSelectOption ) {
            case 1:
                isMember = true;
                break;
            case 2:
                isMember = false;
                break;
            default:
                System.out.println("Invalid input, please try again!");
                break;
        }

        // How we can calculate the 10% discount! || originalPrice * 0.1

        // if user is a member, calculate the final price and give them discount
        if ( isMember ) {
            discount = (originalPrice * 0.1);
            finalPrice = originalPrice - discount;
        } else {
            finalPrice = originalPrice;
        }
        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );

        System.out.println("congratulations! you have gotten a 10% discount.");
        System.out.println("Your final price is: " + finalPrice);
        System.out.println("congratulations, you got $" + discount + " discount and your final price is: " + " $" + finalPrice);

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );

        //

        // if user is not a member then give them the actual price, else calculate the discount and give
        // them the final value

        if ( !isMember ) {
            finalPrice = originalPrice;
        } else {
            finalPrice = originalPrice - (originalPrice * 0.1);
        }
        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );

        System.out.println("Your final price is: " + finalPrice);

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );



    }

}
