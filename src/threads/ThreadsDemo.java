package threads;

public class ThreadsDemo extends Thread {

    // cross lock, program doesn't exit because one is waiting on the other
    public static Object anObject = new Object();
    public static String myString = "test";


    @Override
    public void run() {
        // synchronized makes the threads run in order
        synchronized (anObject) {
            System.out.println("Thread 1: accessing the object");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (myString) {
                System.out.println("Thread 1: trying to access the string that Thread 2 is accessing");
            }

        }


        synchronized (myString) {
            System.out.println("Thread 2: accessing the string");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (anObject) {
                System.out.println("Thread 2: trying to access the string that Thread 1 is accessing");
            }
        }
    }

    public static void main(String[] args) {
        ThreadsDemo thread1 = new ThreadsDemo();
        ThreadsDemo thread2 = new ThreadsDemo();

        // joins two threads
//        try {
//
//            thread1.threadTest.join();
//            thread2.threadTest2.join();
//        } catch (Exception e){
//            e.printStackTrace();
//        }


        // nasty path - if you start the same thread twice you get illegal thread state exception
        thread1.start();
        //thread1.threadTest.start();
        thread2.start();

        // race condition


    }
}