// Use nested loops to print the following output:
//     1
//    212
//   32123
//  4321234
// 543212345

import java.util.Scanner;

public class PalindromePyramid {
    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter the size of pyramid : ");
        int size = myObj.nextInt();

        for(int i=1; i<=size; i++) {
            for(int j=size; j>i; j--) {
                System.out.print(" ");
            }
            for(int k=i; k>=1; k--) {
                System.out.print(k);
            }
            for(int k=2; k<=i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }

        myObj.close();
    }
}
