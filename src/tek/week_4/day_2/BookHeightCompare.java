package tek.week_4.day_2;

import java.util.Scanner;

public class BookHeightCompare {

/*
    Question: Book Height Comparison

    You have two books with different heights: double book1Height = 9.5; and double book2Height = 7.0;.
    Compare the heights of the two books.

    Determine:

    Which book is taller.
    If any book is shorter or of the same height as the other.
    Print out the results of your comparisons.

*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        double book1Height = 9.5;
//        double book2Height = 7.0;

        double book1Height;
        double book2Height;

        System.out.print("Enter the height of the first book: ");
        book1Height = input.nextDouble();

        System.out.print("Enter the height of the second book: ");
        book2Height = input.nextDouble();

        if ( book1Height < book2Height ) {
            System.out.println("Second Book is taller.");
        } else if ( book1Height > book2Height ) {
            System.out.println("First the book is taller.");
        } else {
            System.out.println("Both book are having the same height!");
        }


    }

}
