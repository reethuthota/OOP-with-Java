// Wite a program to find the transpose of a matrix

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter no.of rows : ");
        int rows = scanner.nextInt();
        System.out.print("Enter no.of columns : ");
        int columns = scanner.nextInt();
        
        int Matrix[][] = new int[rows][columns];
        int TransposeMatrix[][] = new int[columns][rows];
        
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++) {
                System.out.print("Enter matrix element [" + (i+1) + "][" + (j+1) + "]: ");
                Matrix[i][j] = scanner.nextInt();
            }
        } 

        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++) {
                TransposeMatrix[j][i] = Matrix[i][j];
            }
        }

        System.out.println("Original matrix");
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        } 

        System.out.println("Transpose of matrix");
        for (int i=0; i<columns; i++){
            for (int j=0; j<rows; j++) {
                System.out.print(TransposeMatrix[i][j] + " ");
            }
            System.out.println();
        } 

        scanner.close();
    }
}
