class Employee{
	public int empID;
	public String firstName;
	public String lastName;
	public String email;
	
	
	
	public void getEmployee()
	{
		System.out.println(firstName+" "+lastName);
	}
}
class FullTimeEmploee extends Employee
{
	public int salary;
}
class PartTimeEmployee extends Employee
{
	public int salary;
}


public class InheritanceDemo {

	public static void main(String[] args) 
	{
		FullTimeEmploee fte=new FullTimeEmploee();
		fte.firstName="Viki";
		fte.lastName="Dongare";
		PartTimeEmployee pte=new PartTimeEmployee();
		pte.firstName="Raj";
		pte.lastName="kundra";
		
		fte.getEmployee();
		pte.getEmployee();
	}

}
