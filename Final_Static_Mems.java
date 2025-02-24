import java.util.*;

abstract class A{
    static final int val;
    
    static{
        val = 14;
    }
    static void display(){
        System.out.println(val);
    }
}


public class Final_Static_Mems
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    
	    A.display();
	}
}
