abstract class AbstractDemo{
	public void AddNumber(int a,int b) {
		System.out.println("Addition is: "+(a+b));
	}
	public void SubNumbers(int a,int b)
	{
		System.out.println("Substraction is: "+(a-b));
	}
	public abstract void Divnumbers(int a,int b);
	public abstract void Mulnumbers(int a,int b);

	
}
class ChildDemo extends AbstractDemo{

	@Override
	public void Divnumbers(int a, int b) {
		System.out.println("Div is: "+(a/b));
	}

	@Override
	public void Mulnumbers(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Mul is: "+(a*b));
		
	}
	
}
public class AbstrtactClassDemo {

	public static void main(String[] args) {
		ChildDemo c=new ChildDemo();
		c.AddNumber(10, 20);
		c.SubNumbers(20, 10);
		c.Mulnumbers(20, 10);
		c.Divnumbers(20, 10);
		

	}

}
