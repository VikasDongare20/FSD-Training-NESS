class Bank{
	int balance=1000;
	synchronized public void withdraw(int amount) {
		System.out.println("Withdraw is processing");
		if (balance<amount) {
			System.out.println("insufficient Balance");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		balance-=amount;
		System.out.println("Withdraw Successfull");
		}
		
	}
	
	synchronized public void deposit(int amount) {
		System.out.println("Deposit Processing...");
		balance+=amount;
		System.out.println("Deposit Completed...");
		notify();
		
		
		
	}
}
class DepositThread extends Thread{
	Bank bank;
	public DepositThread(Bank bank) {
		this.bank=bank;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		bank.deposit(1000);
	}
}

class WithdrawThread extends Thread{
	Bank bank;
	public WithdrawThread(Bank bank) {
		this.bank=bank;
	}
	public void run() {
		// TODO Auto-generated method stub
		bank.withdraw(1500);
	}
}
public class Demo10 {
public static void main(String[] args) {
	Bank bank = new Bank();
	
	WithdrawThread withdrawThread=new WithdrawThread(bank);
	DepositThread depositThread=new DepositThread(bank);
	
	withdrawThread.start();
	depositThread.start();
	
	
	
	
}
}
