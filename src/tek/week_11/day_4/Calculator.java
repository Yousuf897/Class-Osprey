package tek.week_11.day_4;

public class Calculator {

    public static int add(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public static int add(int numberOne, int numberTwo, int numberThree) {
        return numberOne + numberTwo  + numberThree;
    }

    public static double add(double numberOne, int numberTwo, int numberThree) {
        return numberOne + numberTwo  + numberThree;
    }

    public static void main(String[] args) {
        System.out.println( add(10, 20) );
        System.out.println( add(10, 20, 30) );
        System.out.println( add(10.5, 20, 30) );

    }

}
