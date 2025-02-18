import java .util.*;

public class Subset_Matching
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    
	    String a = input.nextLine(), b = input.nextLine();
	    
	    char ac[] = a.toCharArray(), bc[] = b.toCharArray();
	    int an = ac.length, bn = bc.length;
	    int i,j,count=0;
	    
	    if(an<bn) System.out.println("Subset Length Exceeds Original String!!");
	    else{
	        boolean ss = false;
	        for(i=0;i<=(an-bn);i++){
	            count=0;
	            for(j=0;j<bn;j++) if(ac[i+j] == bc[j]) count++;
	            if(count == bn){
	                ss = true;
	                System.out.println("Subset is found in String at Index : "+i);
	                break;
	            }
	        }
	    }
	}
}