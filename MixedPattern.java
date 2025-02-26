import java.util.*;

class Prime_no{
    static int prime = 2;
    private int i,temp;
    private boolean c_prime;
    
    public int n_prime(){
        c_prime = true;
        for(i=2;i<prime;i++){
            if(prime%i == 0){
                c_prime = false;
                break;
            }
        }
        if(c_prime) temp = prime;
        prime++;
        return (c_prime) ? temp : n_prime();
    }
}

public class MixedPattern
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    
	    int n,i,j, end, start,temp;
	    
	    Prime_no p_no = new Prime_no();
	    
	    n = input.nextInt();
	    end = n;start=1;
	    
	    System.out.print("\n");
	    
	    for(i=0;i<n;i++){
	        for(j=0;j<n;j++){
	            
	            if(i==j)
	                System.out.print((i<(n/2))?(end--)+" ":(end++)+" ");
	            else if(j==(n-1)-i)
	                System.out.print((i<(n/2))?(start++)+" ":((start--)-1)+" ");
	            else if(((i==0 || i==n-1) && j==(n/2)) || 
	            ((j==0 || j==n-1) && i==(n/2))){
	                System.out.print(p_no.n_prime()+" ");
	            }
	            else System.out.print("  ");
	        }
	        System.out.print("\n");
	    }
	}
}