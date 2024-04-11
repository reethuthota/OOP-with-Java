package Worksheet1;

import java.util.*;
class Addition {
    void add(int a, int b) {
        System.out.println("The sum of two integer values: "+(a+b));
    }

    void add(int a, int b, float x) {
        System.out.println("The sum of two integer values and a float value: "+(a+b+x));
    }

    void add(int i, int j , int k) {
        System.out.println("The sum of three integer values: "+(i+j+k));
    }
}
public class Add_Numbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter two integer values: ");
        Addition ob=new Addition();
        ob.add(sc.nextInt(),sc.nextInt());

        System.out.println("Enter two integer values and a float value: ");
        ob.add(sc.nextInt(),sc.nextInt(),sc.nextFloat());

        System.out.println("Enter three integer values: " );
        ob.add(sc.nextInt(),sc.nextInt(),sc.nextInt());

        sc.close();
    }
}