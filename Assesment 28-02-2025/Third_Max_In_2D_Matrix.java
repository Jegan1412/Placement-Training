import java.util.*;

public class Third_Max_In_2D_Matrix
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    
	    System.out.print("Enter Row & Column Size for Matrix(Row, Column: ");
	    int r = input.nextInt(),c = input.nextInt(), matrix[][] = new int[r][c];
	    int i,j;
	    
	    for(i=0;i<r;i++){
	        for(j=0;j<c;j++){
	            matrix[i][j] = input.nextInt();
	        }
	    }
	    int f_max = matrix[0][0], s_max=f_max, t_max=s_max;
	    for(i=0;i<r;i++){
	        for(j=0;j<c;j++){
	            if(matrix[i][j]>f_max){
	                t_max=s_max;
	                s_max=f_max;
	                f_max=matrix[i][j];
	            }
	        }
	    }
	    System.out.println("Third Maximun Number In the Matrix is: "+t_max);
	}
}