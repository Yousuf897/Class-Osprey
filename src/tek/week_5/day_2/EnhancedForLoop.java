package tek.week_5.day_2;

public class EnhancedForLoop {

    public static void main(String[] args) {


        String[] firstNames = { "Alex", "Bob", "Tony", "Eric" };
        String[] lastName = { "Alex", "Bob", "Tony", "Eric" };
        String[] middleName = { "Alex", "Bob", "Tony", "Eric" };

        /*
        * for (DataType name of your iterator : TargetLocation  ) {
        *
        * }
        *       String name = "Bob"
        * */

        for (String name : firstNames ) {

            if (name.equals("Tony")) {
                System.out.println(name);
            }

        }





/*        for (String name : names ) {

            if (name.equals("Tony")) {
                System.out.println(name);
            }

        }*/

    }

}
