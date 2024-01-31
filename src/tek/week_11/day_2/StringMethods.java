package tek.week_11.day_2;

public class StringMethods {

    public static void main(String[] args) {

        // Length is going to return the length of the characters in a string
        String firstName = "Bob";
        System.out.println( firstName.length() );

        String lastName = "Alexander";
        System.out.println( lastName.length() );

        String middleName = "  Bob";
        System.out.println( middleName.length() );

        // Substring() --> Gives us the ability to capture a range of specific characters
        String message = "Welcome to TekSchool";
        System.out.println( message );
        System.out.println(message.substring(3));
        System.out.println(message.substring(4, 10));

        // replace() --> Replacing the old value of String with a new value
        System.out.println( message.replace("Welcome to TekSchool", "I've replaced the value of my variable!"));
        message = message.replace("Welcome to TekSchool", "New Value");
        System.out.println( message );

        // toLowerCase() --> Converts your string to lowerCase version
        System.out.println( "Lower Case version of message: " +  message.toLowerCase() );

        // toUpperCase() --> Converts your string to upperCase version
        System.out.println( "Upper Case version of message: " +  message.toUpperCase() );

        // trim() --> Helps you to remove the extra spaces from begenning and the end of your String
        String announcment = "                 class osprey is about to finish                                               ";
        System.out.println( announcment );
        announcment = announcment.trim();
        System.out.println( announcment );

        // Contains() --> return boolean, if value exists returns true otherwise false
        System.out.println( announcment.contains("Finish") );
        System.out.println( checkWord(announcment, "Finish") );

        // charAt() --> returns a character at specific location (index)
        String employeeName = "Bob";
        System.out.println(employeeName.charAt(1));
        System.out.println(employeeName.charAt(0));

        // toCharArray()
        String javaMessage = "Java is easy!";
         char[] characters = javaMessage.toCharArray();
         for (char character : characters ) {
             System.out.println( character );
         }

    }

    public static boolean checkWord(String targetValue, String desiredValue) {
        String[] words = targetValue.split(" ");
        for (String word : words ) {
            if ( word.equals(desiredValue)) {
                return true;
            }
        }
        return false;
    }

}
