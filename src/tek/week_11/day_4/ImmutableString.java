package tek.week_11.day_4;

public class ImmutableString {

    public static void main(String[] args) {

        String name = "Bob";

        System.out.println( name.hashCode() );

        name = "lydia";

        System.out.println( name.hashCode() );

        String studentFirstName = "Bob";

        System.out.println( studentFirstName.hashCode() );
    }
}


