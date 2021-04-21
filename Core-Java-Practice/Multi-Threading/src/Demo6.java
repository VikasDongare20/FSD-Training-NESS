/**
 * join()
 * This method wait for a thread to die
 * current running thread to stop executing untill the thread it joins will complete it task
 */

class ThreadJoinDemo extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread Name: "+Thread.currentThread().getName());
			System.out.println(i);
		}
	}
}
public class Demo6 {
	public static void main(String[] args) {
	ThreadJoinDemo t1=new ThreadJoinDemo();
	ThreadJoinDemo t2 = new ThreadJoinDemo();
    ThreadJoinDemo t3 = new ThreadJoinDemo();
    
    t1.start();
    try {
		t1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    t2.start();
    t3.start();
	}

}
