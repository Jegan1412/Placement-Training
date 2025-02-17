import java.util.*;

public class Array
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    int n = input.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++){
		    arr[i] = input.nextInt();
		}
		
		//-------------------------------------//
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+"\t"); // 1 2 3 4 5 
		}
		System.out.println("\n");
		for(int i=n-1;i>=0;i--){
		    System.out.print(arr[i]+"\t"); // 5 4 3 2 1
		}
		System.out.println("\n");
		for(int i:arr){
		    System.out.print(i+"\t"); // 1 2 3 4 5
		}
		System.out.println("\n");
		
		//-------------------------------------//
		
		for(int i:arr){
		    i++;
		    System.out.print(i+"\t"); // 2 3 4 5 6
		}
		System.out.println("\n");
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+"\t"); // 1 2 3 4 5
		}
		System.out.println("\n");
		
		//-----------------------------------------//
		
		for(int i=0;i<n;i++){
		    arr[i]++;
		    System.out.print(arr[i]+"\t"); // 2 3 4 5 6
		}
		System.out.println("\n");
		for(int i=0;i<n;i++){
		     System.out.print(arr[i]+"\t"); // 2 3 4 5 6
		}
		System.out.println("\n");
	}
}