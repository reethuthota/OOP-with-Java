//Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a number in a row. The pattern is as follows
// 1
// 22
// 333
// 4444

import java.util.Scanner;

public class RightTriangleNums {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.print("Enter the size of triangle : ");
        int size = myObj.nextInt();

        myObj.close();

        for(int i=1; i<=size; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
