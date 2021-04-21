//import Test.Company;

class Test2{
	interface Company{
		void Employee();
	}
}

class Test1 implements Test2.Company{

	@Override
	public void Employee() {
		// TODO Auto-generated method stub
		System.out.println("SubInterface");
		
	}
	
}
public class InterfaceDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 c=new  Test1();
		
c.Employee();
	}

}
