import java.util.*;

public class Automorphic_Num
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    
	    int n = input.nextInt(), n_s = n*n;
	    int temp = n, temp_s = n_s, count=0;
	    
	    while(temp>0){
	        count++;
	        temp/=10;
	    }
	    if(n_s%(Math.pow(10,count)) == n) System.out.println("Automorph");
	    else System.out.println("Non Automorph");
	}
}