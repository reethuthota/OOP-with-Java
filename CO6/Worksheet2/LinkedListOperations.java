package Worksheet2;

import java.util.LinkedList;

public class LinkedListOperations {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Mango");

        // Display elements and their positions
        System.out.println("Elements in the LinkedList:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("Position " + i + ": " + linkedList.get(i));
        }

        // Add an element at position 2
        linkedList.add(2, "Grapes");
        System.out.println("\nAfter adding 'Grapes' at position 2:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("Position " + i + ": " + linkedList.get(i));
        }

        // Remove an element at position 3
        linkedList.remove(3);
        System.out.println("\nAfter removing the element at position 3:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("Position " + i + ": " + linkedList.get(i));
        }
    }
}