// Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.

package Worksheet1;

import java.util.Scanner;

public class EvenOdd {
    void EvenOddChecker (int num) throws Exception {
        if (num%2 != 0) {
            throw new Exception("Number is odd");
        }
        System.out.println("Number is even");
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = scan.nextInt();

        EvenOdd obj1 = new EvenOdd();

        try {
            obj1.EvenOddChecker(num);
        } catch (Exception e) {
            System.out.println(e);
        }

        scan.close();
    }
}
