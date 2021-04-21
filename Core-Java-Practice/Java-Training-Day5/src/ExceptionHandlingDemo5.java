
public class ExceptionHandlingDemo5 {
	public static void main(String[] args) {
		try {
			print1();
		} catch (StackOverflowError e) {
			System.out.println("Method Within Method");
		}
		
	}
	public static void print1() {
		print2();
	}
	public static void print2() {
		print1();
	}

}
