package tek.week_11.day_4;

import java.util.ArrayList;
public class ArrayListExampleTwo {
    public static void main(String[] args) {

        ArrayList<String> listOfNames = new ArrayList<>();
        // Using different Methods of an ArrayList:
        // Adding elements:
        listOfNames.add("Tony");
        listOfNames.add("Mike");
        listOfNames.add("Erin");

        // Adding elements based on the index:
        listOfNames.add(1, "Trevor");

        // Print the elements of ArrayList:
        System.out.println(listOfNames);


        //THESE 2 METHODS ARE NOT WORKING FOR ME, it worked for teacher Samandar:

        // Adding an element at the end of the list:
        listOfNames.addLast("Theo");

        // Adding an element first of the list:
        listOfNames.addFirst("Johnathon");

        listOfNames.getFirst();
        listOfNames.getLast();


        // If we want to find the length of the ArrayList, since this is not a regular Array, we cannot go with the regular
        // method of finding the length of the array:
        System.out.println(listOfNames.size());

        // Removing elements based on the object(value):
        listOfNames.remove("Mike");

        // Removing elements based on the index(position):
        listOfNames.remove(1);

        // Getting a value based on the index:
        System.out.println(listOfNames.get(2));

        // Modifying an element of the ArrayList based on the index:
        listOfNames.set(2, "Sam");

        // Clearing the ArrayList(Removing everything from the List:
        listOfNames.clear();




    }
}
