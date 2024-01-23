package tek.week_10.day_1;

public class UncheckedExceptionExampleTwo {

    public static void main(String[] args) {

        try {
            String firstName = null;
            System.out.println(firstName.toLowerCase());

        } catch (NullPointerException e) {
            System.out.println("the value of string cannot be null, please change it to character and re-run your code");
        }

        System.out.println(" 1 ");
        System.out.println(" 2 ");
        System.out.println(" 3 ");
        System.out.println(" 4 ");


    }

}
