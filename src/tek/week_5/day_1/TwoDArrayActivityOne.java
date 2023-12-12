package tek.week_5.day_1;

import java.util.Scanner;

public class TwoDArrayActivityOne {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[][] names = new String[2][2];

        System.out.print("1. Enter your name: " );

        names[0][0] = input.nextLine();

        System.out.print("2. Enter your name: " );

        names[0][1]= input.nextLine();

        System.out.print("3. Enter your name: " );

        names[1][0] = input.nextLine();

        System.out.print("4. Enter your name: " );

        names[1][1]= input.nextLine();

        System.out.println(" * * * * * * * *  * * * * * * * *  * * * * * * * *  " );

        System.out.println( names[0][0] );
        System.out.println( names[0][1] );
        System.out.println( names[1][0] );
        System.out.println( names[1][1] );

        System.out.println(" * * * * * * * *  * * * * * * * *  * * * * * * * *  " );


    }

}
