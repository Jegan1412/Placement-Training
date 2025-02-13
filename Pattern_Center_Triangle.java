import java.util.*;

public class Pattern_Center_Triangle
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    int n=input.nextInt(),val;
	    
	    System.out.println("");
	    for(int i=0;i<n;i++){
	        for(int j=n-i;j>0;j--) System.out.print(" ");
	        for(int j=0;j<=i;j++){
	            System.out.print("1 ");
	        }
	        System.out.println("");
	    }
	    
	    System.out.println("");
	    val=1;
	    for(int i=0;i<n;i++){
	        for(int j=n-i;j>0;j--) System.out.print(" ");
	        for(int j=0;j<=i;j++){
	            System.out.print(val+" ");
	        }
	        val++;
	        System.out.println("");
	    }
	    
	    System.out.println("");
	    for(int i=0;i<n;i++){
	        val=1;
	        for(int j=n-i;j>0;j--) System.out.print(" ");
	        for(int j=0;j<=i;j++){
	            System.out.print(val+" ");
	            val++;
	        }
	        System.out.println("");
	    }
	    
	    System.out.println("");
	    val=1;
	    for(int i=0;i<n;i++){
	        for(int j=n-i;j>0;j--) System.out.print(" ");
	        for(int j=0;j<=i;j++){
	            System.out.print(val+" ");
	            val++;
	        }
	        System.out.println("");
	    }
	}
}