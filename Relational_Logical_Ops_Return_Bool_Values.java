import java.util.*;

public class Relational_Logical_Ops_Return_Bool_Values
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    int a,b,c;
	    a =  input.nextInt();
	    b =  input.nextInt();
	    c =  input.nextInt();
	    
	    
	    //Short Circuit Operators
	    System.out.println(a>b && a>c);
	    System.out.println(b>a && b>c);
	    System.out.println(c>b && c>a);
	    
	    //Non-Short Circuit Operators
	    System.out.println(a>b & a>c);
	    System.out.println(b>a & b>c);
	    System.out.println(c>b & c>a);
	}
}