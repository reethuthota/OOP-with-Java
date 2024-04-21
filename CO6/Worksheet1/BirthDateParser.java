package Worksheet1;

import java.util.Scanner;

public class BirthDateParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input birth date
        System.out.println("Enter birth date in format dd/mm/yyyy: ");
        String input = scanner.nextLine();

        // Split the input by '/'
        String[] parts = input.split("/");

        // Extract day, month, and year
        String day = parts[0];
        String month = parts[1];
        String year = parts[2];

        // Print day, month, and year
        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);

        scanner.close();
    }
}
