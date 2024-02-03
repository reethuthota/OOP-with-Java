// Write a java code to create to calculate perimeter of rectangle

import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of rectangle : ");
        int length = scanner.nextInt();
        System.out.print("Enter breadth of rectangle : ");
        int breadth = scanner.nextInt();

        if (length>0 && breadth>0){ 
            int area = length * breadth;
            System.out.println("Area of rectangle is : " + area);
        } else {
            System.out.println("Invalid length/breadth provided!");
        }

        scanner.close();
    }
}
