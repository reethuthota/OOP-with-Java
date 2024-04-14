// Write a Java Program to Handle the User Defined Exception Using Throw Keyword. Create a class Student with attributes roll no, name, age and course. Initialize values through parameterized constructor. If age of student is not in between 15 and 21 then generate user-defined exception “AgeNotWithinRangeException”.

package Worksheet2;

import java.util.Scanner;

class Student {
    int RollNum, Age;
    String Name, Course;

    Student( String Name, int RollNum, int Age, String Course) throws Exception {
        this.Name = Name;
        this.RollNum = RollNum;
        this.Course = Course;
        if (Age > 21 || Age < 15) {
            throw new Exception("“AgeNotWithinRangeException”");
        } else {
            this.Age = Age;
        }
    }

    void printData() {
        System.out.println("Name : " + Name);
        System.out.println("Roll Number : " + RollNum);
        System.out.println("Age : " + Age);
        System.out.println("Course : " + Course);
    }
}

public class UserDefinedExceptions {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Name : ");
        String name = scan.nextLine();
        System.out.print("Enter Course : ");
        String course = scan.nextLine();
        System.out.print("Enter Roll Num : ");
        int rollNum = scan.nextInt();
        System.out.print("Enter Age : ");
        int age = scan.nextInt();

        try {
            Student st1 = new Student(name, rollNum, age, course);
            st1.printData();
        } catch (Exception e) {
            System.out.println(e);
        }
    
        scan.close();
    }
    
}
