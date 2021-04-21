
class Calculator{
	public void Add(int a,int b)
	{
		System.out.println("Addition is "+(a+b));
	}
	public void Sub(int a,int b)
	{
		System.out.println("Substraction is "+(a-b));
	}
	public static void Mul(int a,int b)
	{
		System.out.println("Mul is "+(a*b));
	}
	public static void Div(int a,int b)
	{
		System.out.println("Div is "+(a/b));
	}
	
	
	
}
class Coin{
	static {
		System.out.println("hii");
	}
}


public class StaticDemo {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		Coin cc=new Coin();
		c.Add(20, 10);
		c.Sub(20, 10);
//		c.Mul(20, 10);    This is not proper way we cannot call static variable through object name.
//		c.Div(20, 10);		It can be called through directly class name as shown below.
		Calculator.Mul(20, 10); 
		Calculator.Div(20, 10);
		

	}

}
