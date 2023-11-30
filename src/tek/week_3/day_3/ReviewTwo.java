package tek.week_3.day_3;
import java.util.Scanner;
public class ReviewTwo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOne, numberTwo;

        System.out.print( "Enter the first number: " );
        numberOne = input.nextInt();

        System.out.print( "Enter the second number: " );
        numberTwo = input.nextInt();

        if ( numberOne > numberTwo ) {
            System.out.println( "The greater number is: " + numberOne );
        } else {
            System.out.println("The smaller number is: " + numberOne);
        }



    }
}
