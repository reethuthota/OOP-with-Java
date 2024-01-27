//Insert Element in a given position in an array

import java.util.Scanner;

public class InsertArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size = scanner.nextInt();
        int myArray[] = new int[size];

        for(int i=0; i<size; i++) {
            System.out.print("Enter element [" + (i+1) + "] : ");
            myArray[i] = scanner.nextInt();
        }

        System.out.print("Enter new element to be inserted : ");
        int newElement = scanner.nextInt();
        System.out.print("Enter position to insert element at (stating from 1): ");
        int position = scanner.nextInt();

        if(position<0 || position>size){
            System.out.println("Position entered is invalid!");
        } else {
            int newArray[] = new int[size+1];
            for(int i=0; i<position-1; i++){
                newArray[i] = myArray[i];
            }
            newArray[position-1]=newElement;
            for(int i=position; i<=size; i++){
                newArray[i] = myArray[i-1];
            }
            
            System.out.print("Array elements : ");
            for(int i=0; i<size+1; i++) {
                System.out.print(newArray[i]);
            }
        }
        scanner.close();
    }
}
