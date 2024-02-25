// Assume that a bank maintains 2 kinds of Accounts for customers, one class called as savings account and other class called as current account. The savings account provides deposit, interest and withdrawal facilities. The current account provides deposit, withdrawal facilities but no interest. Include necessary methods in order to achieve the following tasks.
// a. Accept deposit from a customer and update the balance for both savings and current account
// b. Permit withdrawal and update the balance for both savings and current account
// c. Compute deposit and simple interest for savings account (6%-interest rate)
// d. Display the balance for current and savings account

package Worksheet2;

import java.util.Scanner;

class Account {
    double balance;

    public Account() {
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient funds.");
            return false;
        }
    }

    public double getBalance() {
        return this.balance;
    }
}

class SavingsAccount extends Account {
    double interestRate;

    public SavingsAccount() {
        this.balance = 0.0;
        this.interestRate = 0.06; // 6% interest rate
    }

    public void computeInterest() {
        double interest = this.balance * this.interestRate;
        System.out.println("Interest earned: " + interest);
        this.balance += interest;
    }
}

class CurrentAccount extends Account {
    public CurrentAccount() {
        this.balance = 0.0;
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SavingsAccount savingsAccount = new SavingsAccount();
        CurrentAccount currentAccount = new CurrentAccount();

        while (true) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Compute SI for Savings Account");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    savingsAccount.deposit(depositAmount);
                    currentAccount.deposit(depositAmount);
                    System.out.println("Deposit successful.");
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    boolean success = savingsAccount.withdraw(withdrawAmount);
                    if (success) {
                        currentAccount.withdraw(withdrawAmount);
                        System.out.println("Withdrawal successful.");
                    }
                    break;
                case 3:
                    System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
                    System.out.println("Current Account Balance: " + currentAccount.getBalance());
                    break;
                case 4:
                    savingsAccount.computeInterest();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }
}