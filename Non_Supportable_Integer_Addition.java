import java.util.*;

public class Non_Supportable_Integer_Addition
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    String a = input.nextLine(), b = input.nextLine();
	    char[] a_char = a.toCharArray(), b_char = b.toCharArray();
	    int na = a_char.length-1, nb = b_char.length-1, carry=0;
	    String sum="";
	    
	    while(na>=0 || nb>=0 || carry>0){
	        if(na>=0){
	            carry+= (int)(a_char[na] - '0');
	            na--;
	        }
	        if(nb>=0){
	            carry+= (int)(b_char[nb] - '0');
	            nb--;
	        }
	        sum += (char)(carry%10 + '0');
	        carry/=10;
	       
	    }
	    char[] sum_char = sum.toCharArray();
	    for(int i=sum_char.length-1;i>=0;i--){
	        System.out.print(sum_char[i]);
	    }
	    
	}
}