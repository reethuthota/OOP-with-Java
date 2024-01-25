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

        System.out.print("Enter size of triangle : ");
        int size = myObj.nextInt();

        myObj.close();

        for(int i=0; i<=size-1; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<=size-1-i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
