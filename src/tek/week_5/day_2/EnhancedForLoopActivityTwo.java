package tek.week_5.day_2;

public class EnhancedForLoopActivityTwo {

/*
    Activity 2: Calculating the Average

    Given an array of integers: int[] grades = {85, 90, 78, 88, 76, 93, 80};.
    Use a for-each loop to traverse through the grades.
    Calculate the average of all the grades in the array and display the result.

*/

    public static void main(String[] args) {

        int[] grades = {85, 90, 78, 88, 76, 93, 80};
        double average = 0;
        int total = 0;


        for ( int number : grades ) {
            total = total + number;
        }

        System.out.println( "The total is: " + total );

        average = total / grades.length;

        System.out.println("The average is: " + average);


    }

}
