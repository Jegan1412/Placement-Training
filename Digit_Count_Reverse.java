import java.util.*;

public class Digit_Count_Reverse
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    
	    int a=input.nextInt();
	    
	    int temp=a,digits=0,rev=0;
	    while(temp>0){
	        digits++;
	        rev = (rev*10)+ (temp%10);
	        temp /= 10;
	    }
	    System.out.println(digits+"\n"+a+"\n"+rev);
	}
}
