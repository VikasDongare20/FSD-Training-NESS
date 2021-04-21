class MultiThread extends Thread{
	 public void run() {
	        System.out.println("thread is running...");
	    }	
}

public class ExtendingThreadDemo {
	public static void main(String[] args) {
		MultiThread t=new MultiThread();
		t.start();
		
		
	}

}
