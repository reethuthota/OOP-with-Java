// Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

import java.util.Scanner;

public class DigitAddition {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scanner.nextInt();

        if (num>1000 || num<=0){
            System.out.println("Your input was invalid!");
        } else {
            int digit=0, sum=0;
            while (num>0){
                digit = (num%10);
                num /= 10;
                sum += digit;
            }
            System.out.println("Sum of digits is " + sum);
        }
        scanner.close();
    }
}
