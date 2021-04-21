class Student{
    public int id;
    public String name;
    public String email;

    public Student(){

    }

    public Student(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public void print() {
    	System.out.println(id+" "+name+" "+email);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Student student = new Student(10, "Mark", "m@gmail.com");

        Student student1 = new Student();
        student1.id = 20;
        student1.name = "Paul";
        student1.email = "p@gmail.com";
        
        student.print();
        student1.print();
    }
}