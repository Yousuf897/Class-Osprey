package tek.week_2.day_2;

public class WorkingWithString {

/*
    String manipulation refers to the various operations and techniques you can apply to
    modify, analyze, or get information from strings. In the realm of programming, especially
    with a language like Java, strings are one of the most frequently used data types, and the
    ability to skillfully handle and transform them is vital.

    Think of string manipulation like working with clay. You start with a lump of clay
    (the string), and you can mold it, reshape it, combine it with other pieces, or even
     extract parts of it to create something new.


*/

    public static void main(String[] args) {

        int number = 10;
        number = 55; // --> Modification

        String firstName = "Alex";
        String lastName = "Alexander";

        firstName = "Eric"; // --> Modification, reshape
        System.out.println( firstName + lastName ); // --> combine it with other pieces

        System.out.println( firstName.substring(0, 2) ); // --> extract parts of it to create something
        // new.



    }
}
