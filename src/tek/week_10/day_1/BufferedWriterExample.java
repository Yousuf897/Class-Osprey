package tek.week_10.day_1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

    public static void main(String[] args) {
        String[] studentNames = {"bob", "tony", "trevor", "mike"};

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("StudentNames.txt"));
            writer.write("Student Names: ");
            for ( String name : studentNames ) {
                writer.write( '\n' + name);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
