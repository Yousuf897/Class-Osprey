package tek.week_2.day_3;

public class Review {

    public static void main(String[] args) {

        // equals() --> method --> compare two String with each other

        String firstName = "Bob";
        String lastName = "Eric";

        System.out.println( firstName.equals(lastName) ); // either true or false
        System.out.println( firstName.equals("Lydia") ); // either true or false

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );

        // Reshape

        firstName = " Lydia"; // --> the value of the firstName has been modified (reshaped)

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );

        // substring

        System.out.println( firstName );
        System.out.println( firstName.substring(0, 3) );

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );


        System.out.println( firstName.hashCode() );
    /*    990024591 */
    }

}
