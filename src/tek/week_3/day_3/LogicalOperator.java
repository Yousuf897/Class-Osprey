package tek.week_3.day_3;

import java.util.Scanner;

public class LogicalOperator {

    public static void main(String[] args) {


        /*
        *       Score = 85
        *
        *       Grading System
        *
        *       90 - 100 --> A
        *       80 - 89  --> B
        *       70 - 79  --> C
        *       60 - 69  --> D
        *       50 - 59  --> E
        *       Below 50 --> F
        *   */

        Scanner input = new Scanner(System.in);
        int score;
        char grade = 'F';

        System.out.print("Enter your score: ");
        score = input.nextInt();

        if ( score >= 90 && score <= 100 )
            grade = 'A';
        else if ( score >= 80 && score <= 89 )
            grade = 'B';
        else if ( score >= 70  && score <= 79)
            grade = 'C';
        else if ( score >= 60 && score <= 69 )
            grade = 'D';
        else if ( score >= 50 && score <= 59 )
            grade = 'E';
        else {
            if ( score > 100 ) {
                System.out.println("Score cannot be more than 100!");
            } else {
                grade = 'F';
            }
        }

        System.out.println("You are at " + grade + " grade.");
    }

}
