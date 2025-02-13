import java.util.*;

public class Pattern
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    int n=input.nextInt(),val;
	    
	    System.out.println("");
	    for(int i=0;i<n;i++){
	        for(int j=n-i;j>0;j--) System.out.print(" ");
	        for(int j=0;j<=i;j++) System.out.print("* ");
	        System.out.println("");
	    }
	    
	    System.out.println("");
	    for(int i=1;i<=n*2;i++){
	        if(i%2!=0){
	            for(int j=(n*2)-i;j>0;j--) System.out.print(" ");
	            for(int j=0;j<i;j+=1) System.out.print("* ");
	            System.out.println("");
	        }
	    }
	    
	    System.out.println("");
	    for(int i=1;i<=(n*2);i++){
	        if(i%2!=0){
	            for(int j=(n*2)-i;j>0;j--) System.out.print(" ");
	            for(int j=0;j<i;j+=1){
	                if(j==0 || j==i-1 || i==(n*2)-1) System.out.print("* ");
	                else System.out.print("0 ");
	            }
	            System.out.println("");
	        }
	    }
	    
	    System.out.println("");
	    for(int i=1;i<=(n*2);i++){
	        if(i%2!=0){
	            val=1;
	            for(int j=(n*2)-i;j>0;j--) System.out.print(" ");
	            for(int j=0;j<i;j+=1){
	                if(j<(i/2)+1) System.out.print((val++)+" ");
	                else System.out.print(--val-1+" ");
	            }
	            System.out.println("");
	        }
	    }
	    
	}
}