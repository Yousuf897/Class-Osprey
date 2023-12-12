package tek.week_5.day_1;

public class TwoDArrayPractice {

    public static void main(String[] args) {

        /*
        *
        *   int numbers = new int[3][4];
        *
        *   int[][] numbersTwo = {
        *
        *          0      1   2     3   4
        *    0   { 10,   50,  1, 0 },
        *    1   { 102,  2,   3, 5 },
        *    2   { 101,  500, 200, 100 },
        *    3  { 901,  902,  95,  93, 105 }
        *   };
        *
        *
        *   A. ==> Address of 100 ==> numbersTwo[ 2 ][ 3 ] ||    3,4  ||  2,3
        *   B. ==> Address of 902 ==> numbersTwo[ 3 ][ 1 ]
        *   C. ==> Address of 102 ==> numbersTwo[ 1 ][ 0 ]
        *   D. ==> Address of 105 ==> numbersTwo[ 3 ][ 4 ]
        *
        *
        * */


          int[][] numbersTwo = {

               { 10,   50,  1, 0 },
              { 102,  2,   3, 5 },
               { 101,  500, 200, 100 },
             { 901,  902,  95,  93, 105 }
           };

        System.out.println(numbersTwo[2][3]);

        System.out.println(numbersTwo[3][1]);

        System.out.println(numbersTwo[1][0]);

        System.out.println( numbersTwo[3][4] );

//        System.out.println( numbersTwo[0][4] );


        int[][] numbers = new int[3][4];

        System.out.println( numbers[0][0] );

        String[][] firstName = new String[1][1];

        System.out.println(firstName[0][0]);


    }


}
