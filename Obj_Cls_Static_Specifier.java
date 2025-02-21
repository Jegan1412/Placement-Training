import java.util.*;

class Outer{
    static int n;
    
    static class Pattern{
        static void pattern(int n){
            char symbol='*';
            for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++){
                    if(j%2==0) symbol = '*';
                    else symbol = '#';
                    System.out.print(symbol+" ");
                }
                System.out.println("");
            }
        }
    }
}

public class Obj_Cls_Static_Specifier
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    
	    Outer.n = input.nextInt();
	    Outer.Pattern.pattern(Outer.n);
	}
}