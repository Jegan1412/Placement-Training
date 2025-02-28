import java.util.*;

public class Symmetric_Halves_2D_Matrix
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    
	    System.out.print("Enter Row & Column Size for Matrix(Row, Column: ");
	    int r = input.nextInt(),c = input.nextInt(), matrix[][] = new int[r][c];
	    int i,j,k,l, curr=0,temp=0;
	    
	    for(i=0;i<r;i++){
	        for(j=0;j<c;j++){
	            matrix[i][j] = input.nextInt();
	        }
	    }
	    
	    for(i=0;i<r;i++){
	        for(j=0;j<i;j++){
	            if(i==j) continue;
	            matrix[i][j] = matrix[j][i];
	        }
	    }
	    
	    System.out.println("Changed Matrix: ");
	    
	    for(i=0;i<r;i++){
	        for(j=0;j<c;j++){
	            System.out.print(matrix[i][j]+" ");
	        }
	        System.out.println();
	    }
	}
}