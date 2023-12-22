package tek.week_6.day_3;

public class Scope {

    static String firstName;


    public static void main(String[] args) {

        String lastName = "Bob"; // Local Variable
        String firstName = "Erin"; // Local Variable

        System.out.println( firstName );

        System.out.println( lastName );


        for ( int i = 1; i <= 10; i++ ) {
            System.out.println( i ); // Local Variable
        }

        /*System.out.println( i );*/ // Not accessible, because the lifetime of this variable ended.

        boolean condition = true;

        if ( condition ) {
            int ifVariable = 10; // Local Variable

            System.out.println( ifVariable );
        }

       /* System.out.println( ifVariable );*/ // Not accessible, because the lifetime of this variable ended.

    }

}
