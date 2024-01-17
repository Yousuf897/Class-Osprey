package tek.week_9.day_1;

public class Runner {

    public static void main(String[] args) {

        var reviewObj = new Review();
        var reviewObjTwo = new Review();

        String firstName = "bob";
        String lastName = "bob";

        System.out.println( firstName.hashCode() );
        System.out.println( lastName.hashCode() );

        String SecondFirstName = new String("bob");
        System.out.println( SecondFirstName.hashCode() );

        // int number = 10

        // number = 10;

        // firstname = 97717;
        // lastName = 97717;


    }

}
