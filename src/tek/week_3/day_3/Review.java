package tek.week_3.day_3;

import java.util.Scanner;

public class Review {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int weekDay;
        /*
        *
        * if ( condition ) {
        *
        *
        * } else {
        *
        * }
        *
        * */


        boolean flag = true;
        boolean isRainy = false;

        if ( flag ) {
            System.out.println( "The value of the flag is true" );
        } else {
            System.out.println( "The value of the flag is false" );
        }

        if ( 50 < 20 ) {
            System.out.println( "50 is less than 20" );
        } else {
            System.out.println( "50 is greater than 20" );
        }

        System.out.println( "Welcome to TekSchool" );


        System.out.println( flag ); // false
        System.out.println( 50 < 20 ); // false


    /*    System.out.println( "Enter a number: "  );
        weekDay = input.nextInt();

        if ( weekDay == 1 ) { // 5 == 1 --> False
            System.out.println( "Monday" );
        } else if  ( weekDay == 2 ) { // 5 == 2 --> False
            System.out.println( "Tuesday" );
        } else if ( weekDay == 3 ) { // false
            System.out.println( "Wednesday" );
        } else if ( weekDay == 4 ) { // false
            System.out.println( "Thursday" );
        } else if ( weekDay == 5 ) { // 5 == 5 ? Yes --> true
            System.out.println( "Friday" );
        } else if ( weekDay == 6 ) {
            System.out.println( "Saturday" );
        } else {
            System.out.println( "Sunday" );
        }*/


        // Nested if statement

/*           int number = 70;

                   if ( number > 85 ) {

                       System.out.println("A");

                      if ( number <= 90  ) {

                          System.out.println( "B" );

                        } else {
                          System.out.println("C");
                      }

                   } else {

                       System.out.println("D");

                   }*/

                   /*
                   * // If we only have one condition
                   *
                   *        if ( condition ) {
                   *
                   *       } else {
                   *
                   *        }
                   *
                   *    2. If we have multiple conditions
                   *
                   *      if ( condition ) {
                    *
                    *       } else if ( condition ) {
                    *
                    *        } else {
                    *
                    *       }
                    *
                    *   3. If you want to check multiple conditions, but the second condition depends
                    *       on the first condition then the nested if statement is the choice
                    *
                    *
                   *
                   * */

        /*
                number = 45;
                if ( numbers < 50 ) {
        *               print( "A" );
        *               if  ( number <= 45 ) {
        *                       print("B");

                                    if ( number <= 42 ) {
                                            print("Z");
                                    } else {
                                        print("M");
                                   }
        *                 } else {
        *                       print (" C ");
        *                   }
        *           if ( number < 40 ) {
        *               print("D");

                        if (number <= 35 ) {
                                print("N");
                        } else {
                                print("P");
                            }
        *           } else {
        *               print("E");
        *           }
        *       } else {
        *               print(" F ");
        *
        *
        * */

    /*
    * if ( condition ) {
    *
    * } else {
    *
    *   }
    *
    * */

        int numbers = 45;
        if ( numbers < 50 ) {
            System.out.println("A");
                       if  ( numbers <= 45 ) {
                           System.out.println("B");

                if ( numbers <= 42 ) {
                    System.out.println("Z");
                } else {
                    System.out.println("M");
                }
                         } else {
                           System.out.println("C");
                           }
                   if ( numbers < 40 ) {
                       System.out.println("D");

                if (numbers <= 35 ) {
                    System.out.println("N");
                } else {
                    System.out.println("P");
                }
                   } else {
                       System.out.println("E");
                   }
               } else {
            System.out.println("F");
        }



    }

}
