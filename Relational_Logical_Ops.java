import java.util.*;

public class Relational_Logical_Ops
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    int a,b,c;
	    a =  input.nextInt();
	    b =  input.nextInt();
	    c =  input.nextInt();
	    
	    
	    //Short Circuit Operators
	    if(a>b && a>c){
	        System.out.println(a+" is Greater");
	    }else if (b>a && b>c){
	        System.out.println(b+" is Greater");
	    }else{
	        System.out.println(c+" is Greater");
	    } 
	    
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