import java.util.*;

public class Matrix_Diagonal_Sum
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

		diagonal_sum(arr, n, 0);
		
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
	
	static int[][] diagonal_sum(int arr[][], int n, int s){
	    
	    int i,j,temp=0;
		if(arr[s][s] == arr[n-1][n-1]) temp = arr[s][s];
	    arr[s][s] = 0;
	    
		for(i=s+1;i<n;i++){
			arr[s][s] += arr[i][s];
		}
		for(j=s+1;j<n-1;j++){
			arr[s][s] += arr[n-1][j];
		}
		arr[n-1][n-1] = 0;
		for(i=n-2;i>=s;i--){
			arr[n-1][n-1] += arr[i][n-1];
		}
		for(j=n-2;j>s;j--){
			arr[n-1][n-1] += arr[s][j];
		}
	    if(arr[s][s] == arr[n-1][n-1]) arr[s][s] = temp;

		if(s<(n/2)) return diagonal_sum(arr, n-1, s+1);

	    return arr;
	}
	
}