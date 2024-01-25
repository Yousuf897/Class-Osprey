package tek.week_10.day_3;

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<String> studentNames = new HashSet<>();

        // How to add elements to set
        studentNames.add("Mike");
        studentNames.add("Tony");
        studentNames.add("Eric");
        studentNames.add("Lia");

        // How to print the elements of set
        System.out.println( studentNames );

        // How to remove elements from set
        studentNames.remove("Eric");

        // How to print the elements of set
        System.out.println( studentNames );

        // Duplicate values are not allowed
        studentNames.add("Lia");
        System.out.println( studentNames.add("Lia") );

        // How to print the elements of set
        System.out.println( studentNames );

        // Add null value to set
        studentNames.add(null);

        // How to print the elements of set
        System.out.println( studentNames );

        // Add null value to set
        studentNames.add(null);

        // How to print the elements of set
        System.out.println( studentNames );

        // Add null value to set
        studentNames.add("Eric");

        // How to print the elements of set
        System.out.println( studentNames );

        // To check if specific value is available in set
        System.out.println(studentNames.contains("Eric") );
        System.out.println(studentNames.contains("George") );

    }

}
