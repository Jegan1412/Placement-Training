import java.util.*;

class Functions {

	public String string_substring(String str, int s, int e) {
		return str.substring(s,e);
	}

	public String stringbuilder_substring(String str, int s, int e) {
	    StringBuilder sbl = new StringBuilder(str);
		return sbl.substring(s,e);

	}

	public String stringbuffer_substring(String str, int s, int e) {
		StringBuffer sbf = new StringBuffer(str);
		return sbf.substring(s,e);
	}
}

public class Substring
{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Functions fnc = new Functions();

		System.out.println("Enter String: ");
		String str = input.nextLine();

		System.out.println("Enter Starting & Ending Index: ");
		int s = input.nextInt(), e = input.nextInt();

		System.out.println("Substring : "+fnc.string_substring(str,s,e));

		System.out.println("Substring : "+fnc.stringbuilder_substring(str,s,e));

		System.out.println("Substring : "+fnc.stringbuffer_substring(str,s,e));


	}
}