package numbers.Pack1;

public class Palindrome {
    public static void isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num!=0) {
            int digit = num % 10;
            reversedNum = (reversedNum * 10) + digit;
            num/=10;
        }

        if(originalNum == reversedNum) {
            System.out.println("Number is a palindrome");
        } else {
            System.out.println("Number is not a palindrome");
        }
    }
}
