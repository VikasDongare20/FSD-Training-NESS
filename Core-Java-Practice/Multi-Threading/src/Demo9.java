
/**
 * Lock
 * Synchronization is built around an internal entity know as lock or monitor
 * Every object has a lock associated with it
 * every thread that need consistency access to a object has to acquire lock before accessing them and
 * then release the lock when its done
 *
 * # Deadlock in java
 * It a part of multithreading
 * Deadlock can occur in a situation when a thread is waiting for an object lock, that is acquired by another thread
 * and second thread is waiting for an object lock that is acquired by first thread
 * since both thread are waiting for each other to release the lock this condition is called deadlock
 * */
public class Demo9 {
    public static void main(String[] args) {
        final String resource1 = "first string";
        final String resource2 = "second string";

        Thread t1 = new Thread(){
            @Override
            public void run() {
                synchronized (resource1){
                    System.out.println("Thread 1: locked resource 1");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resource2){
                        System.out.println("Thread 1: locked resource 2");
                    }
                }
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                synchronized (resource2){
                    System.out.println("Thread 2: locked resource 2");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resource1){
                        System.out.println("Thread 2: locked resource 1");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}