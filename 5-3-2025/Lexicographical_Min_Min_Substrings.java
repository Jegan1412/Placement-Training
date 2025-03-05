import java.util.*;

class Functions{
    
    public void min_ops(String str, int len){
		str = str.toLowerCase();
        char s[] = str.toCharArray();
        int n=s.length,min_ind=0,max_ind=0;
        for(int i=0;i<(n-len+1);i++){
            if(s[min_ind]>s[i]) min_ind=i;
            if(s[max_ind]<s[i]) max_ind=i;
        }
        System.out.println("Smallest Lexicographical Substring: "+str.substring(min_ind,(min_ind+len))+
        "\tLargest Lexicographical Substring:"+str.substring(max_ind,(max_ind+len)));
    }
}

public class Lexicographical_Min_Min_Substrings
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    Functions fnc = new Functions();
	    
	    String str = input.nextLine();
	    int len = input.nextInt();
	    
	    fnc.min_ops(str, len);
	}
}