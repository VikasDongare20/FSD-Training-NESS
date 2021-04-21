class Student{
	private int id;
	private String name;
	private int pass=40;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) throws Exception {
		if(id<1)
		{
			throw new Exception("Id is not valid");
		}
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) throws Exception {
		if(name.isEmpty())
		{
			throw new Exception("Name can not be empty");
		}
		this.name = name;
	}
	public int getPass() {
		return pass;
	}

	
	
	
}
public class EncapsulationDemo {
	public static void main(String[] args) throws Exception {
		Student s1=new Student();
		s1.setId(1);
		s1.setName("Viki");
		
		System.out.println("Id: "+s1.getId()+" Name: "+s1.getName()+" Pass: "+s1.getPass());
	}

}
