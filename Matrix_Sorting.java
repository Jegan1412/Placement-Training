import java.util.*;

public class Matrix_Sorting
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Row & Cloumn Size of Matrix : ");
		int r=input.nextInt(), c=input.nextInt(), arr[][] = new int[r][c];
		int i,j,k,l,temp;
		int d1[] = new int[r*c];
		
		for(i=0;i<r;i++){
		    for(j=0;j<c;j++){
		        arr[i][j]=input.nextInt();
		    }
		}
		
		k=0;
		for(i=0;i<r;i++){
		    for(j=0;j<c;j++){
		        d1[k] = arr[i][j];
		        k++;
		    }
		}
		
		for(i=0;i<(r*c)-1;i++){
		    for(j=0;j<(r*c)-i-1;j++){
		        if(d1[j]>d1[j+1]){
		            temp = d1[j];
		            d1[j] = d1[j+1];
		            d1[j+1] = temp;
		        }
		    }
		}
		
		k=0;
		for(i=0;i<r;i++){
		    for(j=0;j<c;j++){
		        arr[i][j] = d1[k++];
		    }
		}
		
		/*int curr;
		for(i=0;i<r;i++){
		    for(j=0;j<c;j++){
		        curr = arr[i][j];
		        for(k=0;k<r;k++){
		            for(l=0;l<c;l++){
		                if(arr[k][l]==curr) continue;
		                if(arr[i][j] > arr[k][l]){
		                    temp = arr[i][j];
		                    arr[i][j] = arr[k][l];
		                    arr[k][l] = temp;
		                }
		            }
		        }
		            
		    }
	    }*/
		
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