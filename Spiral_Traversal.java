import java.util.*;

class Functions{
    
    public int[][] get_inputs(int n){
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = input.nextInt();
            }
        }
        return arr;
    }
    
    public void spiral_display(int[][] arr,int n){
        int rs=0,cs=0,re=n-1,ce=n-1;
        System.out.println();
        while(rs<=re || cs<=ce){
            if(rs<=re){
                for(int i=cs;i<=ce;i++) System.out.print(arr[rs][i]+" ");
                rs++;
            }
            if(cs<=ce){
                for(int j=rs;j<=re;j++) System.out.print(arr[j][ce]+" ");
                ce--;
            }
            if(rs<=re){
                for(int i=ce;i>=cs;i--) System.out.print(arr[re][i]+" ");
                re--;
            }
            if(cs<=ce){
                for(int j=re;j>=rs;j--) System.out.print(arr[j][cs]+" ");
                cs++;
            }
        }
        System.out.println();
    }
    
    public void display(int[][] arr,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

public class Spiral_Traversal
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    Functions fnc = new Functions();
	    
	    System.out.println("Enter Matix Size(N*N):");
	    int n = input.nextInt();
	    System.out.println("Enter Matix "+(n*n)+" Elements:");
	    int[][] arr = fnc.get_inputs(n);
	    System.out.println();
	    fnc.display(arr,n);
	    System.out.println("\nSpiral Traversal:");
	    fnc.spiral_display(arr,n);
	}
}