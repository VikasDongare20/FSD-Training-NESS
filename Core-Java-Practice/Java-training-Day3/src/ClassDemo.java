class Book
{
	private String bName;
	private String author;
	private int price;
	
	
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public void print()
	{
	System.out.println("Name:"+bName+" author:"+author+ " price:"+price);
	}
}


public class ClassDemo {
	public static void main(String[] args) {
//		Book b=new Book();
//		b.bName="HTML";
//		b.author="Viki";
//		b.price=2000;
//		
//		Book b1=new Book();
//		b1.bName="Java";
//		b1.author="pinki";
//		b1.price=2000;
		
//		System.out.println(b.bName+ ":Name " +b.author+ ":author "+b.price+ ":price");
//		System.out.println(b1.bName+ ":Name " +b1.author+ ":author "+b1.price+ ":price");
		
		   Book b = new Book();
	        b.setbName("HTML");
	        b.setAuthor("Author");
	        b.setPrice(1000);
	        
	        Book b1 = new Book();
	        b1.setbName("java");
	        b1.setAuthor("Author2");
	        b1.setPrice(10050);

	       
		b.print();
		b1.print();

	}
	

}
