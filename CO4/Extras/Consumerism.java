// Create the consumer class with following members: Consumer no, Consumer name, previous month reading, current month reading type of EB connection (domestic or commercial). If the type of EB Connection is domestic, calculate the amount to be paid

package Extras;

import java.util.Scanner;

class Consumer {
    int consumerNo;
    String consumerName;
    int prevMonthReading;
    int currMonthReading;
    String connectionType;

    public Consumer(int consumerNo, String consumerName, int prevMonthReading, int currMonthReading, String connectionType) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.prevMonthReading = prevMonthReading;
        this.currMonthReading = currMonthReading;
        this.connectionType = connectionType;
    }

    public double calculateBill() {
        int unitsConsumed = currMonthReading - prevMonthReading;
        double amount = 0;
    
        if (connectionType.equalsIgnoreCase("domestic")) {
            // Calculation for domestic connection
            if (unitsConsumed <= 100) {
                amount = unitsConsumed * 1;
            } else if (unitsConsumed <= 200) {
                amount = 100 * 1 + (unitsConsumed - 100) * 2.50;
            } else if (unitsConsumed <= 500) {
                amount = 100 * 1 + 100 * 2.50 + (unitsConsumed - 200) * 4;
            } else {
                amount = 100 * 1 + 100 * 2.50 + 300 * 4 + (unitsConsumed - 500) * 6;
            }
        } else if (connectionType.equalsIgnoreCase("commercial")) {
            // Calculation for commercial connection
            if (unitsConsumed <= 100) {
                amount = unitsConsumed * 2;
            } else if (unitsConsumed <= 200) {
                amount = 100 * 2 + (unitsConsumed - 100) * 4.50;
            } else if (unitsConsumed <= 500) {
                amount = 100 * 2 + 100 * 4.50 + (unitsConsumed - 200) * 6;
            } else {
                amount = 100 * 2 + 100 * 4.50 + 300 * 6 + (unitsConsumed - 500) * 7;
            }
        }
    
        return amount;
    }
    

    public void displayBill() {
        double amount = calculateBill();
        System.out.println("Consumer No: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Previous Month Reading: " + prevMonthReading);
        System.out.println("Current Month Reading: " + currMonthReading);
        System.out.println("Connection Type: " + connectionType);
        System.out.println("Amount to be Paid: Rs " + amount);
    }
}

public class Consumerism {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Consumer details:");
        System.out.print("Consumer No: ");
        int consumerNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Consumer Name: ");
        String consumerName = scanner.nextLine();
        System.out.print("Previous Month Reading: ");
        int prevMonthReading = scanner.nextInt();
        System.out.print("Current Month Reading: ");
        int currMonthReading = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Type of EB Connection (domestic or commercial): ");
        String connectionType = scanner.nextLine();

        Consumer consumer = new Consumer(consumerNo, consumerName, prevMonthReading, currMonthReading, connectionType);
        consumer.displayBill();

        scanner.close();
    }
}
