package tek.week_2.day_3;

public class DifferentBetLiteralAndReference {

/*

    Literal vs. Reference Variable: An Analogy

    Imagine a bookshelf with a collection of books.

    Literal: A literal would be like writing a note with the book's title on it. For example,
    a note saying "Harry Potter" represents that specific book, just as the number 5 represents
    that specific integer.

    Reference Variable: A reference variable would be like having a bookmark with an instruction
    on where to find a specific book. For example, "3rd shelf, 5th book from the left".
    This bookmark doesn't hold the book's content, but it points you to its location,
    just like a reference variable doesn't hold the object's content but points to its location in
    memory.

*/

    public static void main(String[] args) {

        String firstName = "Bob";
        firstName = "Lydia";

        System.out.println( firstName );

        int number = 10;

        System.out.println( number ); // 10

        System.out.println( firstName ); //

    }


}
