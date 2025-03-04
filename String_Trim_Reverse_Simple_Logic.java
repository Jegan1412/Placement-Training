import java.util.*;

class Functions {
    public String string_reverse(String str){
        String space=" ", res="", s_arr[] = str.split(space);
        for(int i=s_arr.length-1;i>=0;i--){
            res = res.trim();
            res += ' '+s_arr[i];
        } 
        return res.trim();
    }
}

public class String_Trim_Reverse_Simple_Logic
{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Functions fnc = new Functions();

		System.out.println("Enter String: ");
		String str = input.nextLine();

		System.out.println("Trimmed Reverse String: "+fnc.string_reverse(str));
	}
}