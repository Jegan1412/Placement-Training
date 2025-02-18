import java .util.*;

public class Number_Of_Unique_Elements_In_String
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    
	    String str = input.nextLine();
	    int n = str.length(), i, j, pos, count=0;
	    char arr[] = str.toCharArray();
	    boolean alpha[] = new boolean[26];
	    for(i=0; i<26; i++) alpha[i] = false;
	    
	    for(j=0; j<n; j++){
	        pos = (int)arr[j] - 97;
	        alpha[pos] = true;
	    }
	    
	    for(i=0;i<26;i++){
	        if(alpha[i]==true) count++;
	    }
	    System.out.println(count);
	}
}