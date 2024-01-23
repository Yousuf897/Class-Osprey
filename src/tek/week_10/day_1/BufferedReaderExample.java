package tek.week_10.day_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("StudentNames.txt"));
            String line;
            while ( ( line = reader.readLine() ) != null ) {
                System.out.println( line );
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Sorry, but I could not find the file!");
        }

    }

}
