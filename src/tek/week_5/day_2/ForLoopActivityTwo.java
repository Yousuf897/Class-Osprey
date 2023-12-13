package tek.week_5.day_2;

public class ForLoopActivityTwo {

/*
    Activity 1: Count Up

    Write a program using a for loop that prints numbers from 1 to 5.
    For each number, it should print "Number: " followed by the number.
    Observe the loop control variable and how it changes with each iteration.


*/

    /*
    * Expected Output:
    *
    * Number: 1
    * Number: 2
    * Number: 3
    * ..
    * ..
    * ..
    * */

    public static void main(String[] args) {

        for ( int number = 1; number <= 5; number++) {
            System.out.println("Number: " + number);
        }

    }

}
