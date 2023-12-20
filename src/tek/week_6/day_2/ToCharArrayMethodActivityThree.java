package tek.week_6.day_2;

public class ToCharArrayMethodActivityThree {

    public static void main(String[] args) {

        // How many characters are in String message = "Welcome to TekSchool";
/*
        String message = "Welcome to TekSchoolaajhslkdjlakjsdklaskljdjlasldkjaslkdlkajsdlkas";
        System.out.println( message );
        System.out.println("There are " +  message.length() + " characters in the above message." );
*/


        String welcomeMessage = "Welcome is";

        // Give me an array of characters of the above message!

        char[] charArrayOfWelcomeMessage = welcomeMessage.toCharArray();

        // Now print all the values of this array

        for ( char character : charArrayOfWelcomeMessage ) {
            System.out.println( character );
        }

    }

}
