//class Department{
//	public String dName;
//	public String courses;
//	public int no;
//	
//	public Department(String dName, String courses, int no)
//	{
//		this.dName=dName;
//		this.courses=courses;
//		this.no=no;
//	}
//	
//	public Department(Department obj,int no)
//	{
//		this.dName=obj.dName;
//		this.courses=obj.courses;
//		this.no=no;
//	}
//	
//}
//public class CopyConstructor {
//
//	public static void main(String[] args) {
//		
//		Department dobj= new Department("IT","ABC", 0);
//		
//	}
//
//}


class Car{
    public String brand;
    public String name;
    public String model;
    public String engineType;
    public int price;

    public Car(String brand, String name, String model, String engineType, int price){
        this.brand = brand;
        this.name= name;
        this.model = model;
        this.engineType = engineType;
        this.price = price;
    }

    public Car(Car carObj, int price){
        this.brand = carObj.brand;
        this.name= carObj.name;
        this.model = carObj.model;
        this.engineType = carObj.engineType;
        this.price = price;
    }
	public void print()
	{
		System.out.println("Name:"+name+" brand:"+brand+ " price:"+price+ " Engine:"+engineType+" model:"+model);		}
}




public class CopyConstructor {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", "A4", "2020", "Petrol", 10000);
        Car car2 = new Car(car1, 20000);
        car1.print();
        car2.print();
    }
}