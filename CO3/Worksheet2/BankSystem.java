// Assume that a bank maintains 2 kinds of Accounts for customers, one class called as savings account and other class called as current account. The savings account provides deposit, interest and withdrawal facilities. The current account provides deposit, withdrawal facilities but no interest. Include necessary methods in order to achieve the following tasks.
// a. Accept deposit from a customer and update the balance for both savings and current account
// b. Permit withdrawal and update the balance for both savings and current account
// c. Compute deposit and simple interest for savings account (6%-interest rate)
// d. Display the balance for current and savings account

package Worksheet2;

import java.util.Scanner;

class Account {
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdrawal(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Successful Withdrawal");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    double getBalance() {
        return this.balance;
    }

}

class SavingsAccount extends Account {
    double interestRate = 0.06;
    void SimpleInterest() {
        double interest = balance * interestRate;
        System.out.println("Interest : " + interest);
    }
}

class CurrentAccount extends Account {
    public CurrentAccount() {
        this.balance = 0.0;
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        SavingsAccount account1 = new SavingsAccount();
        CurrentAccount account2 = new CurrentAccount();

        while(true) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Compute SI for Savings Account");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scan.nextDouble();
                    account1.deposit(depositAmount);
                    account2.deposit(depositAmount);
                    System.out.println("Deposit successful.");
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scan.nextDouble();
                    account1.withdrawal(withdrawAmount);
                    account2.withdrawal(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Savings Account Balance: " + account1.getBalance());
                    System.out.println("Current Account Balance: " + account2.getBalance());
                    break;
                case 4:
                    account1.SimpleInterest();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scan.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } 
    }
}