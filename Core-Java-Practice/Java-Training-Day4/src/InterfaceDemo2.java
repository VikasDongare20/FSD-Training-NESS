interface BankAccounts{
	boolean deposit(double amount);
	boolean withdraw(double amount);
	void getBalance();
}
class currentAccount implements BankAccounts{
	private double _balance;

	
	public boolean deposit(double amount) {
		
	    _balance += amount;
        System.out.println("Deposit amount: "+ amount);
        return true;
	}

	
	public boolean withdraw(double amount) {
		
		 if(_balance < amount){
	            System.out.println("Insufficient funds");
	            return false;
	        }else{
	            _balance -= amount;
	            System.out.println("Successfully withdraw: "+ amount);
	            return true;
	        }
	}

	
	public void getBalance() {
		
		  System.out.println("Current account balance: "+ _balance);
	}
	
}
class savingAccount implements BankAccounts{
	public double _balance;
	public double _perDayLimit;
	public boolean deposit(double amount) {
		_balance+=amount;
		System.out.println("Deposited Succesfully "+amount);
		return true;
	}

	
	public boolean withdraw(double amount) {
		if(_balance < amount)
		{
			System.out.println("Insufficient Balance");
			return false;
		}
		else if(_perDayLimit+amount>5000)
		{
			System.out.println("Withdraw attempt failed");
			return false;
		}
		else
		{
			_balance-=amount;
			_perDayLimit+=amount;
			System.out.println("Successfully Withdraw "+amount);
			return true;
		}
		
	}

	
	public void getBalance() {
        System.out.println("Saving account balance: "+ _balance);

	}
	
}
public class InterfaceDemo2 {

	public static void main(String[] args) {
		BankAccounts currentAccount=new currentAccount();
		BankAccounts savingAccount=new savingAccount();
		
		
		
		   savingAccount.deposit(2000);
	        savingAccount.withdraw(1000);
	        savingAccount.getBalance();

	        System.out.println("------------------------------------------");

	        currentAccount.deposit(4000);
	        currentAccount.withdraw(4000);
	        currentAccount.withdraw(2000);
	        currentAccount.getBalance();
		

	}

}
