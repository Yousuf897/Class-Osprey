package tek.week_11.day_2;

public class RemoveSpace {

    // String message = "Welcome to Java";

    // normal output: Welcome to Java
    // Expected output: WelcometoJava

    public static void main(String[] args) {

        // How to remove spaces from a string
        String message = "Welcome to Java";
        System.out.println("Original String: " + message);
        message = message.replace(" ", "");
        System.out.println("Updated version: " + message );

        // By using replaceAll
        String messageFromJava = "Welcome to Java";
        System.out.println("Original String: " + messageFromJava);
        messageFromJava = messageFromJava.replaceAll("\\s", "");
        System.out.println("Updated version: " + messageFromJava );

        String classOsprey = "Osprey students are smart!";

        // Using StringBuilder
        StringBuilder noSpaceString = new StringBuilder();
        int countSpace = 0;
        for ( int index = 0; index < classOsprey.length(); index++ ) {
            char messageCharacters = classOsprey.charAt(index);
            if ( messageCharacters != ' ') {
                noSpaceString.append(messageCharacters);
            } else {
                countSpace++;
            }
        }

        System.out.println("Original String: " + classOsprey);
        System.out.println("Updated version: " + noSpaceString );
        System.out.println("We've found " + countSpace +" blank spaces in your string!");

    }

}
