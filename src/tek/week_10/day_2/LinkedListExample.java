package tek.week_10.day_2;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {


        LinkedList<String> listOfNames = new LinkedList<>();

        // How to add elements in linedList
        listOfNames.add("Tony");
        listOfNames.add("Mike");
        listOfNames.add("Erin");
        listOfNames.add("Alex");
        listOfNames.add("Trevor");

        // print the elements of linekdList
        System.out.println(listOfNames);

        // How to remove an element from linkedList
        listOfNames.remove("Mike");

        // print the elements of linekdList
        System.out.println(listOfNames);

        // how to modify the element of a linkedList
        listOfNames.set(1, "Lia");

        // print the elements of linekdList
        System.out.println(listOfNames);

        // how to get the size of linkedList
        System.out.println( listOfNames.size() );

        for (String name : listOfNames ) {
            System.out.println( name );
        }

        // how to add value to a specific location
        listOfNames.add(2, "Bob");

        // print the elements of linekdList
        System.out.println(listOfNames);

        // how to clear the elements from the linkedList
        listOfNames.clear();

        // print the elements of linekdList
        System.out.println(listOfNames);


    }

}
