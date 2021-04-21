import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
			
		LinkedList<String> names=new LinkedList<>();
		names.add("Viki");
		names.add("kiran");
		names.add("Priya");
		names.add("Riya");
		names.add("Piya");
		names.add("Pya");
		
		System.out.println(names);
		names.removeFirst();
		names.removeLast();
		System.out.println(names);

		System.out.println(names);


	}

}
