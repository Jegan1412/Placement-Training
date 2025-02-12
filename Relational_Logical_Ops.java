import java.util.*;

public class Relational_Logical_Ops
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    int a,b,c;
	    a =  input.nextInt();
	    b =  input.nextInt();
	    c =  input.nextInt();
	    
	    System.out.println("\nShort Circiut Ops:\n");
	    //Short Circuit Operators
	    if(a>b && a>c){
	        System.out.println(a+" is Greater");
	    }else if (b>a && b>c){
	        System.out.println(b+" is Greater");
	    }else{
	        System.out.println(c+" is Greater");
	    } 

	    System.out.println("\nNon-Short Circiut Ops:\n");
	    //Non-Short Circuit Operators
	    if(a>b & a>c){
	        System.out.println(a+" is Greater");
	    }else if (b>a & b>c){
	        System.out.println(b+" is Greater");
	    }else{
	        System.out.println(c+" is Greater");
	    } 
	}
}
