// Develop a Java code to print the name of the running thread 

package MultiThreading;


class NameOfThreads extends Thread {
    public static void main(String[] args) {
        // Thread t1 = Thread.currentThread();
        NameOfThreads t1 = new NameOfThreads();
        String threadName = t1.getName();
        System.out.println("The name of the running thread is: " + Thread.currentThread().getName());
        System.out.println(threadName);
    }
}