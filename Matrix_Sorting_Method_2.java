import java.util.*;

public class Matrix_Sorting_Method_2
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Row & Cloumn Size of Matrix : ");
		int r=input.nextInt(), c=input.nextInt(), arr[][] = new int[r][c];
		int i,j,k,l,temp, curr;
		
		for(i=0;i<r;i++){
		    for(j=0;j<c;j++){
		        arr[i][j]=input.nextInt();
		    }
		}
		
		for(i=0;i<r;i++){
		    for(j=0;j<c;j++){
		        curr = arr[i][j];
		        for(k=0;k<r;k++){
		            for(l=0;l<c;l++){
		                if(arr[k][l]==curr) continue;
		                if(curr < arr[k][l]){
		                    temp = arr[i][j];
		                    arr[i][j] = arr[k][l];
		                    arr[k][l] = temp;
		                }
		            }
		        } 
		    }
	    }
		
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
	
}