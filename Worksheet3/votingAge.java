// Write a Java program to check whether you are eligible for vote or not? by taking user input as age.

import java.util.Scanner;

class votingAge {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = myObj.nextInt();

        myObj.close();

        if(age>=18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}