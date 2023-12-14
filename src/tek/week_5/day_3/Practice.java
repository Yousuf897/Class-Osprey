package tek.week_5.day_3;

public class Practice {

    public static void main(String[] args) {


        // 1. Print the values of each array

        // 2. Print the sum of all numbers in the array

        // 3. create variable called choice and set it to either even or odd
        // if even is selected then print the even numbers
        // else print the odd numbers

        // 4. Print the average of the numbers

        // 5. Ask the user to enter a name to search in the array
        // If array contains the name: Matt is located at index [ X ]
        // else print ==> "DESIRED NAME" is not available in the list.

        // A. First Array
        int[] numbers = {10, 50, 80, 90, 10, 80, 10, 0, 1, 28, 80, 90, 77, 53, 61};
        // B. Second Array
        String[] firstNames = {"Eric", "Alex", "John", "Martin", "Matt", "Tony"};
        // C. Third Array
        String[] countries = {"United States", "Spain", "Germany", "Italy", "Netherlands"};

        int total = 0;
        String choice = "Odd";
        double average  = 0;

        // 1. Print the values of each array

        // Print Array A

        for (int number : numbers) {
            System.out.print(number + ", ");
            total = total + number;
            //   total = 10
            // total = total + number
            //  total =  60
            //
        }

/*        System.out.println();*/
/*
        for (int index = 0; index < numbers.length; index++ ) {
            if ( numbers[index] == numbers[numbers.length - 1] ) {
                System.out.println( numbers[index] );
            }
            else {
                System.out.print( numbers[index] + ", ");
            }
        }*/

        // Print Array B

//        for (String name : firstNames) {
//            System.out.print(name + ", ");
//        }
//
//        System.out.println();
//
//        // Print Array C
//
//        for (String country : countries) {
//            System.out.print(country + ", ");
//        }

//        System.out.println();
//
//        System.out.println("The total sum of all numbers is: " + total);

        // 3. create variable called choice and set it to either even or odd
        // if even is selected then print the even numbers
        // else print the odd numbers

        for (int number : numbers) {

            if (choice.equals("Odd") && number % 2 != 0) {
                System.out.print(number + " ");
            }
        }

        System.out.println();

        average = total / numbers.length;

        System.out.println("The average is: " + average);
    }






    }





        // 2. Print the sum of all numbers in the array


        // 4. Print the average of the numbers



        // 5. Ask the user to enter a name to search in the array
        // If array contains the name: Matt is located at index [ X ]
        // else print ==> "DESIRED NAME" is not available in the list.

