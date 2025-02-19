import java.util.*;

public class Matrix_Sorting
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
	    
	    int one_dimension[] = new int[r*c], i,j,k,temp;
		
		k=0;
		for(i=0;i<r;i++){
		    for(j=0;j<c;j++){
		        one_dimension[k] = arr[i][j];
		        k++;
		    }
		}
		
		for(i=0;i<(r*c)-1;i++){
		    for(j=0;j<(r*c)-i-1;j++){
		        if(one_dimension[j]>one_dimension[j+1]){
		            temp = one_dimension[j];
		            one_dimension[j] = one_dimension[j+1];
		            one_dimension[j+1] = temp;
		        }
		    }
		}
		
		k=0;
		for(i=0;i<r;i++){
		    for(j=0;j<c;j++){
		        arr[i][j] = one_dimension[k++];
		    }
		}
		return arr;
	}
	
}