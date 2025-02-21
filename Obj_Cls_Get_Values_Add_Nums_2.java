import java.util.*;

public class Obj_Cls_Get_Values_Add_Nums_2
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    Add a = new Add();
	    a.sum();
	}
	
}
class Add{
    public int a, b, c;
    private void getVals(){
        Scanner input = new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        display();
        
    }
    public void sum(){
        getVals();
        System.out.println("Sum: "+(a+b+c));
    }
    public void display(){
        System.out.println("A: "+a+"\nB: "+b+"\nC: "+c);
    }
}

