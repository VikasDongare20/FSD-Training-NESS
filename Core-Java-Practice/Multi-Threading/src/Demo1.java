class ThreadDemol extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread 1 is started");
	}
}

class ThreadDemo2 implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread2 is Started");
	}
	
}
public class Demo1 {
	public static void main(String[] args) {
		 // by extending thread class
		ThreadDemol t1=new ThreadDemol();
		
		 // by extending thread class
		ThreadDemo2 threadDemo2=new ThreadDemo2();
		Thread t2=new Thread(threadDemo2);
		
		 t1.start();
	        t2.start();
	}

}
