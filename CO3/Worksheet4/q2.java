// Create an abstract class Bank with an abstract method getBalance. $100, $150 and $200 are deposited in banks A, B and C respectively. BankA, BankB and BankC are subclasses of class Bank, each having a method named getBalance. Call this method by creating an object of each of the three classes.

package Worksheet4;

abstract class Bank {
    abstract void getBalance();
}

class BankA extends Bank {
    private int balance = 100;
    void getBalance() {
        System.out.println("Balance in BankA is " + balance);
    }
}

class BankB extends Bank {
    private int balance = 150;
    void getBalance() {
        System.out.println("Balance in BankB is " + balance);
    }
}

class BankC extends Bank {
    private int balance = 200;
    void getBalance() {
        System.out.println("Balance in BankC is " + balance);
    }
}

public class q2 {
    public static void main(String[] args) {
        BankA acc1 = new BankA();
        acc1.getBalance();

        BankB acc2 = new BankB();
        acc2.getBalance();

        BankC acc3 = new BankC();
        acc3.getBalance();
    }

}
