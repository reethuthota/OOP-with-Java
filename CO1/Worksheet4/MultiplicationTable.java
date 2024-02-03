//Write a program in Java to display the multiplication table of a given integer.

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = scanner.nextInt();

        System.out.println("Multiplication table");
        for(int i=1; i<=10; i++) {
            int result = i * num;
            System.out.println(num + " * " + i + " = " + result);
        }
        scanner.close();
    }
}