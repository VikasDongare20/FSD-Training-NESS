class Test{
	Test()
	{
		System.out.println("Default Constructor");
	}
	Test(int a,int b)
	{
		System.out.println("Parameterized Constructor");
	}
	
	
}
 class Test2{
	int a,b,c,d;
	public Test2(int a, int b, int c, int d)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	  public Test2(Test2 obj){
	        this.a = obj.a;
	        this.b = obj.b;
	        this.c = obj.c;
	        this.d = obj.d;
	        System.out.println("CopyConstructor");
	    }
}


public class ConstructorDemo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		Test t3=new Test(1,2);
		Test2 t2=new Test2(1, 2, 3, 4);
		
		

	}

}
