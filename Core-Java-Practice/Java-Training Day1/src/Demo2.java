import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		if(true)
//		{
//			System.out.println("true");
//		}
		
		
//		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int a=s.nextInt();
		int b=s.nextInt();
		
		System.out.println("1:add");
		System.out.println("2:div");
		System.out.println("3:mul");
		System.out.println("4:sub");
		
		
		
		int c=s.nextInt();
		int d;
		
//		if(n%2==0)
//		{
//			System.out.println(n+ "  is even number");
//		}
//		else
//		{
		
//			System.out.println(n+ "  is not even");
//		}
		
		switch(c){
		case 1:	d=a+b;
				System.out.println(d+ " is the addition of " +a+ " and " +b );
				break;
		case 2:	d=a/b;
				System.out.println(d+ " is the division of " +a+ " and " +b );
				break;
		case 3:	d=a*b;
				System.out.println(d+ " is the multiplication of " +a+ " and " +b );
				break;
		case 4:	d=a-b;
				System.out.println(d+ " is the substraction of " +a+ " and " +b );
				break;
		default: 
				System.out.println("U enterd wrong choice");
			
		}


	}

}

