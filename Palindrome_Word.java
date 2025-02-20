import java.util.*;

public class Palindrome_Word
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(), i;
		input.nextLine();
		String str[] = new String[n];
		
		for(i=0;i<n;i++){
		    str[i] = input.nextLine();
		}
		
		for(i=0;i<n;i++){
		    System.out.println("Palindrome Status of \""+str[i]+"\" : "+check_palindrome(str[i]));
		}
	}
	
	static String check_palindrome(String str){
	    
	    char arr[] = str.toCharArray();
	    int n = arr.length;
	    boolean palindrome = true;
	    for(int i=0;i<n;i++){
	        if(arr[i] != arr[n-1-i]){
	            palindrome = false;
	            break;
	        }
	    }
	    return (palindrome)?"Yes":"No";
	}
}