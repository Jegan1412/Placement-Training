import java .util.*;

public class Pascal_Triangle_N_th_Row
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    
	    int n = input.nextInt();
	    int a[][] = new int[n+1][n+1];
	    int i,j;
	    
	    for(i=0;i<=n;i++){
	        for(j=0;j<=n;j++){
	            if(j!=1)    a[i][j] = 0;
	            else    a[i][1] = 1;
	        }
	    }
	    
	    for(i=1;i<=n;i++){
	        for(j=2;j<=i;j++){
	            a[i][j] = a[i-1][j-1] + a[i-1][j];
	        }
	    }
	    
	    System.out.print("Values in "+n+"th Row : ");
	    for(j=1;j<=n;j++){
	           System.out.print(a[n][j]+" ");
	   }
	}
}