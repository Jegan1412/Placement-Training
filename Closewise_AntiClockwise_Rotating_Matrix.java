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
    
    public void right_rotate(int[][] arr, int n){
        int[][] r_arr = new int[n][n];
        int i,j,rc;
        for(i=0,rc=n-1;i<n;i++,rc--) for(j=0;j<n;j++) r_arr[j][rc] = arr[i][j];
        System.out.println();
        display(r_arr,n);
    }
    
    public void left_rotate(int[][] arr, int n){
        int[][] l_arr = new int[n][n];
        int i,j,lc;
        for(i=0,lc=n-1;i<n;i++,lc--) for(j=0;j<n;j++) l_arr[i][j] = arr[j][lc];
        System.out.println();
        display(l_arr,n);
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

public class Closewise_AntiClockwise_Rotating_Matrix
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
	    System.out.println("\nClockwise Rotated Matrix:");
	    fnc.right_rotate(arr,n);
	    System.out.println("\nAnti-Clockwise Rotated Matrix:");
	    fnc.left_rotate(arr,n);
	}
}