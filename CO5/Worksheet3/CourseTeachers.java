//Write a program using synchronization, where use 2 student class.(studentA, studentB). These studentA and studentB class has to print their teacher names of their courses.(use synchronized courseteacher method).

package Worksheet3;

class Course {
    String courseName, teacherName;

    Course(String courseName, String teacherName) {
        this.courseName = courseName;
        this.teacherName = teacherName;
    }

    public synchronized void getCourseTeacher() {
        System.out.println("Student A's teacher for " + this.courseName + " is " + this.teacherName);
    }
}

class StudentA extends Thread {
    Course c;
    StudentA(Course c) {
        this.c = c;
    }

    public synchronized void run() {
        c.getCourseTeacher();
    }
}

class StudentB extends Thread {
    Course c;
    StudentB(Course c) {
        this.c = c;
    }

    public synchronized void run() {
        c.getCourseTeacher();
    }
}

public class CourseTeachers {
    public static void main(String[] args) {
        Course mathCourse = new Course("Math", "Mr. Smith");
        Course scienceCourse = new Course("Science", "Ms. Johnson");

        StudentA stA = new StudentA(mathCourse);
        StudentB stB = new StudentB(scienceCourse);

        stA.start();
        stB.start();
    }
}

