// Find the perimeter of a circle using class, object and methods

import java.util.*;

class Perimeter {
    double CalculatePerimeter(int radius) {
        double per = 2 * Math.PI * radius;
        return per;
    }
}

public class PerimeterOfCircle {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of box : ");
        int radius = scanner.nextInt();
        Perimeter myCircle = new Perimeter();
        double per = myCircle.CalculatePerimeter(radius);
        System.out.println("Perimeter of the given circle : " + per);

        scanner.close();
    }
    
}
