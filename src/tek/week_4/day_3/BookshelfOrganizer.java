package tek.week_4.day_3;


import java.util.Scanner;

public class BookshelfOrganizer {

/*
    Bookshelf Organizer:

    Objective: Store a collection of book titles and retrieve a book by its position on the shelf.

    Steps:

    Declare a 1D array to hold a certain number of book titles.
    Assign a book title to each position in the array.
    To find the title of the book that's 3rd from the left, access the element at index 2.
    Print the book title retrieved from the array.

*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userInput;

        String[] bookTitles = new String[5];

        System.out.print("Enter the first book title: ");
        userInput = input.nextLine();

        bookTitles[0] = userInput;

        System.out.print("Enter the second book title: ");
        userInput = input.nextLine();

        bookTitles[1] = userInput;

        System.out.print("Enter the third book title: ");
        userInput = input.nextLine();

        bookTitles[2] = userInput;

        System.out.print("Enter the fourth book title: ");
        userInput = input.nextLine();

        bookTitles[3] = userInput;

        System.out.print("Enter the fifth book title: ");
        userInput = input.nextLine();

        bookTitles[4] = userInput;

        System.out.println("The third book from the left is: " + bookTitles[3]);

        System.out.println("The length of the array is: " + bookTitles.length);

        /*
        *
        *   to get the third value - 3 - 1 = 2
        *
        *   String[] bookTitles = new String[5];
        *   bookTitles[0] = "Bob";
        *   bookTitles[1] =  "Alex";
        *   bookTitles[2] = "Lydia";
        *   bookTitles[3] =
        *   bookTitles[4] =
        *
        *   userInput = Lydia
        *
        *   Enter the first book title:
        *   userInput = "Bob"
        *
        *   bookTitles[0] = userInput;
        *
        *   Enter the second book title:
        *   userInput = "Alex"
        *
        *   bookTitles[1] = userInput;
        *
        *   Enter the third book title:
        *   userInput = "Lydia"
        *
        *   bookTitles[2] = userInput;
        *
        * */




    }


}
