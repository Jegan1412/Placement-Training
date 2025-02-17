import java.util.*;

public class Max_Of_Array
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    int n = input.nextInt();
		int arr[] = new int[n];
		int fm=0,sm=0,tm=0;
		int fi=0,si=0,ti=0;
		int max=0,prev1=0,prev2=0;
		
		for(int i=0;i<n;i++)    arr[i] = input.nextInt();
		
		//Method 1
		for(int i=0;i<n;i++){
		    if(arr[i]>fm){
		        fi = i;
		        fm = arr[i];
		    }
		}
		for(int i=0;i<n;i++){
		    if(arr[i]>sm && i!=fi){
		        si = i;
		        sm = arr[i];
		    }
		}
		for(int i=0;i<n;i++){
		    if(arr[i]>tm && i!=fi && i!=si){
		        ti = i;
		        tm = arr[i];
		    }
		}
		System.out.println(fm+"\t"+sm+"\t"+tm);
		
		//Method 2
		Arrays.sort(arr);
		System.out.println(arr[n-1]+"\t"+arr[n-2]+"\t"+arr[n-3]);
		
		
		//Method 3
		for(int i=0;i<n;i++){
		    if(arr[i]>max){
		        prev2 = prev1;
		        prev1 = max;
		        max = arr[i];
		    }
		}
		System.out.println(max+"\t"+prev1+"\t"+prev2);
		
	}
}