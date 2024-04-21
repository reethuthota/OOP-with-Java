package Worksheet2;

import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedList {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");

        // Get list iterator starting from the end of the list
        ListIterator<String> iterator = linkedList.listIterator(linkedList.size());

        // Iterate the linked list in reverse order using a for loop
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            // Move iterator to the previous element
            String element = iterator.previous();
            System.out.println("Element at index " + i + ": " + element);
        }
    }
}
