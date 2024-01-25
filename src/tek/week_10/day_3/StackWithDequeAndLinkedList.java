package tek.week_10.day_3;

import java.util.Deque;
import java.util.LinkedList;

public class StackWithDequeAndLinkedList {

    public static void main(String[] args) {

        Deque<String> stack = new LinkedList<>();

        // How to add elements in stack
        stack.add("Bob");
        stack.add("Tony");
        stack.add("Mike");
        stack.add("Trevor");

        // Print the elements of stack
        System.out.println( stack );

        // How to remove elements from stack
        stack.pop();

        // Print the elements of stack
        System.out.println( stack );

        // How to remove elements from stack
        stack.pop();

        // Print the elements of stack
        System.out.println( stack );

        // How to check the top value of the stack
        System.out.println( stack.peek() );

        // How to add elements in stack
        stack.add("Mike");
        stack.add("Trevor");

        // Print the elements of stack
        System.out.println( stack );

        // How to remove all elements one by one from stack
        while ( !stack.isEmpty() ) {
            System.out.println("Pop element: " + stack.pop());
        }

        // To check the size of stack
        System.out.println( stack.size() );

        // How to add elements into stack
        stack.push("Lia");
        stack.push("Sam");
        stack.push("Eric");
        stack.push("Brent");

        // Print the elements of stack
        System.out.println( stack );

        // how to print all elements of stack
        for ( String element : stack ) {
            System.out.println( element );
        }

        stack.remove("Eric");

        // Print the elements of stack
        System.out.println( stack );


    }

}
