package tek.week_10.day_4;

import java.util.HashMap;
import java.util.Map;

public class HashMapExampleThree {

    public static void main(String[] args) {

        String message = "aksjdkl;ajsdjal;ksdkasdljas;dkljas;kdl";
        Map<Character, Integer> countCharacters = new HashMap<>();
        char[] characters = message.toCharArray();

        // W = 1
        // e = 1

        for ( char character : characters ) {
           if ( countCharacters.containsKey(character) ) {
               countCharacters.put(character, countCharacters.get(character) + 1);
           } else {
               countCharacters.put(character, 1);
           }
        }

        // Print the count of each character
        System.out.println("Count of each Character");
        for (Map.Entry<Character, Integer> entry : countCharacters.entrySet() ) {
            System.out.println( entry.getKey() + " = " + entry.getValue() );
        }






    }

}
