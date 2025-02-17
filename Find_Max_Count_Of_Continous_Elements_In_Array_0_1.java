import java.util.*;

public class Find_Max_Count_Of_Continous_Elements_In_Array_0_1
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    int n = input.nextInt();
	    int arr[]= new int[n];
	    
	    for(int i=0;i<n;i++){
	        arr[i]=input.nextInt();
	    }
	    
	    int count=0,prev=0;
	    for(int i=0;i<n;i++){
	        if(arr[i]==1){
	            count++;
	        }
	        else if(arr[i]==0){
	            prev=Math.max(count,prev);
	            count=0;
	        }
	    }
	    System.out.print(prev);
		
	}
}