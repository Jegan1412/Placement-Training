import java.util.*;

public class Element_Count_With_Duplicate_Removal
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String a = input.nextLine();
		char[] a_arr = a.toCharArray();
	    int n = a_arr.length, count=1;
	    
	    for(int i=0;i<n;i++){
	        
	        if(a_arr[i]!='d'){
	            for(int j=i;j<n;j++){
	                if(i==j) continue;
	                if(a_arr[i] == a_arr[j]){
	                    count++;
	                    a_arr[j] = 'd';
	                }
	            }
	            System.out.println(a_arr[i] + " : " +count);
	        }
	        count=1;
	    }
	    
	}
}