import java.util.*;

public class Sorting_0_To_End
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    int n = input.nextInt();
	    int arr[]= new int[n];
	    
	    for(int i=0;i<n;i++){
	        arr[i]=input.nextInt();
	    }
	    
	    for(int i=0;i<n;i++){
	        if(arr[i]==0){
	            int temp;
	            for(int j=i;j<n-1;j++){
	                temp= arr[j];
	                arr[j] = arr[j+1];
	                arr[j+1] = temp;
	            }
	        }
	        
	    }
	    
	    for(int i=0;i<n;i++){
	        System.out.print(arr[i]+" ");
	    }
		
	}
}