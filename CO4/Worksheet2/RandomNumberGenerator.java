//Program to print random numbers in a given range.

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the minimum value of the range : ");
        int minRange = scan.nextInt();
        System.out.print("Enter the maximum value of the range : ");
        int maxRange = scan.nextInt();

        Random randomGen = new Random();
        int randomNum = randomGen.nextInt(maxRange - minRange + 1) + minRange; // Random.nextInt(n) returns a random integer between 0 (inclusive) and n (exclusive)

        System.out.println("Random number generated : " + randomNum);
        scan.close();

    }
}
