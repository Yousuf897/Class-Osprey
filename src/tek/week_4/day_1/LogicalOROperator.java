package tek.week_4.day_1;

import java.util.Scanner;

public class LogicalOROperator {

    // AND --> condition && condition --> true && true --> true
    // AND --> condition && condition --> false && true --> false
    // AND --> condition && condition --> true && false --> false
    // AND --> condition && condition --> false && false --> false

/*  OR (||): At least one condition must be true.
    *   true - true = true
    *   false - true = true
    *   true - false = true
    *   false - false = false
    *
    * */

    /*
    *       true            false       false
    * if ( condition || condition || condition ) {
    *       System.out.println("Yes");
    * } else {
    *  System.out.println("No");
    * }
    *
    *           true        false       true            true
    *                   FALSE       ||          TRUE
    *   if ( condition && condition || condition && condition ) {
    *       System.out.println("Yes");
    *   } else {
    *       System.out.println("No");
    *   }
    *
    *               false     false       true              true         false          false
    *                       true                     &              true          ||  false
    *                                   true                                      ||  false
    *   if (  ( condition & condition || condition ) & ( condition || condition ) ||  condition ) {
    *       System.out.println("Yes");
    *   } else {
    *   System.out.println("No");
    * }
    *
    *
    * */


    public static void main(String[] args) {

        // the symbol of the OR logical operator ( || )

        Scanner input = new Scanner(System.in);
        String firstName, lastName;

        System.out.print("Enter your first name: " );
        firstName = input.nextLine();

        System.out.print("Enter your last name: " );
        lastName = input.nextLine();

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );

        if ( firstName.equals("niki") && lastName.equals("aleman") ) {
            System.out.println("Access granted, Please proceed!");
        } else {
            System.out.println("Access denied, you're not allowed!");
        }

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );

        if ( firstName.equals("niki") || lastName.equals("aleman") ) {
            System.out.println("Access granted, Please proceed!");
        } else {
            System.out.println("Access denied, you're not allowed!");
        }

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );

        // == || equals();

    }

}
