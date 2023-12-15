package tek.week_5.lab_session;

public class WhileLoopExampleTwo {

    public static void main(String[] args) {

        String[] arrayNames = { "Alex", "Tony", "Eric", "Lydia" };

        int index = 0;

        while ( index < arrayNames.length ) {
            System.out.print( arrayNames[index] + " " );
            index++;
        }

/*        for ( int index = 0; index < arrayNames.length; index++ ) {

        }*/

    }

}
