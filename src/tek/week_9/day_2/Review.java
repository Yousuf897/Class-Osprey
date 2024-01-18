package tek.week_9.day_2;

public class Review {

    public static void main(String[] args) {

        // Immutable String
        String name = "Trevor"; // --> String Litteral
        System.out.println( name.hashCode() );

        name = "Lydia";
        System.out.println( name.hashCode() );

        String lastName = "Trevor";
        System.out.println( lastName.hashCode() );

        // Mutable String

        StringBuilder strBuilder = new StringBuilder("Java");
        StringBuffer strBuffer = new StringBuffer();

        strBuffer.insert(0, "Welcome to TekSchool");

        System.out.println( strBuffer );

        strBuffer.deleteCharAt(0);

        System.out.println( strBuffer );

        strBuffer.delete(0, 8);

        System.out.println( strBuffer );

        strBuffer.append(" In Virginia");

        System.out.println( strBuffer );

        System.out.println( strBuilder );

        strBuilder.insert(0 , "Welcome to class of ");

        System.out.println( strBuilder );

        strBuilder.reverse();

        System.out.println( strBuilder );


    }

}
