// Create an abstract class shape with abstract method to calculate area of various shapes like rectangle, triangle, square and non-abstract method to get corresponding inputs for area calculation.


import java.util.*;

abstract class shape {
    abstract void area();
    void input() {
    };
}

class Rectangle extends shape {
    double length, breadth;

    void input(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area() {
        double area = length * breadth;
        System.out.println("Area of rectangle : " + area);
    }
}

class Triangle extends shape {
    double base, height;

    void input(double base, double height) {
        this.base = base;
        this.height = height;
    }

    void area() {
        double area = 0.5 * base * height;
        System.out.println("Area of traingle : " + area);
    }
}

class Circle extends shape {
    double radius;

    void input(double radius) {
        this.radius = radius;
    }
    
    void area() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of circle : " + area);
    }
}

public class areaOfShapes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter details for Rectangle");
        System.out.print("Length : ");
        double length = scan.nextDouble();
        System.out.print("Breadth : ");
        double breadth = scan.nextDouble();
        Rectangle shape1 = new Rectangle();
        shape1.input(length, breadth);
        shape1.area();

        System.out.println("Enter details for Triangle");
        System.out.print("Base : ");
        double base = scan.nextDouble();
        System.out.print("Height : ");
        double height = scan.nextDouble();
        Triangle shape2 = new Triangle();
        shape2.input(base, height);
        shape2.area();

        System.out.println("Enter details for Circle");
        System.out.print("Radius : ");
        double radius = scan.nextDouble();
        Circle shape3 = new Circle();
        shape3.input(radius);
        shape3.area();
        scan.close();
    }
}
