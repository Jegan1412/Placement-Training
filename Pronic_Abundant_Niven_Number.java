import java.util.*;

class Functions{
    
    public boolean pronic_num(int a){
        boolean pronic = false;
        for(int i=1;i<a-1;i++){
            if(i*(i+1) == a){
                pronic = true;
            }
        }
        return pronic;
    }
    
    public boolean abundant_num(int a){
        boolean abundant = false;
        int factor_sum=0;
        for(int i=1;i<a;i++){
            if(a%i==0){
                factor_sum+=i;
                if(factor_sum>a){
                    abundant = true;
                    break;
                }
            }
        }
        return abundant;
    }
    
    public boolean niven_num(int a){
        int sum=0, temp=a;
        boolean niven = false;
        while(a>0){
            sum+=(a%10);
            a/=10;
        }
        if(temp%sum==0) niven=true;
        return niven;
    }
}

public class Pronic_Abundant_Niven_Number
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    Functions fnc = new Functions();
	    
	    System.out.print("Enter Number to Check Pronic, Abundant, Niven: ");
	    int val = input.nextInt();
	    
	    System.out.println(val+" is "+((fnc.pronic_num(val)?"Pronic ":""))+
	    ((fnc.abundant_num(val)?"Abundant ":""))+((fnc.niven_num(val)?"Niven":"")));
	    
	}
}