// Create a class Bank and define final method to display fixed loan amount of Rs.1500000 of personal loan and implement various methods to display various loan schemes.
// If age is <=25 eligible for education loan of 10,00,000 if age >25 and <=45 eligible for fixed loan amount, if age >45 and <=60 eligible for house loan of 20,00,000

import java.util.*;

class Bank {
    final void DisplayPersonalLoan() {
        System.out.println("Personal Loan amount : Rs.15,00,000");
    }

    void DisplayEducationLoan() {
        System.out.println("Education Loan amount : Rs.10,00,000");
    }
    
    void DisplayHouseLoan() {
        System.out.println("House Loan amount : Rs.20,00,000");
    }
}

public class BankLoans {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Bank customer = new Bank();

        System.out.print("Enter your age : ");
        int age = scan.nextInt();

        if (age<0) {
            System.out.println("Not a valid age.");
        } else if (age>=0 && age<=25) {
            customer.DisplayEducationLoan();
        } else if (age>25 && age<45) {
            customer.DisplayPersonalLoan();
        } else if (age>45 && age<=60) {
            customer.DisplayHouseLoan();
        } else {
            System.out.println("Not eligible for any loans.");
        }

        scan.close();
    }
}
