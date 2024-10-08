import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/**
 * This class implements a program that creates a sorted stack of integers.
 * This program reads a list of integer numbers from user input, stores them in a Stack,
 * and sorts them in ascending order using Java Collections Framework.
 * The program can be executed from the command line and does not require an IDE.
 * <p>
 * Instructions:
 * <ul>
 *  <li>To compile: <code>javac SortedStack.java</code></li>
 *  <li>To run: <code>java SortedStack</code></li>
 *  <li>To generate javadoc: <code>javadoc SortedStack.java</code></li>
 * </ul>
 * <p>
 * Author: Aaron Galipeau<br>
 * Course: CSC6301 Software Design and Documentation<br>
 * Previous Assignment: 
 * Module 04: Assignment 01 - Project 04 - Linked List and Collections Framework (Maintained)<br>
 * Current Assignment:
 * Module 05: Assignment 01 - Project 05 - Planning and Executing a Maintenance Task<br>
 * Institution: Merrimack College<br>
 * Instructor: Gautham Krishnamurthy (GK)
 */
public class SortedStack {

    /**
     * The main method which executes the program.
     * It reads integer inputs, stores them in a Stack, sorts the stack in ascending order.
     * <p>
     * The user inputs integers, presses the enter key, and repeats until
     * the user is satisfied with the stack entries and types 'end' to stop.
     * The program handles invalid input by informing the user and requesting 
     * re-entry of valid integers.
     *
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> numbers = new Stack<>();
        
        // Code Reuse - Encapsulating input logic for stack population
        pushNumbersToStack(scanner, numbers);
        
        // Code Reuse - Collections Framework - Sorting the stack in ascending order
        sortStack(numbers);

        System.out.println("Your sorted stack of integers from smallest to largest is: " + numbers);

        scanner.close();
    }

    /**
     * Reads integers from scanner input and pushes them into the stack.
     * Stops when 'end' is entered.
     * <p>
     * Code Maintenance Note:
     * The logic for reading input and adding to the stack was separated into
     * a dedicated method to improve modularity. This improves readability,
     * makes the code easier to test, and enables reuse of the input logic
     * if needed elsewhere in the program.
     *
     * @param scanner The Scanner object for input
     * @param stack   The stack to store integers
     */
    private static void pushNumbersToStack(Scanner scanner, Stack<Integer> stack) {
        System.out.println("Enter an integer, press Enter, and repeat (type 'end' to finish):");

        while (scanner.hasNext()) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("end")) break;
            try {
                int number = Integer.parseInt(input);
                stack.push(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer, or type 'end' to stop.");
            }
        }
    }

    /**
     * Sorts the stack in ascending order using Collections Framework.
     * <p>
     * Code Maintenance Note:
     * The sorting logic was encapsulated in its own method to follow the 
     * single-responsibility principle, allowing for easier modifications
     * to the sorting process in the future, improving maintainability.
     *
     * @param stack The stack of integers to be sorted
     */
    private static void sortStack(Stack<Integer> stack) {
        // Code Reuse - Collections Framework for sorting
        Collections.sort(stack);
    }
}
