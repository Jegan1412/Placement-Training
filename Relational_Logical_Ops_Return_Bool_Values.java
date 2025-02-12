import java.util.*;

public class Relational_Logical_Ops_Return_Bool_Values
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    int a,b,c;
	    a =  input.nextInt();
	    b =  input.nextInt();
	    c =  input.nextInt();
	    
	    System.out.println("\nShort Circiut Ops:\n");
	    //Short Circuit Operators
	    System.out.println(a>b && a>c);
	    System.out.println(b>a && b>c);
	    System.out.println(c>b && c>a);

	    System.out.println("\nNon-Short Circiut Ops:\n");
	    //Non-Short Circuit Operators
	    System.out.println(a>b & a>c);
	    System.out.println(b>a & b>c);
	    System.out.println(c>b & c>a);
	}
}
