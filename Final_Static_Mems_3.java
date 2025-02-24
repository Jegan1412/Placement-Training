import java.util.*;

class A{
    static int a=5,b=6;
    final class B{
        static int add(){
            return a+b;
        }
        static void display(){
            System.out.println(add());
        }
    }
}



public class Final_Static_Mems_3
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    A.B.display();
	}
}
