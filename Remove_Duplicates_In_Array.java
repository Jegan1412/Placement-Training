import java.util.*;

public class Remove_Duplicates_In_Array
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String a = input.nextLine();
		char[] a_arr = a.toCharArray();
	    int n = a_arr.length;
	    
	    for(int i=0;i<n;i++){
	        if(a_arr[i]!='d'){
	            for(int j=i;j<n;j++){
	                if(i==j) continue;
	                if(a_arr[i] == a_arr[j])    a_arr[j] = 'd';
	            }
	            System.out.print(a_arr[i]+"\t");
	        }
	    }
	    
	}
}