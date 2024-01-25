package tek.week_10.day_3;


import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        LinkedHashSet<String> studentNames = new LinkedHashSet<>();
        HashSet<String> studentLastNames = new HashSet<>();

        // Add elements to linkedHashset
        studentNames.add("Bob");
        studentNames.add("Eric");
        studentNames.add("Mike");

        // print the elements of linkedHashSet
        System.out.println( "Elements from linkedHashet: " + studentNames );

        // Add elements to HashSet
        studentLastNames.add("Mike");
        studentLastNames.add("Eric");
        studentLastNames.add("Bob");

        // print the elements of linkedHashSet
        System.out.println( "Elements from HashSet: " + studentLastNames );

        // Add elements to linkedHashset
        studentNames.add("Erin");
        studentLastNames.add("Lia");


        // print the elements of linkedHashSet
        System.out.println( "Elements from linkedHashet: " + studentNames );

        // print the elements of linkedHashSet
        System.out.println( "Elements from HashSet: " + studentLastNames );
    }

}
