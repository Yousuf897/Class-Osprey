package tek.week_6.day_2;

public class DoWhileLoopExampleTwo {

    public static void main(String[] args) {


/*
              boolean condition = false;
        *
        *       while ( condition ) {
        *           System.out.println("Welcome to TekSchool");
        *       }
        *
        *       do {
        *
        *          System.out.println("Welcome to TekSchool");
        *
        *       } while ( condition );
        *
        *
*/

        boolean condition = false;

        while ( condition ) {
            System.out.println("Welcome to TekSchool! from while loop");
            break;
        }

        do {
            System.out.println("Welcome to TekSchool! from Do while loop");
            break;
        } while ( condition );


    }

}
