import java.util.Scanner;

public class RetailDiscount {
    double billAmount;

    public RetailDiscount(double billAmount) {
        this.billAmount = billAmount;
    }
    
    public double calculateDiscount() {
        double discountPercentage;

        if (billAmount >= 1000) {
            discountPercentage = 5;
        } else if (billAmount >= 500 && billAmount < 1000) {
            discountPercentage = 2;
        } else if (billAmount > 0 && billAmount < 500) {
            discountPercentage = 1;
        } else {
            discountPercentage = 0;
        }
        return discountPercentage;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the bill amount: ");
        double billAmount = scanner.nextDouble();
        RetailDiscount retailStore = new RetailDiscount(billAmount);
        double discountPercentage = retailStore.calculateDiscount();
        System.out.println("Discount Percentage: " + discountPercentage + "%");
        scanner.close();
    }
}
