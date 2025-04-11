import java.util.*;

class Functions{
	Scanner input = new Scanner(System.in);
	public void odd_even(){
		int n = input.nextInt(), m=1;
		System.out.println((((n&m)==1)?"Odd":"Even"));
	}
	
	public void swapping_nums(){
		int a=input.nextInt(), b=input.nextInt();
		System.out.println("Before Swapping:\t"+"A = "+a+" B = "+b);
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("After Swapping:\t"+"A = "+a+" B = "+b);
	}
	
	public void odd_even_using_shift(){
		int a=input.nextInt(), m=a>>1;
		System.out.println(((a == m<<1)? "Even":"Odd"));
	}
}

public class Basic_Programs{
	public static void main(String args[]){
		
		//Scanner input = new Scanner(System.in);
		Functions fnc = new Functions();
		
		//fnc.odd_even();
		//fnc.swapping_nums();
		fnc.odd_even_using_shift();
		
		
	}
}