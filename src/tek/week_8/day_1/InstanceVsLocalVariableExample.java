package tek.week_8.day_1;

public class InstanceVsLocalVariableExample {

    static String lastName; // Instance Variable


    public static void main(String[] args) {

        String firstName = "Tony"; // --> Local Variable
        boolean isTrue = false;

        System.out.println( firstName );

        System.out.println( isTrue );

        System.out.println( lastName );

    }

    static void printFirstName() {
        String firstname = "Bob"; // --> Local Variable
        System.out.println( firstname );

        System.out.println( lastName );
    }

    InstanceVsLocalVariableExample( String lastName ) {
//        this.lastName = lastName;
//        System.out.println( firstName );
        System.out.println( this.lastName );
    }

}
