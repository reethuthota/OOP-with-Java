package Worksheet2;

import java.util.LinkedList;

public class CopyLinkedList {
    public static void main(String[] args) {
        // Create the original LinkedList
        LinkedList<String> originalList = new LinkedList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Orange");
        originalList.add("Mango");

        // Create a copy of the original LinkedList using clone() method
        LinkedList<String> copiedList = (LinkedList<String>) originalList.clone();

        // Print the original LinkedList
        System.out.println("Original LinkedList:");
        for (String item : originalList) {
            System.out.println(item);
        }

        // Print the copied LinkedList
        System.out.println("\nCopied LinkedList:");
        for (String item : copiedList) {
            System.out.println(item);
        }
    }
}