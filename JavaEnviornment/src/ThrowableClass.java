import java.io.IOException;


public class ThrowableClass {

	public static void main(String[] args) {
		
		
	//	System.out.println(System.getProperty("user.dir"));
	


		try {
	        throw new NullPointerException();
	    }
	    catch (NullPointerException e) {
	        System.out.println(e);
	    }
System.out.println("--------------------------------------");
		try {
	        throw new IOException();
	    }
	    catch (IOException e) {
	        e.printStackTrace(); 
	    }

	}

}
