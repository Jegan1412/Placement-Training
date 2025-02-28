import java.util.*;

class Functions{
    
    public int factorial(int a){
        if(a<=1) return 1;
        return (a * factorial(a-1));
    }
    
}

public class Strong_Number
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    Functions fnc = new Functions();
	    
	    int val = input.nextInt(), strong = 0, temp = val;
	    
	    while(temp>0){
	        strong += fnc.factorial(temp%10);
	        temp/=10;
	    }
	    
	    System.out.println(((val == strong)?(val+" : Strong Number"):
	    (val+" : Not Strong Number")));
	    
	    
	}
}