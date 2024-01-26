package tek.week_10.day_4;

import java.util.HashMap;
import java.util.Map;

public class HashMapExampleFour {

    public static void main(String[] args) {

        String[] names = {"Alice", "Bob", "Charlie", "Alice", "David", "Bob", "Eve", "Bob", "Alice", "Alice"};
        Map<String, Integer> countNames = new HashMap<>();

        for ( String name : names ) {
            if ( countNames.containsKey(name) ) {
                countNames.put(name, countNames.get(name) + 1);
            } else {
                countNames.put(name , 1);
            }
        }

        // Print the elements of the countName (Map)
        System.out.println(  countNames  );

        for (Map.Entry<String, Integer> entry : countNames.entrySet() ) {
            System.out.println( entry.getKey() + " = " + entry.getValue() );
        }

    }

}
