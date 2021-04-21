
/**
 * Can we start a thread twice?
 * No after strarting a thread we can never start thread again it will throw an exception - IllegalThreadStateException
 * */
class ThreadStart extends Thread{
    @Override
    public void run() {
        System.out.println("thread started...");

    }
}

public class Demo2 {
    public static void main(String[] args) {
        ThreadStart t1 = new ThreadStart();
        t1.start();
        t1.start();
    }
}