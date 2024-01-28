// Write a program to reverse an array

import java.util.Scanner;

public class ReverseArray {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size : ");
        int size = scanner.nextInt();
        int array[] = new int[size];
        int ReversedArray[] = new int[size];

        for(int i=0; i<size; i++) {
            System.out.print("Enter array element [" + (i+1) + "] : ");
            array[i] = scanner.nextInt();
        }

        for(int i=0; i<size; i++) {
            ReversedArray[i] = array[size-1-i];
        }

        System.out.println("Reversed Array");
        for(int i=0; i<size; i++) {
            System.out.print(ReversedArray[i] + " ");
        }
        scanner.close();
    }
}