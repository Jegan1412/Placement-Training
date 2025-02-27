import java.util.*;

public class Generate_Automorphic_Nums
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("Enter Range to Print Automorph From 1: ");
	    int range = input.nextInt(), i,j;
	    long n, n_s, temp, temp_s, count;
	    for(i=1;i<=range;i++){
	        
	        n = (long)i; n_s = n*n;
	        temp = n; temp_s = n_s; count=0;
	    
	        while(temp>0){
	            count++;
	            temp/=10;
	        }
	        if((n_s%(Math.pow(10,count))) == n) System.out.println(n);
	    }
	}
}