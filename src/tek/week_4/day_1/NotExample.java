package tek.week_4.day_1;

public class NotExample {

    /*      true     ||    true
                    !(TRUE) --> FALSE or if your answer is FALSE --> TRUE
    * if ( !(condition || condition) ) {
    *       System.out.println("Yes");
    *   } else {
    *       System.out.println("No");
    *   }
    *
    * */

    public static void main(String[] args) {
        boolean isRainy = true;

        System.out.println( isRainy );
        System.out.println( !isRainy );
        System.out.println( isRainy );


        isRainy = !isRainy;

        System.out.println( isRainy );
        System.out.println( isRainy );
        System.out.println( isRainy );

        isRainy = !isRainy;

        System.out.println( isRainy );
        System.out.println( isRainy );
        System.out.println( isRainy );

    }

}
