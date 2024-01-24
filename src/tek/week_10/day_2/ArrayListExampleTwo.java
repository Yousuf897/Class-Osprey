package tek.week_10.day_2;

import java.util.ArrayList;

public class ArrayListExampleTwo {

    public static void main(String[] args) {

        ArrayList<String> listOfNames = new ArrayList<>();

        // Add elements
        listOfNames.add("Tony");
        listOfNames.add("Mike");
        listOfNames.add("Erin");

        // Initial elements of the arrayList
        System.out.println( listOfNames );

        // Add elements based on the index
        listOfNames.add(1, "Trevor");

        // Print the elements of arrayList
        System.out.println( listOfNames );

        // Add an element at the end of the list
        listOfNames.addLast("Alex");

        // Print the elements of arrayList
        System.out.println( listOfNames );

        // Add an element at the end of the list
        listOfNames.addFirst("George");

        // Print the elements of arrayList
        System.out.println( listOfNames );

        // How to get the size of the list
        System.out.println( listOfNames.size() );

        // How to remove element base on the object (value)
        listOfNames.remove("George");

        // Print the elements of arrayList
        System.out.println( listOfNames );

        // How to remove element base on the index (position)
        listOfNames.remove(3);

        // Print the elements of arrayList
        System.out.println( listOfNames );

        // How to get the value based on the index
        System.out.println( listOfNames.get(2) );

        // Print the elements of arrayList
        System.out.println( listOfNames );

        // How to modify the element of an arrayList
        listOfNames.set(2, "Lia");

        // Print the elements of arrayList
        System.out.println( listOfNames );

        // How to clear the list (remove everything from list)
        listOfNames.clear();

        // Print the elements of arrayList
        System.out.println( listOfNames );

    }

}
