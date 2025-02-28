import java.util.*;

class Functions{
    
    public int factorial(int a){
        if(a<=1) return 1;
        return (a * factorial(a-1));
    }
    
}

public class Generate_Strong_Number
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    Functions fnc = new Functions();
	    
	    System.out.print("Enter Range to print Strong Numbers from 1: ");
	    int val = input.nextInt(), strong, temp;
	    
	    for(int i=1;i<=val;i++){
	        temp = i; strong = 0;
	        
	        while(temp>0){
	            strong += fnc.factorial(temp%10);
	            temp/=10;
	        }
	        if(i == strong) System.out.println(i);
	    }
	}
}