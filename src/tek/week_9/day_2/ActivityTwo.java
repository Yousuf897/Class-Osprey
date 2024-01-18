package tek.week_9.day_2;

public class ActivityTwo {

/*
    Basic Calculator:

    Create a class Calculator.

    Design overloaded methods for a
        1.One that takes two integers.
        2.One that takes three integers.
        3.One that takes two doubles.

    Test the methods by creating a main method and invoking the add() method with different parameters.

    */

    static int add(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    static int add(int numberOne, int numberTwo, int numberThree) {
        return numberOne + numberTwo + numberThree;
    }

    static double add(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    public static void main(String[] args) {
        add(20, 30);
        add(50, 20, 10);
        add(10.5, 105.25);
    }



}
