
/**
 * Synchronization in Java
 * It is a capability to control the access of multiple threads to any share resource
 * It give us better option where we want to allow only one thread to access the shared resource
 *
 * # Why use synchronization
 * 1. to prevent thread interface
 * 2. to prevent consistency problem
 *
 * # Type of Synchronization
 * 1. Process Synchronization
 * 2. Thread Synchronization
 *
 * */

class Table{
    // Without Synchronization
//    public void printTable(int number){
//        for(int i=0;i<10;i++){
//            System.out.println(number + " x "+ i + " = "+ number *i);
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
    // with Synchronization
    synchronized void printTable(int number){
        for(int i=0;i<10;i++){
            System.out.println(number + " x "+ i + " = "+ number *i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread1 extends Thread{
    Table table;
    MyThread1(Table table){
        this.table = table;
    }

    @Override
    public void run() {
        table.printTable(5);
    }
}

class MyThread2 extends Thread{
    Table table;
    MyThread2(Table table){
        this.table = table;
    }

    @Override
    public void run() {
        table.printTable(100);
    }
}

public class Demo7 {
    public static void main(String[] args) {
        Table tableObject = new Table();
        MyThread1 t1 = new MyThread1(tableObject);
        MyThread2 t2 = new MyThread2(tableObject);
        t1.start();
        t2.start();
    }
}