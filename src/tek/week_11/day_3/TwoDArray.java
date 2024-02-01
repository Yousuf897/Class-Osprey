package tek.week_11.day_3;

public class TwoDArray {

    public static void main(String[] args) {

        int[][] numbers = {

                { 10, 20 , 30 },
                { 5,  6  , 55,  40, 70, 30},
                { 10, 20 }
        };

        System.out.println( numbers[0][0]  );
        System.out.println( numbers[0][2] );

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                System.out.print(numbers[row][col]  + " ");
            }
            System.out.println();
        }

    }

}
