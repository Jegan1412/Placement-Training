import java.util.*;

public class Getting_And_Printing_Matrix
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