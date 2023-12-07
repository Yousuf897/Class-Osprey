package tek.week_4.day_3;

public class TemperatureLogger {

/*
    Temperature Logger:

    Objective: Store daily average temperatures for a week and retrieve a specific day's temperature.

    Steps:

    Declare a 1D array of size 7. This will represent temperatures for seven days.
    Assign a temperature value to each day.
    To find the temperature on the 4th day, access the element at index 3 (since array indices start from 0).
    Print the temperature value retrieved from the array.

 */

    public static void main(String[] args) {

        // Dynamic Implementation of 1D array!

        int[] temperatures = new int[7];

        temperatures[0] = 5;
        temperatures[1] = 55;
        temperatures[2] = -2;
        temperatures[3] = 25;
        temperatures[4] = 15;
        temperatures[5] = 6;
        temperatures[6] = 4;

        System.out.println("Temperature of the fourth day is: " + temperatures[3] );

        // Static Implementation of 1D array

        int[] temperaturesUsingStatic = { 10, 1 , 2, 5, -2, -3, 9 };

        System.out.println("Temperature of the fourth day is: " + temperaturesUsingStatic[3] ); // n -1
        // 4th day -- 4 - 1 = 3


    }


}
