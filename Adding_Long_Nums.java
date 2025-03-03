import java.util.*;

class Functions{
    
    public String add_long_nums(String a, String b){
        int n_a=a.length()-1, n_b=b.length()-1, carry=0;
        int i=0,j=0;
        String res="";
        
        while(n_a>=0 || n_b>=0 || carry==1){
            if(n_a>=0){
                carry += (int)((a.charAt(n_a))-'0');
                n_a--;
            }
            if(n_b>=0){
                carry += (int)((b.charAt(n_b))-'0');
                n_b--;
            }
            res=res+(char)((carry%10)+'0');
            carry/=10;
        }
        StringBuilder r = new StringBuilder();
        r.append(res);
        r.reverse();
        return r.toString();
    }
}

public class Adding_Long_Nums
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    Functions fnc = new Functions();
	    
	    String a=input.nextLine(), b=input.nextLine();
		
		System.out.println(fnc.add_long_nums(a,b));
		
	}
}