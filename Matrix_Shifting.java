import java.util.*;

public class Matrix_Shifting
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
		
		sort_matrix_one_dimension_method(arr, r, c);
		
		display(arr,r,c);
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
	
	static int[][] sort_matrix_one_dimension_method(int arr[][], int r, int c){
	    
	    int size=(2*r)+((c-2)*2);
	    
	    int one_dimension[] = new int[size], i,j,k=0,temp;
		
		for(j=0;j<c;j++){
		    one_dimension[k] = arr[0][j];
		    k++;
		} 
		for(i=1;i<r;i++){
		    one_dimension[k] = arr[i][c-1];
		    k++;
		} 
		for(j=c-2;j>=0;j--){
		    one_dimension[k] = arr[r-1][j];
		    k++;
		} 
		for(i=r-2;i>0;i--){
		    one_dimension[k] = arr[i][0];
		    k++;
		} 
		temp = one_dimension[size-1];
		
		for(i=size-1;i>0;i--){
		    one_dimension[i] = one_dimension[i-1];
		}
		one_dimension[0] = temp;
		
		k=0;
		for(j=0;j<c;j++){
		    arr[0][j] = one_dimension[k];
		    k++;
		} 
		for(i=1;i<r;i++){
		    arr[i][c-1] = one_dimension[k];
		    k++;
		} 
		for(j=c-2;j>=0;j--){
		    arr[r-1][j] = one_dimension[k];
		    k++;
		}
		for(i=r-2;i>0;i--){
		    arr[i][0] = one_dimension[k];
		    k++;
		} 
		
		
		return arr;
	}
	
}