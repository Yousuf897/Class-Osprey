package tek.week_10.day_2;

import javax.swing.plaf.SliderUI;
import java.util.ArrayList;

public class ArrayListExplain {

    public static void main(String[] args) {

        String[] names = { "Bob", "Tony" };

        ArrayList<String> listOfNames = new ArrayList<>();

        // How to add elements in the arraylist
        listOfNames.add("Bob");
        listOfNames.add("Alex");
        listOfNames.add("Tony");
        listOfNames.add("Mike");
        listOfNames.add("Alixe");
        listOfNames.add("Mike");
        listOfNames.add(null);

        // How to add elements in arrayList based on the index
        listOfNames.add(0, "First");

        // How to remove an element from arrayList
        listOfNames.remove("Tony");
        listOfNames.remove("Mike");

        // How to remove an element based on their index
        listOfNames.remove(0);


        // How to print the elements of an arrayList
        System.out.println( listOfNames );

        // How to print the values of arrayList using the enhanced for loop
        for (String name : listOfNames ) {
            System.out.println( name );
        }

        // How to check if I have a specific value in my arrayList
        System.out.println( listOfNames.contains("Erin") );

    }

}
