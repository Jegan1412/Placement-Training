import java.util.*;

class Functions {

	public String expand(String str){
	    int n=str.length()-1, i, j, s=-1, times=1;
	    String res="";
	    
	    for(i=0;i<=n;i++){
	        if(Character.isLetter(str.charAt(i))){
	            if(s==-1){
	                s=i;
	            } 
	            continue;
	        }
	        else if(Character.isDigit(str.charAt(i))){
	            
	            times = find_times(str.substring(i));
	            int count = times_count(times);
	            for(j=1;j<=times;j++){
	                res = res + str.substring(s,i);
	            }
	            i = i+count-1;
	            s=-1;
	        }
	    }
	    if(Character.isLetter(str.charAt(n))){
	        res = res + str.substring(s,n+1);
	    }
	    
	    return res;
	}
	
	public int find_times(String t){
	    int i=0,times=0;
	    while(Character.isDigit(t.charAt(i))){
	        times = (times*10) + (int)(t.charAt(i)-'0');
	        if(i<t.length()-1) i++;
	        else break;
	    }
	    return times;
	}
	
	public int times_count(int times){
	    int count=0;
	    while(times>0){
	        count++;
	        times/=10;
	    }
	    return count;
	}
}

public class String_Expand_Refined
{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Functions fnc = new Functions();

		System.out.println("Enter String: ");
		String str = input.nextLine();

		System.out.println(fnc.expand(str));


	}
}