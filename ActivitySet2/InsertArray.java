// Java Programming Code to Insert Element in Array

import java.util.Scanner;

public class InsertArray {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);


        System.out.print("Enter size of array : ");
        int size = myObj.nextInt();
        int myArray[] = new int[size];

        for(int i=0; i<size; i++) {
            System.out.print("Enter element [" + (i+1) + "] : ");
            int ele = myObj.nextInt();
            myArray[i] = ele;
        }
        
        System.out.print("Array elements : ");
        for(int i=0; i<size; i++) {
            System.out.print(myArray[i]);
        }

        myObj.close();
    }
}
