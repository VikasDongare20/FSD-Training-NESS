
public class Demo1 {

	public static void main(String[] args) {
		String str=new String();
		String name="Viki";
		name=name.concat(" Dongare");
		System.out.println(name);
		
		int arr[]=new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		System.out.println(arr[0]);
		
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.print(arr[i]);
//		}
		for(int i:arr)
		{
			System.out.print(i);
		}
		System.out.println();
		int arr2[]= {2,3,4,5,6,7};
		int min =arr2[0] ,max=0;
		
		for(int i=0;i<arr2.length;i++)
		{
			
				if(arr2[i]<min)
				{
					min=arr2[i];
				}
				if(max<arr2[i])
				{
					max=arr2[i];
				}
			
		}
		System.out.println(min+ " is the smallest element");

		System.out.println(max+ " is the largest element");

		
	

	}

}
