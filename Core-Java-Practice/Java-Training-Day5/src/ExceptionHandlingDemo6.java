import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingDemo6 {
	public static void main(String[] args) {
		BufferedReader br=null;
		
		
		try {
			br=new BufferedReader(new FileReader("src/data.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 finally {
	            if(br!=null){
	                try {
	                    br.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	}

}
	}
}
