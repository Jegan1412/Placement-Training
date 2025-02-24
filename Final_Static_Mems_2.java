import java.util.*;

abstract class A{
    
    int a=4,b=5;
    
    final int add(){
        return a+b;
    }
}

class B extends A{
    
    int add(int a){
        this.a = a;
        return a+a;
    }
    
    int add(int a , int b){
        this.a = a;
        this.b = b;
        return (a+b);
    }
    void display(){
        System.out.println("\n"+add()+"\n"+add(2)+"\n"+add(6,9));
    }
}


public class Final_Static_Mems_2
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    B b = new B();
	    b.display();
	}
}
