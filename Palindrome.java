import java.util.*;

class Functions{
    
    public boolean string_palindrome(String str){
        int n = str.length()-1;
        for(int i=0;i<=n;i++){
            if(str.charAt(i)!=str.charAt(n-i)) return false;
        }
        return true;
    }
    
    public boolean stringbuilder_palindrome(String str){
        StringBuilder s = new StringBuilder(str), rs = new StringBuilder(str);
        rs.reverse();
        if(s.compareTo(rs)==0) return true;
        return false;
        
    }
    
    public boolean stringbuffer_palindrome(String str){
        StringBuffer s = new StringBuffer(str), rs = new StringBuffer(str);
        rs.reverse();
        if(s.compareTo(rs)==0) return true;
        return false;
    }
    
    public boolean palindrome(String str){
        char s[] = str.toCharArray();
        int n = s.length-1;
        for(int i=0;i<=n;i++){
            if(s[i] != s[n-i]) return false;
        }
        return true;
    }
}

public class Palindrome
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    Functions fnc = new Functions();
	    
	    String str = input.nextLine();
	    
	    System.out.println(str+" is "+((fnc.string_palindrome(str))?"Palindrome":
	    "Not Palindrome"));
	    
	    System.out.println(str+" is "+((fnc.stringbuilder_palindrome(str))?"Palindrome":
	    "Not Palindrome"));
	    
	    System.out.println(str+" is "+((fnc.stringbuffer_palindrome(str))?"Palindrome":
	    "Not Palindrome"));
	    
	    System.out.println(str+" is "+((fnc.palindrome(str))?"Palindrome":
	    "Not Palindrome"));
	}
}