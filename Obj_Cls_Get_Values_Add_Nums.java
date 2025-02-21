import java.util.*;

public class Obj_Cls_Get_Values_Add_Nums
{
	public static void main(String[] args) {
	    Add a = new Add();
	    a.getVals();
	}
	
}
class Add{
    private int a, b, c;
    
    public void getVals(){
        Scanner input = new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        display();
        System.out.println("Sum: "+(a+b+c));
    }
    public void display(){
        System.out.println("A: "+a+"\nB: "+b+"\nC: "+c);
    }
}

