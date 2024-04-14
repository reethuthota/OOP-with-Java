// Write a program to print "Good morning" and "Welcome" continuously on the screen in Java using threads.

package MultiThreading;

class Msg1 extends Thread {
    public void run() {
        while(true) {
            System.out.println("Good Morning");
        }
    }
}

class Msg2 extends Thread {
    public void run() {
        while(true) {
            System.out.println("Welcome");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ForeverMsgs {
    public static void main(String[] args) {
        Msg1 t1 = new Msg1();
        t1.start();

        Msg2 t2 = new Msg2();
        t2.start();
    }
}
