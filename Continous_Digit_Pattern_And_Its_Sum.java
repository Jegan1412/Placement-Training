import java.util.*;

public class Continous_Digit_Pattern_And_Its_Sum
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    int val = input.nextInt();
	    int n = input.nextInt();
	    int sum=0,digit=val;
		
		for(int i=0;i<n;i++){
		    System.out.print(val+"\t");
		    sum+=val;
		    val = (val*10) + digit;
		}
		
		System.out.println("\n"+sum);
		
	}
}