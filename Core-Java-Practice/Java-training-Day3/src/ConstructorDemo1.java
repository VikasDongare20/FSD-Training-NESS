class Book1{
	public String bName;
	public String author;
	public int price;
	
	public	Book1(String bName,String author, int price)
		{
			this.bName=bName;
			this.author=author;
			this.price=price;
		}
		
		public void print()
		{
			System.out.println("Name:"+bName+" author:"+author+ " price:"+price);		}
}




public class ConstructorDemo1 {

	public static void main(String[] args) {
		
		Book1 b=new Book1("HTML","Author",2000);
		Book1 b2=new Book1("HTML","Author",2000);
		Book1 b3=new Book1("HTML","Author",2000);
		
		b.print();
		b2.print();
		b3.print();

		

	}

}
