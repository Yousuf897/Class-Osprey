package tek.week_10.day_4;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>();

        // How to add elements in stack
        queue.add("Bob");
        queue.add("Tony");
        queue.add("Mike");
        queue.add("Trevor");

        // Print the elements of stack
        System.out.println(queue);

        // How to remove elements from stack
        queue.remove();

        // Print the elements of stack
        System.out.println(queue);

        // Print the elements of stack
        System.out.println(queue);

        // How to check the top value of the stack
        System.out.println(queue.peek());

        // How to add elements in stack
        queue.add("Mike");
        queue.add("Trevor");

        // Print the elements of stack
        System.out.println(queue);

        // How to remove all elements one by one from stack
        while (!queue.isEmpty()) {
            System.out.println("Pop element: " + queue.remove());
        }

        // To check the size of stack
        System.out.println(queue.size());


        // Print the elements of stack
        System.out.println(queue);

        // how to print all elements of stack
        for (String element : queue) {
            System.out.println(element);
        }

    }

}
