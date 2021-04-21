class Company{
	int item;
	boolean flag=false;                                 // flag - false it is producer turn
														// flag - true it is consumer turn
	synchronized public void produce(int item) throws InterruptedException {
		if(flag) {
			wait();
		}
		this.item=item;
		System.out.println("Produced"+this.item);
		flag=true;
		notify();
	}
	synchronized public int consume() throws InterruptedException {
		if(flag) {
			wait();
		}
	
		System.out.println("Consumed"+this.item);
		flag=false;
		notify();
		return this.item;
	}
}

class Producer extends Thread{
	Company company;
	public Producer(Company company) {
		this.company=company;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i;
		while(true) {
			try {
				this.company.produce(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Consumer extends Thread{
    Company company;

    Consumer(Company company){
        this.company = company;
    }

    @Override
    public void run() {
        while(true){
            try {
                this.company.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
public class Demo11 {
	public static void main(String[] args) {
		  Company company = new Company();
	        Producer producer = new Producer(company);
	        Consumer consumer = new Consumer(company);

	        producer.start();
	        consumer.start();
	}

}
