package tek.week_11.day_3;

public class StaticVariablesAndMethods {

     static String firstName;
     static String lastName;

     static void printFirstName() {
        System.out.println( firstName );
        printLastName();
    }

     static void printLastName() {
        System.out.println( lastName );
    }

    public static void main(String[] args) {

        firstName = "Bob";
        printLastName();
        printFirstName();
    }

}
