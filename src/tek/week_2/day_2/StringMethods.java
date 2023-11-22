package tek.week_2.day_2;

public class StringMethods {


    /*
    * 1. Length(); Finding out how many characters are in a single String
    *     String str = "Hello";
    *     System.out.println(  str.length()  ); --> 5
    *
    * 2. substring(); Printing a portion of a String. it is going to accept two parameters
    *   start Index
    *   end Index. remember the end index is always going to be exclusive meaning endIndex - 1.
    *
    * 3. replace(); It's going to replace a specific value with another value.
    *
    *       String str = "Hello World";
    *       System.out.println( str.replace("World", "Java" );
    *
    *       or you can also:
    *       String modified = str.replace("World", "Java");
    *       System.out.println( modified );
    *
    * 4. toLowerCase(); Converts the String to all lower case characters.
    *
    *    String str = "Hello World";
    *    System.out.println( str.toLowerCase() );
    *
    * 5. toUpperCase(); Converts the String to all upper case characters.
    *
    *    String str = "Hello World";
    *    System.out.println( str.toUpperCase() );
    *
    * 6. trim(); It's going to remove the unnecessary spaces from an String.
    *
    *   String str = "            Hello World              ";
    *   System.out.println( str.trim() );
    *
    *   or
    *
    *   str = str.trim();
    *   System.out.println( str );
    *
    * 7. contains(); Return either true or false if specific value is available in the String.
    *
    *   String message = "Hello Java";
    *   System.out.println( message.contains("Java")  );  --> Returns true since Java is available!
    *
    * 8. equals(); This method is going to compare two String values and return either true or
    *  false.
    *
    *     String firstValue = "Virginia";
    *     String secondValue = "virginia"
    *     System.out.println( firstValue.equals(secondValue) ); // false
    *
    * 9. charAt(); This method is going to target a specific character at specific location (index)
    *
    *   String str = "Hello World";
    *   System.out.println( str.charAt(4) ); --> Returns 'o' since 'o' is located at address 4.
    *
    * */

    public static void main(String[] args) {

        //  Concatenate --> String + String
        String firstName;
        String lastName;

        firstName = "Alex";
        lastName = "Brent";

        System.out.println( firstName + " " + lastName );
        //                  Alex Brent
/*        AlexBrent  */
/*        Alex Brent */

        String cancatenatedVersion = firstName + " " + lastName;

        System.out.println( cancatenatedVersion );
/*      Alex Brent
        Alex Brent
        */

        System.out.println( "Alex" + "Brent" );
/*
        Alex Brent
        Alex Brent
        Alex  Brent
           */

        System.out.println("aaaaaaaaaaaaaaakakakakakakakkakakakakakakakakakakkaakkakakakakaka");

        // length;

        System.out.println( "Total characters for firstName: " + firstName.length() );

/*        Total characters for firstName: 4  */

        String message = "aaaaaaaaaaaaaaakakakakakakakkakakakakakakakakakakkaakkakakakakaka";

        System.out.println("Total characters for message: " + message.length() );

/*        Total characters for message: 65 */


        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );


        String str = "Hello World";

        System.out.println( str.substring(6, 11) );
/*        Hell */

/*        World*/

   /*     str.substring();*/


        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );

        String replaceMessage = "Hello World";

        String modified = replaceMessage.replace("World", "Java");

        System.out.println( modified );

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );

        String simpleMessage = "Welcome TO JAVA";
        System.out.println( simpleMessage.toLowerCase() );

/*        welcome to java  */

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );

        System.out.println( simpleMessage.toUpperCase() );

/*        WELCOME TO JAVA  */

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );

        simpleMessage.replace("Welcome", "Hello");

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );

        String secondMessage = "                   Hello              World                ";
        secondMessage = secondMessage.trim();
        System.out.println( secondMessage );

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );

        String thirdMessage = "Welcome to TekSchool";
        System.out.println( thirdMessage.contains("Java") );

/*        true */

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );

        String firstValue = "Virginia";
        String secondValue = "virginia";

        System.out.println( firstValue.equals(secondValue) ); // false

        System.out.println( firstValue.equals("Virginia") ); // true

        // true
        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );

        char character = 'A';
        String strOne = "Hello World";

        System.out.println( strOne ); // Hello World

        System.out.println( strOne.charAt(4) );

        System.out.println( " Hello Java "  );

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );


    }

}
