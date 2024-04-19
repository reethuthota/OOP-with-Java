// Create an interface Department containing attributes deptName and deptHead. It also has  methods for printing the attributes. Create a class hostel containing hostelName, hostelLocation and numberOfRooms. The class contains method printing the attributes. Then write Student class extending the Hostel class and implementing the Department interface. This class contains attributes studentName, regdNo, electiveSubject and avgMarks. Write suitable printData method for this class.  Also, implement the  methods of the Department interface.
package Worksheet1;

import java.util.Scanner;

interface Department {
    String deptName = "CSE";
    String deptHead = "Reethu";
    void getDeptDetails();
}

class Hostel {
    String hostelName, hostelLocation;
    int numberOfRooms;

    Hostel(String hostelName, String hostelLocation, int numberOfRooms) {
        this.hostelName = hostelName;
        this.hostelLocation = hostelLocation;
        this.numberOfRooms = numberOfRooms;
    }

    void getHostelDetails() {
        System.out.println("Hostel Name : " + hostelName);
        System.out.println("Hostel Location : " + hostelLocation);
        System.out.println("No of rooms : " + numberOfRooms);
    }
}

class Student extends Hostel implements Department {
    String studentName, regdNo, electiveSubject;
    double avgMarks;

    Student(String hostelName, String hostelLocation, int numberOfRooms, String studentName, String regdNo, String electiveSubject, double avgMarks) {
        super(hostelName, hostelLocation, numberOfRooms);
        this.studentName = studentName;
        this.regdNo = regdNo;
        this.electiveSubject = electiveSubject;
        this.avgMarks = avgMarks;
    }

    void printData() {
        System.out.println("Student Name : " + studentName);
        System.out.println("Regd No : " + regdNo);
        System.out.println("Elective Subject : " + electiveSubject);
        System.out.println("Average marks : " + avgMarks);
    }

    @Override
    public void getDeptDetails() {
        System.out.println("Department Name : " + deptName);
        System.out.println("Department Head : " + deptHead);
    }
}

public class StudentDetails {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Student Name : ");
        String stud_name = scan.nextLine();
        System.out.print("Enter Regd No : ");
        String regd_no = scan.nextLine();
        System.out.print("Enter Elective Subj : ");
        String elect_subj = scan.nextLine();
        System.out.print("Enter Avg Marks : ");
        Double avgMarks = scan.nextDouble();
        
        System.out.print("Enter Hotel Name : ");
        String hostel_name = scan.nextLine();
        System.out.print("Enter Hostel Location : ");
        String hostel_loc = scan.nextLine();
        System.out.print("Enter No of Rooms : ");
        int num_rooms = scan.nextInt();

        Student obj1 = new Student(hostel_name, hostel_loc, num_rooms, stud_name, regd_no, elect_subj, avgMarks);
        obj1.printData();
        obj1.getDeptDetails();
        obj1.getHostelDetails();

        scan.close();
    }
    
}
