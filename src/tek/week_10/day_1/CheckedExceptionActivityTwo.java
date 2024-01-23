package tek.week_10.day_1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionActivityTwo {

    public static void main(String[] args) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("FileGeneratedByLoop.txt"));
                for (int i = 1; i <= 5; i++) {
                    writer.write( '\n' + "Welcome!");
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

