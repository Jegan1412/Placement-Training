import java.util.*;

public class Shift_Ops
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    int a,b;
	    a =  input.nextInt();
	    b =  input.nextInt();
	    
	    int l_shift=a<<b, r_shift=a>>b;
	    
	    System.out.println("\nLeft Shift: "+l_shift+"\nRigth Shift: "+r_shift);
	    
	}
}