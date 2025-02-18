import java .util.*;

public class Next_Palindrome
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    
	    int n = input.nextInt(), a[] = new int[n], i;
	    
	    for(i=0;i<n;i++){
	        a[i] = input.nextInt();
            System.out.println("Next Palindrome of "+a[i]+" is "+next_Palindrome(a[i]+1));
	    }
	    
	}
	
	static int next_Palindrome(int val){
	    
	    int temp=val, rev=0;
	    while(temp>0){
	        rev = (rev*10) + (temp%10);
	        temp/=10;
	    }
	    if(val == rev) return val;
	    return next_Palindrome(val+1);
	}
}