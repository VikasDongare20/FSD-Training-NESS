
public class ExceptionHandlingDemo1 {
			public static void main(String[] args) {
				doSomething();
			}
			
			public static void doSomething() {
				try {
					doSomethingElse();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
			public static void doSomethingElse() throws Exception {
				doSomethingSomethingElse();
			}
			public static void doSomethingSomethingElse() throws Exception {
				throw new Exception();
			}

}
