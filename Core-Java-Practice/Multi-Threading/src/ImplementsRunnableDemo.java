class MultiThreadDemo2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running....");
		
	}
	
}
public class ImplementsRunnableDemo {
	public static void main(String[] args) {
		
		MultiThreadDemo2 t = new MultiThreadDemo2();
		Thread t2=new Thread(t);
		t.run();
		t2.start();
	}

}
