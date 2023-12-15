package tek.week_5.lab_session;

public class ForEachLoop {

    public static void main(String[] args) {

        int[] arrayNumbers = { 10, 5, 2, 5, 7, 8, 9 };

        for ( int number : arrayNumbers ) {
            System.out.print(  number  + " " );
        }

        System.out.println();

        for ( int number : arrayNumbers ) {
            System.out.print( ( number * 2 ) + " " );
        }


    }

}
