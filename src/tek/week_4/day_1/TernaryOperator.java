package tek.week_4.day_1;

import java.util.Scanner;

public class TernaryOperator {

/*
    4. Ternary Operator:
    In an online store, if a user is a member, they get a 10% discount.
    Given the original price of an item and a boolean isMember, calculate and display the final price
    using the ternary operator.

*/


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double originalPrice;
        int userSelectOption;
        boolean isMember = false;
        double finalValue = 0;

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

        finalValue = ( isMember ) ? originalPrice - (originalPrice * 0.1) : originalPrice; // 10% discount
//      finalValue = ( isMember ) ? originalPrice - (originalPrice * 0.4) : originalPrice; // 40% discount

        System.out.println("Your final price is: " + finalValue);




    }
}
