package tek.week_10.day_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Review {

    public static void main(String[] args) {

        try {
            String firstName = null;

            System.out.println(firstName.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("firstName cannot be null!");
        }

        System.out.println( "Someting after the method!" );
    }
/*
    try {
        BufferedReader reader = new BufferedReader(new FileReader("File.txt"));
    } catch (FileNotFoundException e) {
        System.out.println("File not found!");
    }*/
}
