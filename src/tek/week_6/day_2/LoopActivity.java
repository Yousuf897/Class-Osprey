package tek.week_6.day_2;

public class LoopActivity {

    public static void main(String[] args) {

        String message = "Java";

        // Store these characters in an array and then print them into the console

        /*
        *  W
        *  e
        *  l
        *  c
        *  o
        *  m
        *  e
        *  .
        *  .
        * */



        char[] arrayOfCharacters = message.toCharArray();

        for ( char charater : arrayOfCharacters ) {
            System.out.println(charater);
        }

    }

}
