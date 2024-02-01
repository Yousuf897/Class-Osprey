package tek.week_11.day_3;

public class LocalVsInstanceVariable {

    static String firstName;


    public static void main(String[] args) {

        System.out.println( firstName );
        printFirstName();

        String lastName = "alexander";
        int age = 15;
        boolean isCold = false;

        System.out.println( lastName );
        System.out.println( age );
        System.out.println( isCold );

        if ( isCold ) {
            int ifStatementAge = 10;
            System.out.println( lastName );
            System.out.println( ifStatementAge );
        }

//        System.out.println( ifStatementAge );
    }

    static void printFirstName() {
        System.out.println(firstName);
    }

//    static void printLastName() {
//        System.out.println( lastName ); --> Cannot be accessible because it's local and the life time is ended.
//    }
}
