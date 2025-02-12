import java.util.*;

public class Max_of_3_Using_Ternary_Ops
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    int a,b,c;
	    a =  input.nextInt();
	    b =  input.nextInt();
	    c =  input.nextInt();
	    
	    System.out.println("\nShort Circiut Ops:");
	    //Short Circuit Operators
	    int max_short = (a>b && a>c)?a: (b>a && b>c)?b:c;
	    System.out.println("Greatest: "+max_short);
	    
	    System.out.println("\nNon-Short Circiut Ops:");
	    //Non-Short Circuit Operators
	    int max_non_short = (a>b & a>c)?a: (b>a & b>c)?b:c;
	    System.out.println("Greatest: "+max_non_short);
	}
}