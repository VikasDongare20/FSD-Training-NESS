class App{
	int a=10;
	static int b=20;
	
	public void doSomething() {
		int c=30;
		System.out.println(c);
		
	}
	
	
	
}



public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//				System.out.println("Hello");
//				
//				int a=10;
//				int b=20;
////				System.out.println(a++);
////				System.out.println(++a);
////				System.out.println(a);
//				System.out.println(a+b);
		App t=new App();
		System.out.println(t.a);
		System.out.println(App.b);
		t.doSomething();
	}


}
