package tek.week_6.day_2;

public class toCharArrayMethod {

/*

    String - toCharArray():

    This method converts a string to an array of characters.
    For example: "hello".toCharArray() would return an array: ['h', 'e', 'l', 'l', 'o'].

*/

    public static void main(String[] args) {

        String firstName = "James is";

        char[] firstNameCharacters = firstName.toCharArray();

        for ( char firstNameChar : firstNameCharacters  ) {
            System.out.println(firstNameChar);
        }

    }


}
