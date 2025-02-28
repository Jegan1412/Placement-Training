import java.util.*;

class Functions{
    public void get_matrix(int[][] matrix, int r, int c){
        Scanner input = new Scanner(System.in);
        int i,j,count,temp;
        for(i=0;i<r;i++){
	        for(j=0;j<c;j++){
	            matrix[i][j] = input.nextInt();
	            temp = matrix[i][j];
	            count=0;
	            while(temp>0){
	                count++;
	                temp/=10;
	            }
	            if(count<2){
	                System.out.println("Number is less then 10, Please enter Higher Values");
	                matrix[i][j] = input.nextInt();
	            }
	        }
	    }
    }
    
    public int abundant_count(int[][] matrix, int r, int c){
        int i,j,k, abundant_sum=0,count=0;
        boolean abundant = false;
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                abundant = false;
                abundant_sum=0;
                for(k=1;k<=((matrix[i][j])/2);k++){
                    if(matrix[i][j]%k==0){
                        abundant_sum+=k;
                        if(abundant_sum>matrix[i][j]){
                            abundant = true;
                            break;
                        }
                    }
                }
                if(abundant) count++;
            }
        }
        return count;
    }
    
    public void display(int[][] matrix, int r, int c){
        int i,j;
        System.out.println();
        for(i=0;i<r;i++){
	        for(j=0;j<c;j++){
	            System.out.print(matrix[i][j]+" ");
	        }
	        System.out.println();
	    }
        
    }
}

public class Abundant_Count_2D_Matrix
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    Functions fnc = new Functions();
	    
	    System.out.print("Enter Row & Column Size for Matrix(Row, Column: ");
	    int r = input.nextInt(),c = input.nextInt(), matrix[][] = new int[r][c];
	    
	    
	    fnc.get_matrix(matrix,r,c);
	    System.out.println();
	    fnc.display(matrix,r,c);
	    System.out.println();
	    int count=fnc.abundant_count(matrix,r,c);
	    if(count%2==0) System.out.println(count+" Yes");
	    else System.out.println(count+" No");
	}
}