import java.util.*;

class Functions {
    
    public String trim_middle(String str){
        str=str.trim();
        String res="";
        boolean space = false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' ' && space==false){
                res = res+str.charAt(i);
                space=true;
            }
            else if(str.charAt(i) != ' '){
                res = res+str.charAt(i);
                space=false;
            }
        }
        return res;
    }
    
    public String string_reverse(String str){
        str = trim_middle(str);
        String space=" ", res="";
        String s_arr[] = str.split(space);
        for(int i=s_arr.length-1;i>=0;i--) res += s_arr[i]+' ';
        return res.trim();
    }
	
}

public class String_Trim_Reverse
{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Functions fnc = new Functions();

		System.out.println("Enter String: ");
		String str = input.nextLine();

		System.out.println("Trimmed Sting: "+ fnc.trim_middle(str));
		System.out.println(fnc.string_reverse(str));


	}
}