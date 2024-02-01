package tek.week_11.day_3;

public class LogicalOperators {

    public static void main(String[] args) {

        boolean isRaining = true;
        boolean isCold = true;
        boolean isSnow = true;

        if ( isRaining && isCold && isSnow ) {
            System.out.println("Don't go outside!");
        } else {
            System.out.println("You can go out!");
        }

    }

}
