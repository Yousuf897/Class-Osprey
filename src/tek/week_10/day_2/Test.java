package tek.week_10.day_2;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("Tony");
        nameList.add("Mike");
        nameList.add("Erin");
        nameList.addFirst("John");
        nameList.addLast("Jame");
        System.out.println(nameList);

        nameList.add(1,"Trevor");
        System.out.println(nameList);


        //Size of the list
        System.out.println(nameList.size());

        //How to remove element
        nameList.remove("Erin");

        //Specifically choose a element
        System.out.println(nameList.get(1));

        //Modify a Element
        nameList.set(2,"Lia");



        for (String name : nameList) {
            System.out.println(name);
        }

    }
}
