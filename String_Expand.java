import java.util.*;

class Functions {

	public String expand(String str){
	    int n=str.length()-1, i, j, s=-1, times=1;
	    String res="";
	    
	    for(i=0;i<=n;i++){
	        if(Character.isLetter(str.charAt(i))){
	            if(s==-1) s=i;
	            continue;
	        }
	        else if(Character.isDigit(str.charAt(i))){
	            
	            times = (int)(str.charAt(i)-'0');
	            for(j=1;j<=times;j++){
	                res = res + str.substring(s,i);
	            }
	            s=-1;
	        }
	    }
	    if(Character.isLetter(str.charAt(n))){
	        res = res + str.substring(s,n+1);
	    }
	    
	    return res;
	}
}

public class String_Expand
{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Functions fnc = new Functions();

		System.out.println("Enter String: ");
		String str = input.nextLine();

		System.out.println(fnc.expand(str));


	}
}