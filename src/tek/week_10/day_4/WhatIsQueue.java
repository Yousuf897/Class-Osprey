package tek.week_10.day_4;

public class WhatIsQueue {

    /*
    *
    * A queue is a linear data structure that follows the First In First Out (FIFO) principle. This means that the first element added to the queue
    * will be the first element to be removed. Think of a queue as a real-life queue or line (like in a bank or grocery checkout) — the first person to
    *  get in line is the first person to be served.

    In Java, the Queue interface represents this data structure and is a part of the Java Collections Framework. The Queue interface provides methods for
    * performing standard queue operations:

    add(e): Inserts the specified element into the queue. Throws an exception if the operation fails (e.g., if the queue is bounded and full).

    offer(e): Inserts the specified element into the queue, returning true if the operation succeeds and false otherwise.

    remove(): Retrieves and removes the head of the queue. Throws an exception if the queue is empty.

    poll(): Retrieves and removes the head of the queue, or returns null if the queue is empty.

    element(): Retrieves but does not remove the head of the queue. Throws an exception if the queue is empty.

    peek(): Retrieves but does not remove the head of the queue, or returns null if the queue is empty.



import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        // Adding elements to the queue
        queue.offer("John");
        queue.offer("Jane");
        queue.offer("Doe");

        // Retrieving and removing the head of the queue
        System.out.println(queue.poll());  // Outputs: John

        // Checking the new head of the queue
        System.out.println(queue.peek());  // Outputs: Jane
    }
}


    *
    * */

}
