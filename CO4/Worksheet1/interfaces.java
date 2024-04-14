interface Internal {
    int getInternalMarks();
}

interface External {
    int getExternalMarks();
}

class Student_1 {
    String name;
    int studentID;
 
    Student_1(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentID);
    }
}
 
 
class Results extends Student_1 implements Internal, External {
    int internalMarks;
    int externalMarks;

    Results(String name, int studentID, int internalMarks, int externalMarks) {
        super(name, studentID);
        this.internalMarks = internalMarks;
        this.externalMarks = externalMarks;
    }

    public int getInternalMarks() {
        return internalMarks;
    }

    public int getExternalMarks() {
        return externalMarks;
    }
 
 
    void displayTotalMarks() {
        System.out.println("Total Marks: " + (internalMarks + externalMarks));
    }
 
 
    void calculateResults() {
        int totalMarks = internalMarks + externalMarks;
        System.out.println("Overall Result: " + ((double) totalMarks / 2));
    }
}
 
 
public class interfaces {
    public static void main(String[] args) {
        Results r = new Results("Bob", 9012, 85, 75);
        System.out.println("---Results Student---");
        r.displayInfo();
        System.out.println("Internal Marks: " + r.getInternalMarks());
        System.out.println("External Marks: " + r.getExternalMarks());
        r.displayTotalMarks();
        r.calculateResults();
    }
 }