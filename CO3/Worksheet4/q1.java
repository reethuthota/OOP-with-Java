//Create an abstract class "Parent" with a method "message". It has two subclasses each having a method with the same name "message" that prints "This is first subclass" and "This is second subclass" respectively. Call the methods "message" by creating an object for each subclass.

package Worksheet4;

abstract class Parent {
    public abstract void message();
}

class Subclass1 extends Parent {
    public void message() {
        System.out.println("This is first subclass");
    }
}

class Subclass2 extends Parent {
    public void message() {
        System.out.println("This is second subclass");
    }
}

public class q1 {
    public static void main(String[] args) {
        Subclass1 obj1 = new Subclass1();
        obj1.message();
     
        Subclass2 obj2 = new Subclass2();
        obj2.message();
    }
}