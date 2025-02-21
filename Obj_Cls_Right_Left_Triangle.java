import java.util.*;

class Left_Angle_Triangle{
    public int i,j;
    
    public void display(int n){
        for(i=0;i<n;i++,System.out.println("")){
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
        }
    }
}
class Right_Angle_Triangle{
    public int i,j;
    
    public void display(int n){
        for(i=0;i<n;i++,System.out.println("")){
            for(j=0;j<n-1-i;j++) System.out.print(" ");
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
        }
    }
}

public class Obj_Cls_Right_Left_Triangle
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    Left_Angle_Triangle lt = new Left_Angle_Triangle();
	    Right_Angle_Triangle rt = new Right_Angle_Triangle();
	    int n = input.nextInt();
	    lt.display(n);
	    rt.display(n);
	    
	}
	
}