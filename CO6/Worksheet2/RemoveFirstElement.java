package Worksheet2;

import java.util.LinkedList;

public class RemoveFirstElement {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Mango");

        // Remove and return the first element
        String firstElement = linkedList.removeFirst();

        // Print the removed element
        System.out.println("Removed element: " + firstElement);

        // Print the updated LinkedList
        System.out.println("Updated LinkedList:");
        for (String item : linkedList) {
            System.out.println(item);
        }
    }
}
