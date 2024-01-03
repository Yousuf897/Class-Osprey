package tek.week_7.day_1;

public class CalculatorRunner {

    public static void main(String[] args) {

        Calculator calObj = new Calculator();

        int numberOne = 20;
        int numberTwo = 5;

        System.out.println( "Result of sum: " + calObj.sumOfTwoNumbers(numberOne, numberTwo) );
        System.out.println( "Result of subtraction: " + calObj.subtractionOfTwoNumbers( 80, 20 ) );
        System.out.println( "Result of multiplication: " + calObj.multiOfTwoNumbers( 100, 10 ) );
        System.out.println( "Result of division: " + calObj.divisionOfTwoNumbers( numberOne, numberTwo ) );

        System.out.println( "Result of sum: " + calObj.sumOfTwoNumbers( 60 , 25) );
        System.out.println( "Result of subtraction: " + calObj.subtractionOfTwoNumbers( 70, 10 ) );
        System.out.println( "Result of multiplication: " + calObj.multiOfTwoNumbers( 50, 30 ) );
        System.out.println( "Result of division: " + calObj.divisionOfTwoNumbers( 50, 5 ) );

    }

}
