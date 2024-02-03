// Java Programming Code to Find Largest Element in Array

import java.util.Scanner;

public class LargestInArray {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size : ");
        int size = scanner.nextInt();
        int array[] = new int[size];

        for(int i=0; i<size; i++) {
            System.out.print("Enter array element [" + (i+1) + "] : ");
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        for(int i=0; i<size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Maximum element is : " + max);
        scanner.close();
    }
}