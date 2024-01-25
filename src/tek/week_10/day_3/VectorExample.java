package tek.week_10.day_3;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();

        // how to add elements to vector
        vector.add("Erin");
        vector.add("Tony");
        vector.add("Mike");
        vector.add("Joe");
        vector.add("George");

        // How to print the elements of a vector
        System.out.println( vector );

        // How to add element into a specific index
        vector.add(1, "Brent");

        // How to print the elements of a vector
        System.out.println( vector );

        // How to modify the elements of Vector
        vector.set(0, "Kera");

        // How to print the elements of a vector
        System.out.println( vector );

        // How to remove elements from vector
        vector.remove("George");

        // How to print the elements of a vector
        System.out.println( vector );

        // How to remove elements from vector based on the index
        vector.remove(3);

        // How to print the elements of a vector
        System.out.println( vector );

        // How to get a value based on the index
        System.out.println( vector.get(2) );

        // How to check if the vector is empty
        System.out.println( vector.isEmpty() );

        // How to print all elements one by one using the for each loop
        for (String element : vector) {
            System.out.println( element );
        }

        // How to print the size of the vector
        System.out.println( vector.size() );

        // How to use the removeAll method that accepts a collection
        vector.removeAll(vector);

//        // How to clear all elements from vector
//         vector.clear();

        // How to print the elements of a vector
        System.out.println( vector );

    }

}
