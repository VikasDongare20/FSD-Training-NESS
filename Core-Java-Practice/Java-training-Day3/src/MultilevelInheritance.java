class A{
	public void a(){
		System.out.println("Parent class");
	}
}
class B extends A{
	public void b() {
		System.out.println("Child class1");
	}
}
class C extends A{
	public void c() {
		System.out.println("Child class2");
		
	}
}
public class MultilevelInheritance {
	public static void main(String[] args) {
		C c=new C();
		B b=new B();
		b.b();
		b.a();
		c.c();
		c.a();
		
	}

}
