import java.util.*;

public class Find_Missing_Range
{
	public static void main(String[] args) {
	    
	    Scanner input= new Scanner(System.in);
	    int s=input.nextInt(), e=input.nextInt();
	    System.out.println("Enter no.of Elements: ");
	    int n = input.nextInt();
	    int arr[] = new int[n];
	    
	    for(int i=0;i<n;i++){
	        arr[i] = input.nextInt();
	    }
	    
	    Arrays.sort(arr);
	    
	    for(int i=0;i<n;i++){
	        if(arr[i]==s) s++;
	        if(arr[i]>s){
	            System.out.println("["+s+"->"+(arr[i]-1)+"]");
	            s=arr[i]+1;
	        }
	        if(i==n-1){
	            if(arr[i]<e){
	                System.out.println("["+(arr[i]+1)+"->"+e+"]");
	            }
	        }
	    }
	}
}