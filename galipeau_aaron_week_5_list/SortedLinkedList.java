
 import java.util.Collections;
 import java.util.LinkedList;
 import java.util.Scanner;
 
 /**
  * This class implements a program that creates a sorted linked list of integers.
   * This program reads a list of integer numbers from user input, stores them in a LinkedList,
   * and sorts them in ascending order using Java Collections Framework.
   * The program can be executed from the command line and does not require an IDE.
   * <p>
   * Instructions:
   * <ul>
   *  <li>To compile: <code>javac SortedLinkedList.java</code></li>
   *  <li>To run: <code>java SortedLinkedList</code></li>
   *  <li>To generate javadoc: <code>javadoc SortedLinkedList.java</code></li>
   * </ul>
   * <p>
   * Author: Aaron Galipeau<br>
   * Course: CSC6301 Software Design and Documentation<br>
   * Assignment: Module 04: Assignment 01 - Project 04 - Linked List and Collections Framework<br>
   * Institution: Merrimack College<br>
   * Instructor: Gautham Krishnamurthy (GK)<br>
  */
 public class SortedLinkedList {
 
     /**
      * The main method which executes the program.
      * It reads integer inputs, stores them in a LinkedList, and sorts the list.
      * <p>
      * The user inputs integers, presses the enter key, and repeats until
      * the user is satisfied with the list entries and types 'end' to stop.
      * The program handles invalid input by informing the user and requesting 
      * re-entry of valid integers.
      *
      * @param args Command line arguments (not used)
      */
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         LinkedList<Integer> numbers = new LinkedList<>();
         
         System.out.println("Enter an integer, press Enter, and repeat (type 'end' to finish):");
 
         while (scanner.hasNext()) {
             String input = scanner.next();
             if (input.equalsIgnoreCase("end")) {
                 break;
             }
             try {
                 int number = Integer.parseInt(input);
                 numbers.add(number);
             } catch (NumberFormatException e) {
                 System.out.println("Invalid input. Please enter a valid integer, or type 'end' to stop.");
             }
         }
         
         // Reuse - this is reused code
         Collections.sort(numbers);
 
         System.out.println("Your sorted list of integers is: " + numbers);
 
         scanner.close();
     }
 }