package tek.week_10.day_3;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<String> alphabets = new TreeSet<>();
        TreeSet<Integer> numbers = new TreeSet<>();

        alphabets.add("Z");
        alphabets.add("I");
        alphabets.add("P");
        alphabets.add("C");
        alphabets.add("O");
        alphabets.add("B");
        alphabets.add("A");

        // print the elements of treeSet
        System.out.println( alphabets );

        numbers.add(100);
        numbers.add(1);
        numbers.add(8);
        numbers.add(0);
        numbers.add(2);
        numbers.add(4);
        numbers.add(9);

        System.out.println(  numbers );

        alphabets.add(null);



    }

}
