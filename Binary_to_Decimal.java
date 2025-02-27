import java.util.*;

class Num_Conversion{
    public int binary_to_decimal(int a){
        int count=0,num=0;
        while(a>0){
            num += ((a%10)*(int)Math.pow(2,count));
            a/=10;
            count++;
        }
        return num;
    }
}


public class Binary_to_Decimal
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    Num_Conversion nc = new Num_Conversion();
	    
	    int bin = input.nextInt();
	    System.out.print(nc.binary_to_decimal(bin));
	}
}