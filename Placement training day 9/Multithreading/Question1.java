/* Write a Java program to perform a runnable interface, take two threads t1 and t2 and fetch the names of the thread using getName() method. */

package Threads;
public class Question1 {
    public static void main(String[] args) {
        threadClass obj = new threadClass();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        System.out.println("========================================");
        System.out.println("                THREADS                 ");
        System.out.println("========================================");
        t1.start();
        t2.start();
        

    }
}
class threadClass implements Runnable
{
    public void run()
    {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }
}

/*
OUTPUT:
    ========================================
                    THREADS
    ========================================
    Thread Name: Thread 1
    Thread Name: Thread 2
 */