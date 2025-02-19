import java.util.*;

public class Matrix_Transpose
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Row & Cloumn Size of Matrix : ");
		int r=input.nextInt(), c=input.nextInt(), arr[][] = new int[r][c], i,j;
		
		
	    for(i=0;i<r;i++){
		    for(j=0;j<c;j++){
		        arr[i][j]=input.nextInt();
		    }
		}
		
		int t_arr[][] = transpose(arr,r,c);
		display(t_arr, c, r);
		
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
	
	static int[][] transpose(int arr[][],int r, int c){
	    
	    int t_arr[][] = new int[c][r], i, j;
	    for(i=0;i<c;i++){
	        for(j=0;j<r;j++){
	            t_arr[i][j] = arr[j][i];
	        }
	    }
	    
	    return t_arr;
	}
	
}