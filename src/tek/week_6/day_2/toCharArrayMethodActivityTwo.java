package tek.week_6.day_2;

public class toCharArrayMethodActivityTwo {

    public static void main(String[] args) {

/*        String firstName = "Alex";
          System.out.println( firstName.toUpperCase() ); */

/*
        String[] listOfFirstNames  = { "Alex", "Eric", "Erin", "John", "Tony", "Alixe" };

        for ( String firstName : listOfFirstNames ) {
            System.out.println( firstName.toUpperCase() );
            System.out.println( firstName.toLowerCase() );
        }
*/


        String message = "Java is getting better!";

        char[] messageCharacters = message.toCharArray();

        for ( char character : messageCharacters ) {
            System.out.println(character);
        }


    }

}
