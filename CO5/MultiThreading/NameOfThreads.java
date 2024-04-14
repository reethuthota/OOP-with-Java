// Develop a Java code to print the name of the running thread 

package MultiThreading;


class NameOfThreads {
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        String threadName = t1.getName();
        System.out.println("The name of the running thread is: " + threadName);
    }
}