import java.util.*;

public class Odd_Even_Prime_Nums_as_Integer_Rev_Integer_Check_Amstrong
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    
	    int a=input.nextInt();
	    
	    //Even_Num & Odd_Num & Prime_Num
	    int temp=a,e_sum=0,o_sum=0,p_sum=0;
	    while(temp>0){
	        int digit = temp%10;
	        temp/=10;
	        if(digit%2==0) e_sum=(e_sum*10)+digit;
	        
	        else if(digit%2==1) o_sum=(o_sum*10)+digit;
	        
	        if(digit==1) continue;
	        Boolean prime=Check_Prime(digit);
	        if(prime) p_sum=(p_sum*10)+digit;
	    }
	    System.out.println("\nEven Nums: "+e_sum+" Amstrong Status: "+Check_Amstrong(e_sum)+"\nOdd Nums: "+o_sum+" Amstrong Status: "+Check_Amstrong(o_sum)+"\nPrime Nums: "+p_sum+" Amstrong Status: "+Check_Amstrong(p_sum));

        //Even_Num & Odd_Num & Prime_Num and Its Reverses
	    int r_e_sum=Rev_num(e_sum),r_o_sum=Rev_num(o_sum),r_p_sum=Rev_num(p_sum);
	    System.out.println("\nEven Nums: "+r_e_sum+" Amstrong Status: "+Check_Amstrong(r_e_sum)+"\nOdd Nums: "+r_o_sum+" Amstrong Status: "+Check_Amstrong(r_o_sum)+"\nPrime Nums: "+r_p_sum+" Amstrong Status: "+Check_Amstrong(r_p_sum));
	    
	    
    }
    static int Rev_num(int val){
	        int res=0;
	        while(val>0){
	            res = (res*10) + (val%10);
	            val/=10;
	        }
	        return res;
	}
	
	static Boolean Check_Prime(int val){
	    Boolean prime = true;
	    for(int i=2;i<val;i++) if(val%i==0 && prime) prime=false;
	    return prime;
	}
	
	static Boolean Check_Amstrong(int val){
	    Boolean amstrong=false;
	    int temp=val,ams_sum=0;
	    while(temp>0){
	        ams_sum += Math.pow((temp%10),3);
	        temp/=10;
	    }
	    if(val==ams_sum) amstrong=true;
	    
	    return amstrong;
	}
}