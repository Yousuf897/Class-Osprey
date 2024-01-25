package tek.week_10.day_3;

import java.util.HashSet;

public class InterviewQuestion {

    public static void main(String[] args) {

        String[] names = {"Eric", "Bob", "Eric", "Erin", "Alex", "Lia", "Mike", "Mike"};
        int[] numbers = {1, 2, 1, 0, 10, 10, 60, 100, 96, 95, 45};
        int countDuplicateValues = 0;

        // Remove the duplicate values from the the above arrays

        HashSet<String> uniqueNames = new HashSet<>();
        HashSet<Integer> uniqueNumbers = new HashSet<>();

        for (String name : names) {
            if (!uniqueNames.add(name)) {
                countDuplicateValues++;
            } else {
                uniqueNames.add(name);
            }
        }

        for (int number : numbers) {
            uniqueNumbers.add(number);
        }

        // print unique names
        System.out.println(uniqueNames );
        System.out.println("There was "+countDuplicateValues +" duplicate values in the array.");

        // print the values of unique numbers
        System.out.println( uniqueNumbers );
    }


}

