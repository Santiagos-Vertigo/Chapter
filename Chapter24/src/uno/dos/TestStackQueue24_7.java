package uno.dos;

import java.util.Queue;

public class TestStackQueue24_7 {
    public static void main (String[]args){
        // Create stack
        GenericStack<String> stack = new GenericStack<>();

        // Add elements to the stack
        stack.push("Tom"); // push Tom to the stack
        System.out.println("(1) " + stack);

        stack.push("Susan "); // Push Susan to the stack
        System.out.println("(2) " + stack);

        stack.push("Kim"); // Push Kim to the stack
        stack.push("Michael"; // Push Michael to the stack
        System.out.println("(3) " + stack);

        // Remove elements from stack
        System.out.println("(4) " + stack.pop());
        System.out.println("(5) " + stack.pop());
        System.out.println("(6) " + stack);

        // Create a queue
        GenericQueue24_6<String> queue = new GenericQueue24_6<>();

        // Add elements to the queue
        queue.enqueue("Tom"); // Add Tom to the queue
        System.out.println("(7) " + queue);

        queue.enqueue("Susan"); // Add Susan to the queue
        System.out.println("(8) " + queue);

        queue.enqueue("Kim"); // Add Susan to the queue
        queue.enqueue("Michael"); // Add Michael to the queue
        System.out.println("(9) " + queue);

        // Remove elements
        System.out.println("(10) " + queue.dequeue());
        System.out.println("(11) " + queue.dequeue());
        System.out.println("(12) " + queue);
    }
}
