package tek.week_5.day_2;

public class ActivityFive {

/*
    Activity 4: Print Array Elements

    You are given an array of integers: int[] numbers = {3, 7, 2, 8, 5};.
    Write a program using a for loop that prints the elements in the array.
    Keep a running total and add each array element to this total during each iteration of the loop.
*/

    public static void main(String[] args) {

        int[] numbers = { 3, 7, 2, 8, 5 };
        int total = 0;

        for ( int index = 0; index < numbers.length; index++ ){

            System.out.println(numbers[index]);

            total = total + numbers[index];
            /*
            *    total =   3
            *       total =  10
            *          total = 12
            *           total = 20
            *              total = 20 + 5 = 25
            *
            * */
        }

        System.out.println("The sum of elements of array is: " + total);

    }



}
