import java.util.*;

public class Matrix_Diagonal_Reverse
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Row & Cloumn Size of Matrix : ");
		int n=input.nextInt(), arr[][] = new int[n][n], i,j;
		
		
	    for(i=0;i<n;i++){
		    for(j=0;j<n;j++){
		        arr[i][j]=input.nextInt();
		    }
		}
		
		diagonal_reverse(arr,n);
		
		
		display(arr,n,n);
	}
	
	static void display(int arr[][], int r,int c){
	    int i,j;
	    System.out.println("");
		for(i=0;i<r;i++,System.out.println("")){
		    System.out.print("| ");
		    for(j=0;j<c;j++){
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.print(" |");
		}
	}
	
	static int[][] diagonal_reverse(int arr[][],int n){
	    
	    int diagonal[] = new int[n],i;
	    for(i=0;i<n;i++){
	        diagonal[i] = arr[i][i];
	    }
	    for(i=0;i<n;i++){
	        arr[i][i] = diagonal[n-1-i];
	    }
	    
	    return arr;
	}
	
}