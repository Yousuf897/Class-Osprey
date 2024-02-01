package tek.week_11.day_3;

public class ConditionalStatements {

    public static void main(String[] args) {
        boolean isRaining = false;
        boolean isSnow = true;
        boolean isCold = true;
        boolean isRainFast = true;


        if ( isRaining ) {
            //
        } else {

        }

        if ( isRaining ) {
            if ( isRainFast ) {

            } else {

            }
        } else if ( isSnow ) {
            //
        } else if ( isCold ) {

        } else {

        }


        int number = 11;

        switch(number) {
            case 10:
                System.out.println("Correct it is 10");
                break;
            case 20:
                System.out.println("Correct it is 20");
                break;
            case 30:
                System.out.println("Correct it is 30");
                break;
            case 11:
                System.out.println("Correct it is 11");
                break;
            default:
                System.out.println("Incorrect, your number is different!");
        }
        number = 12;
        if ( number == 11 ) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        boolean result = ( number == 11 || number == 12 ) ? true : false;
        System.out.println(result);


    }

}
