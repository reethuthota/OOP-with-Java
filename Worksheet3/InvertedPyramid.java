// Write a java program to generate a following *'s triangle. 
// Input the number : 6
// Expected Output :
// * * * * * *
//  * * * * *
//   * * * *
//    * * *
//     * *
//      *

import java.util.Scanner;

public class InvertedPyramid {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter size of pyramid : ");
        int size = myObj.nextInt();

        for(int i=1; i<=size; i++){
            for(int j=1; j<=i; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<=size-i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        myObj.close();
    }
}