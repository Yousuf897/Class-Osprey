package tek.week_10.day_3;

import java.util.HashSet;

public class HashSetExampleTwo {

    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();

       // Add 10 elements to Set
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        // Print the elements of set
        System.out.println( numbers );

    }

}
