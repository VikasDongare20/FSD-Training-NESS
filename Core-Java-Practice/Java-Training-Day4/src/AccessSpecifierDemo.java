class Demo{
	public void publicD() {
		System.out.println("Public");
	}
	private void privateD(){
		System.out.println("private");
	}
	protected void protectedD() {
		System.out.println("Protected");
	}
}
public class AccessSpecifierDemo {
	public static void main(String[] args) {
		
		Demo d=new Demo();
		
		d.publicD();
		d.protectedD();
	}
	

}
