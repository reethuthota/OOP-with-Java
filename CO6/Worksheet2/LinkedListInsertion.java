package Worksheet2;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListInsertion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating a LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Inserting elements at the first and last positions
        linkedList.addFirst(10);
        linkedList.addLast(20);

        // Displaying the LinkedList
        System.out.println("LinkedList after adding elements at first and last positions: " + linkedList);

        // Inserting elements at any specified positions
        System.out.print("Enter the position where you want to insert the element: ");
        int position = scanner.nextInt();
        System.out.print("Enter the value you want to insert: ");
        int value = scanner.nextInt();

        // Checking if the specified position is valid
        if (position >= 0 && position <= linkedList.size()) {
            linkedList.add(position, value);
            System.out.println("LinkedList after adding element at position " + position + ": " + linkedList);
        } else {
            System.out.println("Invalid position! Position should be between 0 and " + linkedList.size());
        }

        scanner.close();
    }
}
