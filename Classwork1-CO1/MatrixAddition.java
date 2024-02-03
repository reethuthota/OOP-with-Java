// Matrix Addition

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter no.of rows : ");
        int rows = myObj.nextInt();   
        System.out.print("Enter no.of columns : ");
        int columns = myObj.nextInt();   

        int matrix1[][] = new int[rows][columns];
        int matrix2[][] = new int[rows][columns];

        System.out.println("Matrix 1 elements ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print("Enter element ["+(i+1) +"]["+(j+1)+"] : ");
                int ele = myObj.nextInt();  
                matrix1[i][j] = ele;
            }
        }

        System.out.println("Matrix 2 elements");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print("Enter element ["+(i+1) +"]["+(j+1)+"] : ");
                int ele = myObj.nextInt();  
                matrix2[i][j] = ele;
            }
        }

        int resultantMatrix[][] = new int[rows][columns];
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                resultantMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Resultant matrix elements");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(resultantMatrix[i][j] + " ");
            }
            System.out.println();
        }

        myObj.close();
    }
}
