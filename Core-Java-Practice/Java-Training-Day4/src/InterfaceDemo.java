interface Employee{
	void print();
}

class Company implements Employee{

	@Override
	public void print() {
		System.out.println("This is an employee");
		
	}
	
}


public class InterfaceDemo {

	public static void main(String[] args) {
//		Company c=new Company();
//		c.print();
		Employee Company=new Company();
		Company.print();
		

	}

}
