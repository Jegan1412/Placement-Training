import java.util.*;

class Functions{
    public int digit_sum(int a){
        int sum=0;
        while(a>0){
            sum+=(a%10);
            a/=10;
        }
        return sum;
    }
}

public class Generate_Harshad_Number
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    Functions fnc = new Functions();
	    
	    System.out.print("Enter Range (Start, End): ");
	    int s = input.nextInt(), e = input.nextInt();
	    
	    for(int i=s;i<=e;i++){
	        if(i%fnc.digit_sum(i)==0) System.out.println(i);
	    }
	}
}