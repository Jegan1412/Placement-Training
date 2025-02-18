import java .util.*;

public class Shifting_Element_In_Array
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    
	    int n = input.nextInt(), a[] = new int[n];
	    int s = input.nextInt();
	    int i,j,temp;
	    
	    for(i=0;i<n;i++){
	        a[i] = input.nextInt();
	    }
	    
	    for(i=n-1;i>=(n-s);i--){
	        temp = a[n-1];
	        for(j=n-1;j>0;j--){
	            a[j] = a[j-1];
	        }
	        a[0] = temp;
	    }
	    
	    for(i=0;i<n;i++)    System.out.print(a[i]+"\t");
	    
	}
}