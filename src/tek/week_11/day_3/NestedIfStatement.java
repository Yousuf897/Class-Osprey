package tek.week_11.day_3;

public class NestedIfStatement {

    public static void main(String[] args) {

        int number = 27;
       if ( number < 20 ) { // true --> D, F
           System.out.println("A");
           if ( number < 15 ) {
               System.out.println("B");
           } else {
               System.out.println("C");
           }
       } else if ( number >= 20 ) {
           System.out.println("D");
           if ( number <= 25 ) {
               System.out.println("E");
           } else {
               System.out.println("F");
           }
       } else {
           System.out.println("Z");
       }

    }

}
