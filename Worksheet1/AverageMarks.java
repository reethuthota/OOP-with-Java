// Write a program to calculate the average marks of a student ( i.e.- assign m1,m2,m3,m4 & m5)

public class AverageMarks {
    public static void main(String[] args) {
        
        // Student's subject marks
        int m1 = 85;
        int m2 = 90;
        int m3 = 78;
        int m4 = 92;
        int m5 = 88;

        float average = (m1 + m2 + m3 + m4 + m5) / 5;

        System.out.println("Average Marks: " + average);
    }
}
