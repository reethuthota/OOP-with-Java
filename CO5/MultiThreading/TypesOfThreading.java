// Create thread in the two different ways [extending Thread, implementing Runnable] and print a message. Include sleep method in your code.

package MultiThreading;

class MyThread1 extends Thread {
    public void run() {
        try {
            System.out.println("Thread using Thread class is running...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}

class MyThread2 implements Runnable {
    public void run() {
        try {
            System.out.println("Thread using Runnable interface is running...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class TypesOfThreading {
    public static void main(String args[]) {
        MyThread1 t1 = new MyThread1();
        t1.start();

        MyThread2 r1 = new MyThread2();
        Thread t2 = new Thread(r1);
        t2.start();
    }
}
