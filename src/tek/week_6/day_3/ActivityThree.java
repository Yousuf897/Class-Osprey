package tek.week_6.day_3;

public class ActivityThree {

    public static void main(String[] args) {

        for ( int i = 1; i <= 10; i++) {
            if ( i == 5 || i == 4 || i == 8 ) {
                continue;
            } else {
                System.out.print(i + " ");
            }
        }

    }

}
