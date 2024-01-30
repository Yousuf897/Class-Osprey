package tek.week_11.day_1;

import tek.week_4.day_3.ArrayTwo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {


        List<String> studentList = new ArrayList<>();


        // Add elements to arrayList
        studentList.add("Bob");
        studentList.add("Tony");
        studentList.add("Lia");
        studentList.add("Erin");

        System.out.println( studentList );

        // Using the for each loop
        for ( String studentName : studentList ) {
            System.out.println( studentName );
        }

        Iterator<String> it = studentList.iterator();
        System.err.println( it.next() );
        // How to print the elements of arrayList using Iterator
        while ( it.hasNext() ) {
            System.out.println( it.next() );
        }


    }

}
