package tek.week_10.day_1;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Activity {

    public static void main(String[] args) {

        var input = new Scanner(System.in);
        int firstNumber, secondNumber;

        System.out.print("Enter the first number: ");
        firstNumber = input.nextInt();
        System.out.print("Enter the second number: ");
        secondNumber = input.nextInt();

        System.out.println( firstNumber + secondNumber );
        System.out.println( firstNumber - secondNumber );
        System.out.println( firstNumber * secondNumber );
        System.out.println( divideNumbers( firstNumber, secondNumber ) );

        System.out.println("Java is awesome!");



    }

    static int divideNumbers(int numberOne, int numberTwo) {
        return numberOne / numberTwo;
    }

}
