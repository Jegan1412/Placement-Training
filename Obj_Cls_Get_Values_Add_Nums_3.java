import java.util.*;

public class Obj_Cls_Get_Values_Add_Nums_3
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    Calc a = new Calc(), b = new Calc();
	    a.getVals();
	    a.add();
	    System.out.println("Subract: "+a.sub());
	    a.product(a.a, a.b);
	    System.out.println("Division: "+a.division(a.a,a.b));
	    
	    b.getVals();
	    b.add();
	    System.out.println("Subract: "+b.sub());
	    a.product(b.a, b.b);
	    System.out.println("Division: "+b.division(b.a,b.b));
	}
	
}
class Calc{
    public int a, b;
    public void getVals(){
        Scanner input = new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        display();
        
    }
    public void add(){
        System.out.println("Add: "+(a+b));
    }
    public int sub(){
        return (a-b);
    }
    public void product(int a, int b){
        System.out.println("Product: "+(a*b));
    }
    public float division(int a, int b){
        return (float)(a/b);
    }
    public void display(){
        System.out.println("\nA: "+a+"\tB: "+b+"\n");
    }
}

