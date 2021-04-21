import java.util.Arrays;
import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[] {10,12,20,30,25,40,32,31,35,50,60};
		int[] subarr = Arrays.copyOfRange(arr,3,8);
		System.out.println("Array elements are ");
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("subarr is");
		for(int i=0;i<subarr.length;i++)
		{
		System.out.print(subarr[i]+" ");
		}
	}

}
