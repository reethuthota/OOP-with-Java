// Create two threads and print even numbers with one thread and odd numbers with another thread.

package MultiThreading;

class EvenNumbers extends Thread {
    public void run() {
        System.out.println("Even Numbers");
        for(int i=2; i<=10; i+=2) {
            System.out.println(i);
        }
    }
}

class OddNumbers extends Thread {
    public void run() {
        System.out.println("Odd Numbers");
        for(int i=1; i<=10; i+=2) {
            System.out.println(i);
        }
    }
}

public class EvenOddThreading {
    public static void main(String[] args) {
        EvenNumbers t1 = new EvenNumbers();
        t1.start();

        OddNumbers t2 = new OddNumbers();
        t2.start();
    }
}
