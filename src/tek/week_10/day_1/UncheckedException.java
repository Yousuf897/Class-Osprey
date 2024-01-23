package tek.week_10.day_1;

import java.util.Scanner;

public class UncheckedException {

    public static void main(String[] args) {

        String[] names = { "Bob", "Tony" };

        System.out.println( names[2] );

        System.out.println( "Bob" );

        System.out.println( " * * * * *  * * * * *  * * * * *  * * * * * " );

        try {
            var input = new Scanner(System.in);
            int firstNumber, secondNumber;

            System.out.print("Enter the first number: ");
            firstNumber = input.nextInt();
            System.out.print("Enter the second number: ");
            secondNumber = input.nextInt();
            System.out.println(divideNumbers(firstNumber, secondNumber));

        } catch ( ArithmeticException e ) {
            System.out.println("Cannot divide a number by zero");
             e.printStackTrace();
        }

        System.out.println("Java is awesome!");

    }

    static int divideNumbers(int numberOne, int numberTwo) {
        return numberOne / numberTwo;
    }

}
