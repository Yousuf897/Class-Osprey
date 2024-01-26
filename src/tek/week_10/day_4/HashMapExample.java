package tek.week_10.day_4;

import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashMapExample {

    public static void main(String[] args) {

        Set<String> studentNamesSet = new LinkedHashSet<>();

        studentNamesSet.add("Joe");
        studentNamesSet.add("Mike");
        studentNamesSet.add("Tony");

        // print the elements of set
        System.out.println( studentNamesSet );

        // Key -> Value
        // 1 -> Joe
        // 2 -> Mike
        // 3 -> Tony

        // HashMap
        HashMap<Integer, String> studentNameMap = new HashMap<>();

        // How to insert elements or data to Map
        studentNameMap.put(1, "Joe");
        studentNameMap.put(2, "Mike");
        studentNameMap.put(3, "Tony");

        // print the elements of set
        System.out.println( studentNameMap );

        // How to modify elements in Map
        studentNameMap.put(1, "Eric");

        // print the elements of set
        System.out.println( studentNameMap );

        // How to modify elements in Map
        studentNameMap.put(4, "Tony");

        // print the elements of set
        System.out.println( studentNameMap );

        // How to return a value based on it's key
        System.out.println(studentNameMap.get(3));

        // How to return a value based on it's key
        System.out.println(studentNameMap.get(1));

        // How to check if a key exists in map
        System.out.println( studentNameMap.containsKey(1) ); // true
        System.out.println( studentNameMap.containsKey(5) ); // false

        // How to check if a value exists in map
        System.out.println( studentNameMap.containsValue("Eric") ); // true
        System.out.println( studentNameMap.containsValue("Lia") ); //  false

        // How to remove a value based on the key
        studentNameMap.remove(2);

        // print the elements of set
        System.out.println( studentNameMap );

        // How to remove a value based on the key and value paris
        studentNameMap.remove(3, "Tony");

        // print the elements of set
        System.out.println( studentNameMap );

        // How to get the set of keys from map
        System.out.println( studentNameMap.keySet() );

        // How to get the set of values from map
        System.out.println( studentNameMap.values() );

        // print the elements of set
        System.out.println( studentNameMap );

        // How to modify elements in Map
        studentNameMap.put(2, "Mike");

        // print the elements of set
        System.out.println( studentNameMap );

        // 1 = Joe
        // 2 = Mike

        // How to target the keys and values using the loop
        for ( Map.Entry<Integer, String> value : studentNameMap.entrySet() )  {
            System.out.println( value.getKey() + " = " + value.getValue() );
        }




    }
}
