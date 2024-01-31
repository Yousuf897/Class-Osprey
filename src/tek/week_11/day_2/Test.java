package tek.week_11.day_2;

public class Test {

    public static void main(String[] args) {
        String message = "Welcome to java class";
        String[] words = message.split(" ");
        for (String word : words ) {
            System.out.println( word );
        }
    }

}
