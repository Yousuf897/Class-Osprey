package tek.week_5.day_1;

import java.util.Scanner;

public class TwoDArrayActivityTwo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);              // name[0][0] = "Alex";
        String[][] names = new String[2][2];                // names[0][0] = scanner;
        int row = 0, col = 0;
                                                             // SCANNER ==> row & col

                                                             // name[1][0] = scanner;
                                                            // names[row][col] = scanner;



        System.out.print("Enter the row number: ");
        row = scan.nextInt(); // 0

        System.out.print("Enter the col number: ");
        col = scan.nextInt(); // 1

        System.out.print("1. Enter your name: ");

        names[row][col]  = scan.next();


        System.out.print("Enter the row number: ");
        row = scan.nextInt();

        System.out.print("Enter the col number: ");
        col = scan.nextInt();

        System.out.print("2. Enter your name: ");

        names[row][col] = scan.next();


        System.out.print("Enter the row number: ");
        row = scan.nextInt();

        System.out.print("Enter the col number: ");
        col = scan.nextInt();

        System.out.print("3. Enter your name: ");

        names[row][col] = scan.next();


        System.out.print("Enter the row number: ");
        row = scan.nextInt();

        System.out.print("Enter the col number: ");
        col = scan.nextInt();

        System.out.print("4. Enter your name: ");
        names[row][col] = scan.next();


        System.out.print("Please enter the row number and col number to get the value: ");
        row = scan.nextInt();
        col = scan.nextInt();
        System.out.println("The value store at [ " + row +" ] and [ " + col + " ] is: " + names[row][col] );


        scan.close();


        // The value store at [ row ] and [ col ] is:  VALUE



    }
}
