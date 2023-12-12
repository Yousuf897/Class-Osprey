package tek.week_5.day_1;

import java.util.Scanner;

public class CHeck {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userinput;
        String[][] names = new String[2][2];
        int row = 0 , col = 0;


        System.out.println("enter the row number");
        row = scan.nextInt();
        System.out.println("Enter the col number");
        col = scan.nextInt();
        System.out.println("1. Enter your name");
        names[row][col] = scan.next();


        System.out.println("enter the row number");
        row = scan.nextInt();
        System.out.println("Enter the col number");
        col = scan.nextInt();
        System.out.println("2. Enter your name");
        names[row][col] = scan.next();

        System.out.println("enter the row number");
        row = scan.nextInt();
        System.out.println("Enter the col number");
        col = scan.nextInt();
        System.out.println("3. Enter your name");
        names[row][col] = scan.next();

        System.out.println("enter the row number");
        row = scan.nextInt();
        System.out.println("Enter the col number");
        col = scan.nextInt();
        System.out.println("4. Enter your name");
        names[row][col] = scan.next();

    }

}
