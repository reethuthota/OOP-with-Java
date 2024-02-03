// Write a Java program to get a number from the user and print whether it is positive or negative.

import java.util.Scanner;

class numbers {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num = myObj.nextInt();

        myObj.close();

        if(num>0) {
            System.out.println("positive number");
        } else if (num<0) {
            System.out.println("negative number");
        } else {
            System.out.println("zero");
        }
    }
}