package tek.week_11.day_3;

import java.util.ArrayList;

public class LoopExamples {

    public static void main(String[] args) {

        String[] studentNames = {"Bob", "Tony", "Trevor", "Lia", "Erin"};
        ArrayList<String> studentNamesArrayList = new ArrayList<>();

        for ( int i = 10; i <= 20; i++ ) {
            System.out.print( i + " ");
        }

        System.out.println();

        for ( int index = 0; index < studentNames.length; index++) {
            System.out.print( studentNames[index] + " ");
        }

        System.out.println();

        int number = 10;
        while ( number <= 20 ) {
            System.out.print( number + " ");
            number++;
        }

        System.out.println();

        int index = 0;
        while ( index < studentNames.length ) {
            System.out.print( studentNames[index] + " ");
            index++;
        }

        System.out.println();

        for ( String studentName : studentNames ) {
            System.out.print( studentName + " ");
        }

        System.out.println();

        index = 0;
        do {
            System.out.print( studentNames[index] + " ");
            index++;
        } while ( index < studentNames.length );

        System.out.println();

        // outer Loop
        for ( int i = 0; i <= 5; i++ ) {
            // Inner loop
            for ( int j = 0; j <= 5; j++) {
                for (int k = 0; k <= 5; k++) {
                    System.out.println( i + " " + j + " " + k);
                }
            }
        }


        for(int i = 1 ; i <=5; i++) {
            System.out.println(i);
        }

        // print the number from 10 all the way to 20 d


        for (int  i = 10; i <= 20; i++) {
            System.out.println(i);
        }

    }

}
