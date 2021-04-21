import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of element u want to store");
		int n=s.nextInt();
		int[] arr=new int[10];
		int[] rev=new int[n];
		System.out.print("Enter  array elements");
		System.out.println();
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println();
		System.out.println("Reverse array is");
		
		for(int i=n,j=0;i>0;i--,j++)
		{
			 rev[j] = arr[i-1];
	         System.out.print(rev[j]);
		}
	}

}
