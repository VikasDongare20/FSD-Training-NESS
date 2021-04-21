class Employee2{
    public String firstName;
    public String lastName;

    public void getFullName(){
        System.out.println(firstName + " " + lastName);
    }
}

class FullTimeEmployee2 extends Employee2{
   
    public void getFullName() {
        System.out.println(firstName + " " + lastName + " - FullTime");
    }
}

class PartTimeEmployee2 extends Employee2{
   
    public void getFullName() {
        System.out.println(firstName + " " + lastName+ " - PartTime");
    }
}



public class MethodOverridingDemo {
    public static void main(String[] args) {
        FullTimeEmployee2 fte = new FullTimeEmployee2();
        PartTimeEmployee2 pte = new PartTimeEmployee2();

        fte.firstName = "Mark";
        fte.lastName = "Smith";

        pte.firstName = "Paul";
        pte.lastName = "Watson";

        fte.getFullName();
        pte.getFullName();
    }
}