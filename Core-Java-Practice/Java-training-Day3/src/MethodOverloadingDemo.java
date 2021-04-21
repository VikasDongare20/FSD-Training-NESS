class Area{
	public void area(int h,int b) {
		float res;
		res=(b*h);
		System.out.println("Area of Triangle is "+res);
	}
	public void area(int s) {
		System.out.println("Area of Square is "+s*s);
	}
	public void area(int a,int b,int c) {
		System.out.println("Area of Rectangle is "+a*b*c);
	}
}
public class MethodOverloadingDemo {

	public static void main(String[] args) {
		Area a=new Area();
		a.area(3, 3);
		a.area(5);
		a.area(2, 3,5);
		
	}

}
