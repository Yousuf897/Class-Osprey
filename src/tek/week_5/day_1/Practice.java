package tek.week_5.day_1;

public class Practice {

    // What is array?
    // How many types of array do we have?
    // Way to implement the array?

    public static void main(String[] args) {

   // Dynamic Initialization of 1D array
    String[] names = new String[5];
    String lastName = "Alex";

    // Static initialization
   String[] namesTwo = { "Alex", "Lydia" };

        System.out.println( namesTwo[0] );

        int[] numbers = { 10, 20 };
/*        int numberOne, numberTwo, numberThree, result;*/

        int result;

/*        numberOne = numbers[0]; // 10
        numberTwo = numbers[1]; // 20
        numberThree = numbers[2]; // 50

        result = numberOne + numberTwo + numberThree;*/

        result = numbers[0] + numbers[1];

         System.out.println("The sum of elements inside array is: " + result);

        System.out.println("The length of array is: " + numbers.length );

        System.out.println( numbers[0] );

        numbers[0] = 50;

        System.out.println( numbers[0] );

    }

}
