package tek.week_11.day_2;

public class CountBlankSpaces {

    public static void main(String[] args) {

        String message = "Welcome to Java  ";
        int countBlankSpace = 0;
        for ( int index = 0; index < message.length(); index++ ) {
            char charactersFromMessage = message.charAt(index);
            if (charactersFromMessage == ' ') {
                countBlankSpace++;
            }
        }

        System.out.println("We've found " + countBlankSpace +" blank spaces in your string!");
    }
}
