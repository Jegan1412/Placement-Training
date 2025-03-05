import java.util.*;

class Functions{
    
    public int palin_transform(String str){
        int count=0, n=str.length()-1;
        StringBuffer s = new StringBuffer(str);
        s = s.reverse();
        if(str.equals(s.toString())) return count;
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i)){
                s.setCharAt(i,s.charAt(n-i));
                count++;
            } 
        }
        System.out.println("Palindrome String (Converted): "+s);
        return count;
    }
}

public class Palindrome_Conversion_Count
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    Functions fnc = new Functions();
	    
	    System.out.print("Enter String: ");
	    String str = input.nextLine();
	    
	    System.out.println("Minimun Conversions Required: "+fnc.palin_transform(str));
	}
}