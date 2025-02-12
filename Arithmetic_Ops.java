import java.util.*;

public class Arithmetic_Ops
{
	public static void main(String[] args) {
	    
		Scanner input = new Scanner(System.in);
		byte a=64,b=2;
		byte add=(byte)(a+b), sub=(byte)(a-b), mul=(byte)(a*b), div=(byte)(a/b), mod=(byte)(a%b);
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(mod);
	}
}