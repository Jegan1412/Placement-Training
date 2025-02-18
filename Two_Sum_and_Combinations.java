import java.util.*;

public class Two_Sum_and_Combinations
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    
	    int n = input.nextInt(), arr[] = new int[n], i, j;
	    
	    for(i=0;i<n;i++) arr[i] = input.nextInt();
	    int target = input.nextInt(), count=0;
	    
	    for(i=0;i<n-1;i++){
	        for(j=i+1;j<n;j++){
	            if(arr[i]+arr[j] == target){
	                System.out.println("["+i+","+j+"]");
	                count++;
	            } 
	        }
	    }
	    System.out.println(count);
	    
	}
}