package tek.week_9.day_1;

public class StringBuilderExample {

    public static void main(String[] args) {

        StringBuilder strBuilder = new StringBuilder();


        // Print the value of the StringBuilder
        System.out.println( strBuilder );
//      How to add (insert) a value for the first time and so on
        strBuilder.insert(0, "Welcome to");

        // How to append in mutable
        strBuilder.append(" TekSchool!");

        System.out.println( strBuilder );

        // How to delete something from mutable Strings!
        strBuilder.delete(0, 5);

        System.out.println( strBuilder );

        // Immutable String
        String firstName;
        String lastName = new String();

        // Mutable String
        StringBuilder stringBuilderTwo = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();


    }

}
