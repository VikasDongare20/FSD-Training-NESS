/**
 * getName()
 * setName()
 *
 * */
class ThreadNameDemo extends Thread{
    @Override
    public void run() {
        System.out.println("thread running...");
    }
}


public class Demo4 {
    public static void main(String[] args) {
        ThreadNameDemo t1 = new ThreadNameDemo();
        ThreadNameDemo t2 = new ThreadNameDemo();
        System.out.println("Name of t1: "+ t1.getName());
        System.out.println("Name of t2: "+ t2.getName());

        t1.start();
        t2.start();

        t1.setName("New Name T1");
        t2.setName("New Name T2");

        System.out.println("Name of t1: "+ t1.getName());
        System.out.println("Name of t2: "+ t2.getName());
    }
}