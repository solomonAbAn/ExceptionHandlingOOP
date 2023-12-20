import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int i;

        System.out.println("give me an int: ");
        Scanner kb = new Scanner(System.in);
		
        while (true) {
	        try {
	          i = kb.nextInt(); 
	          method();
	        } catch (Exception e) {
	           System.out.println("");
	        	}
	        }
       
	}
	private static void method() {
	   
	}
}
