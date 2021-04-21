import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of element u want to store");
		int n=s.nextInt();
		int[] arr=new int[10];
		System.out.print("Enter  array elements");
		System.out.println();
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Elements are");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Elements are");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
//		System.out.println("Max Difference pair is");
//		System.out.print(arr[0]+" "+arr[n]+" ");

	}

}
