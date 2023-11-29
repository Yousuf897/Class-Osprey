package tek.week_3.day_2;
public class IfStatementActivityTwo {

/*
    Question 1: Weather Decisions

    1. Declare three boolean variables: isRaining, hasUmbrella, and isWindy.
    Assign any values of your choice to these variables.
    Write a condition to determine if you should go out or stay indoors. What is the result based on your values?
    Using the same variables, determine if you should take an umbrella when going out. Which conditions
    influenced your decision?
    Finally, decide if you should wear a windbreaker based on the given conditions.
*/

    public static void main(String[] args) {

        boolean isRaining, hasUmbrella, isWindy;

        isRaining = false;
        hasUmbrella = true;
        isWindy = false;

        if ( isRaining ) {
            if (hasUmbrella) {
                System.out.println( "Take your umbrella because weather is rainy!" );
            } else {
                System.out.println( "Its raining outside!" );
            }
        }



        if ( hasUmbrella ) {
            System.out.println( "You have an umbrella!" );
        }

        if ( isWindy ) {
            System.out.println( "Yes, it's windy outside!" );
        }

    }

}
