import java .util.*;

public class Generate_Pascal_Triangle
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
	    
	    for(i=1;i<=n;i++){
	        for(int k=n-i;k>=0;k--) System.out.print(" ");
	        for(j=1;j<=i;j++){
	            System.out.print(a[i][j]+" ");
	        }
	        System.out.println("");
	    }
	}
}