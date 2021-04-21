interface T1{
	void test1();
}
interface T2 extends T1{
	void test2();
}
interface T3 extends  T2{
	void test3();
}

class Test implements T3{

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("Test 2");
		
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("Test 1");
		
	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		System.out.println("Test 3");
	}
	
}
public class InterfaceDemo4 {
	public static void main(String[] args) {
		Test t=new Test();
		t.test1();
		t.test2();
		t.test3();
		
	}

}
