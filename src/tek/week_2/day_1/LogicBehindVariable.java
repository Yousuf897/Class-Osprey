package tek.week_2.day_1;

public class LogicBehindVariable {

/*

    when you declare a variable in Java, you are essentially reserving a specific amount of memory in
    the computer's RAM (Random Access Memory) to store the value of that variable. The amount of
    memory allocated depends on the data type of the variable.

    For example, if you declare an int variable like this:

    int age;

    Java reserves 4 bytes of memory to store an integer value for the variable age. You can think of
    it as labeling a "box" in your computer's memory, setting it aside specifically for storing an
    integer value that will represent age in your program.

    When you initialize the variable, like so:

    int age = 30;

    You're putting the value 30 into that "box." Now, whenever you refer to age in your program,
    Java will go to that specific location in memory to get or set the value.

*/


    public static void main(String[] args) {

        double salary; // --> Declaration
        salary = 25_000; // --> Initialization --> For The First Time.

        System.out.println( salary ); // 25000;

        salary = 35_000; // --> Modification --> Changes to the value of variable

        System.out.println( salary ); // 35000;

        String message = "Welcome to java Class!"; // --> Declaration & Initialization
        message = "I have modified the value of the message variable";

        System.out.println( message );
        System.out.println( " A new Message. " );

       /* I have modified the value of the message variable A new Message.*/

/*        I have modified the value of the message variable
        A new Message.*/

/*
        25000.0
        35000.0*/

    }

}
