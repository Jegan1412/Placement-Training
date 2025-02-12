import java.util.*;

public class Bitwise_Ops
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    int a,b;
	    a =  input.nextInt();
	    b =  input.nextInt();
	    
	    int and=a&b, or=a|b, exor=a^b;
	    
	    System.out.println("\nAND: "+and+"\nOR: "+or+"\nEXOR: "+exor);
	    
	}
}