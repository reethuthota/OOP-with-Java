package numbers.Pack3;

import java.util.*;
import numbers.Pack1.Palindrome;
import numbers.Pack2.OddEven;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        Palindrome.isPalindrome(num);
        OddEven.isOddEven(num);
        scan.close();
    }
}
