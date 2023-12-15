package tek.week_5.lab_session;

public class WhileLoopExampleThree {

    public static void main(String[] args) {

        // Can I print the multiplication table using the while loop as well?

        int desiredNumber = 5;
        int startPoint = 1;

        while ( startPoint <= 10 ) {
            System.out.println( startPoint + " * " + desiredNumber + " = " + ( startPoint * desiredNumber ));
            startPoint++;
        }



    }

}
