package Worksheet1;

import java.util.Scanner;

public class StringInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String S1 = scanner.nextLine();

        // Length of the string
        System.out.println("Length of this string: " + S1.length());

        // Character at position 6
        if (S1.length() >= 7) {
            System.out.println("The character at position 6: " + S1.charAt(5));
        } else {
            System.out.println("The string is too short to get character at position 6.");
        }

        // Substring from 26 to 32
        if (S1.length() >= 33) {
            System.out.println("The substring from 26 to 32: " + S1.substring(25, 32));
        } else {
            System.out.println("The string is too short to get the substring from 26 to 32.");
        }

        // Index position of first 'a'
        int indexOfA = S1.indexOf('a');
        if (indexOfA != -1) {
            System.out.println("The index position of first 'a': " + indexOfA);
        } else {
            System.out.println("The character 'a' is not found in the string.");
        }

        // Index of the beginning of the substring 'IBM'
        int indexOfIBM = S1.indexOf("IBM");
        if (indexOfIBM != -1) {
            System.out.println("The index of the beginning of the substring 'IBM': " + indexOfIBM);
        } else {
            System.out.println("The substring 'IBM' is not found in the string.");
        }

        scanner.close();
    }
}