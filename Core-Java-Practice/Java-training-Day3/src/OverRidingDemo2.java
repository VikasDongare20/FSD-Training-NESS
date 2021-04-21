class Shape1{
	void show() {
		System.out.println("Parent class method");
	}
	
}
class Circle1 extends Shape1{
	float pi=3.14f, ans;
	void circleArea(float r) {
		ans=pi*r*r;
	}
	void show() {
		System.out.println("Area of the circle is : "+ans);
	}
}
public class OverRidingDemo2 {

	public static void main(String[] args) {
		
		Circle1 c=new Circle1();
		c.circleArea(3);
		c.show();
		
	}

}
