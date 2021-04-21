interface parent1{
	void p1();
}
interface parent2{
	void p2();
}

class Child implements parent1,parent2{

	@Override
	public void p2() {
		// TODO Auto-generated method stub
		System.out.println("Parent 2");
		
	}

	@Override
	public void p1() {
		// TODO Auto-generated method stub
		System.out.println("Parent 1");
		
	}
	
}
public class MultipleInheritanceDemo5 {
	public static void main(String[] args) {
		Child c=new Child();
		c.p1();
		c.p2();
	}

}
