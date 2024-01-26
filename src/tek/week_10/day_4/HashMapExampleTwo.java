package tek.week_10.day_4;

import java.util.HashMap;
import java.util.Map;

public class HashMapExampleTwo {

    public static void main(String[] args) {

        HashMap<Integer, String> studentNameMap = new HashMap<>();
        System.out.println(printValueBasesOnKey(4, "Mark"));

        // How to insert elements or data to Map
        studentNameMap.put(1, "Joe");
        studentNameMap.put(2, "Mike");
        studentNameMap.put(3, "Tony");
        studentNameMap.put(4, "Erin");
        studentNameMap.put(5, "Eric");
        studentNameMap.put(6, "Mike");
        studentNameMap.put(7, "Lia");

        // How to print the key-value pairs using loop
        // 1 = Joe
        // 2 = Mike

        // How to target the keys and values using the loop
        for ( Map.Entry<Integer, String> value : studentNameMap.entrySet() )  {
            System.out.println( value.getKey() + " = " + value.getValue() );
        }


        // how to print set of keys by using the loop
        for ( int eachKey : studentNameMap.keySet() ) {
            System.out.print( eachKey + " ");
        }

        System.out.println();

        // how to print set of keys by using the loop
        for ( String eachValue : studentNameMap.values() ) {
            System.out.print( eachValue + " ");
        }

        System.out.println();

        // how to get a specific value based on the key
        System.out.println( studentNameMap.get(4) );

        // How to remove a value
        studentNameMap.remove(4);

        System.out.println( studentNameMap );

        // How to remove a value
        studentNameMap.remove(6, "Mike");

        System.out.println( studentNameMap );

    }

    public static String printValueBasesOnKey(int key, String value ) {
        Map<Integer, String> map = new HashMap<>();
        map.put(key, value);
        return map.get(key);
    }
}
