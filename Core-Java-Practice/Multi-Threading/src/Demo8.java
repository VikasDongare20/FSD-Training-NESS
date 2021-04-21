class Table2{
    public void printTable(int number){
        // synchronized block
        synchronized (this){
            for(int i=0;i<10;i++){
                System.out.println(number * i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class Demo8 {
    public static void main(String[] args) {
        Table2 tableObject = new Table2();

        Thread t1 = new Thread(){
            @Override
            public void run() {
                tableObject.printTable(5);
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                tableObject.printTable(100);
            }
        };

        t1.start();
        t2.start();
    }
}