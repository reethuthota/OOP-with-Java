// Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses bike, car and van. Each subclass should have properties such as make, model, year, and fuel type. Implement methods for calculating fuel efficiency, mileage. (fuel efficiency=no.of kilometres travelled/no. of litres consumed, mileage= no.of kilometres travelled/litre).
package Activity2;

class Vehicle {
    String model, make, fuelType;
    int year;

    void fuelEfficiency(double kms_travelled, double fuel_liters) {
        System.out.println((kms_travelled/fuel_liters));
    }

    void mileage(double km, int l) {
        System.out.println((km/l));
    }
}
    
class Bike extends Vehicle {
    public Bike (String model, String make, String fuelType, int year) {
        this.model = model;
        this.make = make;
        this.fuelType = fuelType;
        this.year = year;

        System.out.println(model + " " + make + " " + fuelType + " " + year);
    }
}

class Car extends Vehicle {
    public Car (String model, String make, String fuelType, int year) {
        this.model = model;
        this.make = make;
        this.fuelType = fuelType;
        this.year = year;

        System.out.println(model + " " + make + " " + fuelType + " " + year);
    }
}

class Van extends Vehicle {
    public Van (String model, String make, String fuelType, int year) {
        this.model = model;
        this.make = make;
        this.fuelType = fuelType;
        this.year = year;

        System.out.println(model + " " + make + " " + fuelType + " " + year);
    }
}

public class Vehicles {
    public static void main(String[] args) {
        Bike vehicle1 = new Bike("Hunter","Royal Enfield", "petrol", 2023);;
        vehicle1.fuelEfficiency(250.0,15.0);
        vehicle1.mileage(20,1);

        Car vehicle2 = new Car("Compass","Jeep", "diesel", 2022);
        vehicle2.fuelEfficiency(500.0, 40.0);
        vehicle2.mileage(30,1);

        Van vehicle3 = new Van("Omni","Maruti", "petrol", 2015);
        vehicle3.fuelEfficiency(1000.0,10.0);
        vehicle3.mileage(10,1);
    }
}
