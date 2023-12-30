/* 
 Given an integer N, the task is to write program to print the first N natural numbers in increasing order using two threads.
Input: N = 10
Output: 1 2 3 4 5 6 7 8 9 10
Input: N = 18
Output: 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18
 */

 package Threads;
public class Question2{
    int counter = 1;
    static int N;
 
    public void printEvenNumber()
    {
        synchronized (this)
        {
            while (counter < N) {
                while (counter % 2 == 0) {
                    try {
                        wait();
                    }
                    catch (
                        InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(counter + " ");
                counter++;
                notify();
            }
        }
    }
 
    public void printOddNumber()
    {
        synchronized (this)
        {
            while (counter < N) {
                while (counter % 2 == 1) {
                    try {
                        wait();
                    }
                    catch (
                        InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(counter + " ");
                counter++;
                notify();
            }
        }
    }
    public static void main(String[] args)
    {
        N = 10;
        System.out.println("N = "+N);
        Question2 mt = new Question2();
        Thread t1 = new Thread(new Runnable() {
            public void run()
            {
                mt.printOddNumber();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run()
            {
                mt.printEvenNumber();
            }
        });
        t1.start();
        t2.start(); 
         
        //Toggle the first part while running the next part as they are synchronized
        N=18;
        System.out.println("N = "+N);
        Question2 mt1 = new Question2();
        Thread t3 = new Thread(new Runnable() {
            public void run()
            {
                mt1.printOddNumber();
            }
        });
        Thread t4 = new Thread(new Runnable() {
            public void run()
            {
                mt1.printEvenNumber();
            }
        });
        t3.start();
        t4.start(); 

    }
}

/*
 OUTPUT:
    N = 10
    1 2 3 4 5 6 7 8 9 10 

    N = 18
    1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18


 */



