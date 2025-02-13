import java.util.*;

public class Odd_Even_Prime_Sum_of_Integer
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    
	    int a=input.nextInt();
	    
	    //Even Sum & Odd_sum & Prime_sum
	    int temp=a,e_sum=0,o_sum=0,p_sum=0;
	    while(temp>0){
	        int digit = temp%10;
	        temp/=10;
	        if(digit%2==0) e_sum+=digit;
	        
	        else if(digit%2==1) o_sum+=digit;
	        
	        if(digit==1) continue;
	        Boolean prime=true;
	        for(int i=2;i<digit;i++) if(digit%i==0 && prime) prime=false;
	        if(prime) p_sum+=digit;
	    }
	    System.out.println("Even Sum: "+e_sum+"\nOdd Sum: "+o_sum+"\nPrime Sum: "+p_sum);
    }
}