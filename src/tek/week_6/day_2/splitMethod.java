package tek.week_6.day_2;

public class splitMethod {

    /*
    *
    * Real-Life Analogy:

    String - split():

    Imagine you have a string of Christmas lights with different colored bulbs: red, green, blue, and yellow.
*   Each bulb is separated by a special connector. When you want to rearrange the lights,
*   you disconnect the string at these connectors, and you're left with individual bulbs.
*   Using the split() method on a string with a specific delimiter is like disconnecting the
*   Christmas light string at the connectors, leaving you with segments (or substrings) based
*   on where those connectors (delimiters) were located.
    *
    * */

    public static void main(String[] args) {

        // String message = "Welcome to TekSchool";


        // Give me only words from this message!

        /*
        * 1. Welcome
        * 2. to
        * 3. TekSchool
        *
        * */

        String message = "Java is fun and I like it.";

        String[] words = message.split(" ");

        for ( String word : words ) {
            System.out.println(word);
        }

        System.out.println("There are " + words.length + " in the message.");


    }

}
