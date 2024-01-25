package tek.week_10.day_3;

import java.util.ArrayList;

public class Test {


    public static void main(String[] args) {


        ArrayList<String> names=new ArrayList<>();

        names.add("Ahmad");
        names.add("Bob");
        names.add("Ben");
        names.add("Erin");

        // adding element in the first

        names.addFirst("Judy");

        // adding element at the end
        names.addLast("John");
        //Modify a Element
        names.set(1,"Tony");

        for (String name:names){
            System.out.println(name);
        }

        System.out.println(names.size());

    }

}
