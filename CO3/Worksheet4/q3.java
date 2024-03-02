// Write a Java program to create an abstract class Shape with abstract methods drawarea() and drawperimeter(). Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape. 

package Worksheet4;

import java.util.*;

abstract class Shape {
    abstract void drawarea();
    abstract void drawperimeter();
}

class Circle extends Shape {
    double radius;

    Circle (double radius) {
        this.radius = radius;
    }

    void drawarea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of circle : " + area);
    }

    void drawperimeter() {
        double perimeter = 2 * 3.14 * radius;
        System.out.println("Perimeter of circle : " + perimeter);
    }
}

class Triangle extends Shape {
    double side;

    Triangle (double side) {
        this.side = side;
    }

    void drawarea() {
        double area = 0.433 * side * side;
        System.out.println("Area of triangle : " + area);
    }
    
    void drawperimeter() {
        double perimeter = 3 * side;
        System.out.println("Perimeter of triange : " + perimeter);
    }
}

public class q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter radius of circle : ");
        double rad = scan.nextDouble();
        Circle shape1 = new Circle(rad);
        shape1.drawarea();
        shape1.drawperimeter();

        System.out.print("Enter side of triangle : ");
        double side = scan.nextDouble();
        Triangle shape2 = new Triangle(side);
        shape2.drawarea();
        shape2.drawperimeter();

        scan.close();
    }   
}