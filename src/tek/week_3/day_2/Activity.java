package tek.week_3.day_2;

import java.util.Scanner;

public class Activity {

    // 90 - 100 --> A  || Score = 85
    // 80 - 89 --> B
    // 70 - 79 --> C
    // 60 - 69 --> D
    // ---

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int score;
        char grade;


        System.out.print( "Enter your score: " );
        score = input.nextInt(); // 50

        if ( score >= 90 ) { // false
            grade = 'A';
        } else if ( score >= 80 ) { // is 50 > or = 80 ? false
            grade = 'B';
        } else if ( score >= 70 ) { // is 50 > or = 70 ? false
            grade = 'c';
        } else {
            grade = 'D'; // D --> Correct answer
        }

        System.out.println( "You're at " + grade + " grade!");

        // 85

        if ( score >= 90 ) { // false
            grade = 'A';
        } else if ( score >= 80 ) { // is 85 > or = 80 ? true!
            grade = 'B'; // B --> Is the correct Answer
        } else if ( score >= 70 ) {
            grade = 'c';
        } else {
            grade = 'D';
        }




        // Score = 95;

        /*
        * if ( score >= 90 ) { true --> A, X, Y,
        *           A
        *   if ( score >= 92 { true
        *           X
        *   if ( score >= 95 ) { true
        *           Y
        * }
        *
        * if ( score >= 96 ) { false
        *           Z
        *       }
        *   B
        * }
        *
        *
        * } else if ( score >= 80) {
        *
        * }
        *
        *
        *
        * */





    }
}
