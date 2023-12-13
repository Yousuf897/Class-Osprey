package tek.week_5.day_2;

public class ForLoop {

/*
    Real-Life Analogy:

    Imagine you have a routine of doing 10 jumping jacks every morning. Each repetition is similar,
    but you keep count to ensure you complete all 10.


    Programming Explanation:

    In programming, when you want to repeat a certain action or set of actions multiple times,
    you use loops. The For Loop is a common type of loop in Java.

    A basic for loop consists of three main parts:

    1.Initialization (Start point): This is where you set a starting point. Using the analogy, this would be
    starting at the first jumping jack.

    2.Condition: This is a test to see whether the loop should continue. In our analogy, it's like
    checking if you've done fewer than 10 jumping jacks.

    3.Iteration: After each loop, something needs to change to eventually end the loop. In our
    analogy, after each jumping jack, you'd increment your count.

    Here's a basic structure of a for loop:

    for (initialization; condition; iteration) {
        // body of the loop
    }


    for(int i = 0; i < 10; i++) {
        System.out.println("This is repetition #" + (i+1));
    }


    In this code, we've initialized i to 0, the loop will continue as long as i is less than 10,
    and after each loop iteration, i will increase by 1.

*/

    public static void main(String[] args) {

/*        for (initialization; condition; iteration) {
            // body of the loop
        }*/

        for ( int count = 15; count <= 20; count++ ) {
            System.out.println( count + ". Bob");
        }

        /*
        1. Bob
        2. Bob
        3. Bob
        4. Bob
        5. Bob
        6. Bob
        7. Bob
        8. Bob
        9. Bob
        10. Bob
        * */



    }

}
