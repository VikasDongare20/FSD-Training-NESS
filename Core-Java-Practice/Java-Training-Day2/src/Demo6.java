import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		  int n,temp;
	      Scanner s = new Scanner(System.in);
	        System.out.print("Enter no of elements");
	        n=s.nextInt();
	        int arr[]=new int[n];
	        System.out.println("Enter elements");
	        for(int i=0;i<n;i++) 
	        {
	            arr[i]=s.nextInt();
	        }
	        for(int i=0;i<n;i++) 
	        {
	            for(int j=i+1;j<n;j++) 
	            {
	                if (arr[i]>arr[j]) 
	                {
	                    temp=arr[i];
	                    arr[i]=arr[j];
	                    arr[j]=temp;
	                }
	            }
	        }
	        System.out.println("Max difference pair");
	        System.out.print(arr[0]+" "+arr[n-1]+" ");
	    }


	}


