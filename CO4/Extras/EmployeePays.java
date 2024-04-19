// Develop a java application with Employee class with Emp_name, Emp_id, Address, Mail_id, Mobile_no as members. Inherit the classes, Programmer, Assistant Professor, Associate Professor and Professor from employee class. Add Basic Pay (BP) as the member of all the inherited classes with 97% of BP as DA, 10 % of BP as HRA, 12% of BP as PF, 0.1% of BP for staff club fund. Generate pay slips for the employee with their gross and net salary.

package Extras;

import java.util.Scanner;

class Employee {
    String empName;
    int empId;
    String address;
    String mailId;
    String mobileNo;

    public Employee(String empName, int empId, String address, String mailId, String mobileNo) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
    }

    public void display() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Address: " + address);
        System.out.println("Mail ID: " + mailId);
        System.out.println("Mobile No: " + mobileNo);
    }
}

class Programmer extends Employee {
    double basicPay;

    public Programmer(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo);
        this.basicPay = basicPay;
    }

    public void generatePaySlip() {
        double da = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;
        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - pf - staffClubFund;
        
        System.out.println("Pay Slip for Programmer:");
        display();
        System.out.println("Basic Pay: $" + basicPay);
        System.out.println("DA: $" + da);
        System.out.println("HRA: $" + hra);
        System.out.println("PF: $" + pf);
        System.out.println("Staff Club Fund: $" + staffClubFund);
        System.out.println("Gross Salary: $" + grossSalary);
        System.out.println("Net Salary: $" + netSalary);
    }
}

class AssistantProfessor extends Employee {
    double basicPay;

    public AssistantProfessor(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo);
        this.basicPay = basicPay;
    }

    public void generatePaySlip() {
        double da = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;
        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - pf - staffClubFund;
        
        System.out.println("Pay Slip for Programmer:");
        display();
        System.out.println("Basic Pay: $" + basicPay);
        System.out.println("DA: $" + da);
        System.out.println("HRA: $" + hra);
        System.out.println("PF: $" + pf);
        System.out.println("Staff Club Fund: $" + staffClubFund);
        System.out.println("Gross Salary: $" + grossSalary);
        System.out.println("Net Salary: $" + netSalary);
    }
}

class AssociateProfessor extends Employee {
    double basicPay;

    public AssociateProfessor(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo);
        this.basicPay = basicPay;
    }

    public void generatePaySlip() {
        double da = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;
        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - pf - staffClubFund;
        
        System.out.println("Pay Slip for Programmer:");
        display();
        System.out.println("Basic Pay: $" + basicPay);
        System.out.println("DA: $" + da);
        System.out.println("HRA: $" + hra);
        System.out.println("PF: $" + pf);
        System.out.println("Staff Club Fund: $" + staffClubFund);
        System.out.println("Gross Salary: $" + grossSalary);
        System.out.println("Net Salary: $" + netSalary);
    }
}

class Professor extends Employee {
    double basicPay;

    public Professor(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo);
        this.basicPay = basicPay;
    }

    public void generatePaySlip() {
        double da = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;
        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - pf - staffClubFund;
        
        System.out.println("Pay Slip for Programmer:");
        display();
        System.out.println("Basic Pay: $" + basicPay);
        System.out.println("DA: $" + da);
        System.out.println("HRA: $" + hra);
        System.out.println("PF: $" + pf);
        System.out.println("Staff Club Fund: $" + staffClubFund);
        System.out.println("Gross Salary: $" + grossSalary);
        System.out.println("Net Salary: $" + netSalary);
    }
}

public class EmployeePays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Programmer details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Mail ID: ");
        String mailId = scanner.nextLine();
        System.out.print("Mobile No: ");
        String mobileNo = scanner.nextLine();
        System.out.print("Basic Pay: ");
        double basicPay = scanner.nextDouble();

        Programmer emp1 = new Programmer(name, id, address, mailId, mobileNo, basicPay);
        emp1.generatePaySlip();

        AssistantProfessor emp2 = new AssistantProfessor(name, id, address, mailId, mobileNo, basicPay);
        emp2.generatePaySlip();

        AssociateProfessor emp3 = new AssociateProfessor(name, id, address, mailId, mobileNo, basicPay);
        emp3.generatePaySlip();

        Professor emp4 = new Professor(name, id, address, mailId, mobileNo, basicPay);
        emp4.generatePaySlip();

        scanner.close();
    }
}
