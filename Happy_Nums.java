import java.util.*;

public class Happy_Nums
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		
		System.out.println(happy_nums(a));
	}
	
	static int happy_nums(int a){
	    
	    HashSet<Integer> found= new HashSet<Integer>(); 
	    int sum=0, temp=a, count=-1;
	    boolean happy = true;
	    while(temp>0){
	        sum = sum + (int)Math.pow((temp%10),2);
	        temp/=10;
	        if(temp==0){
	            count++;
	            if(sum == 1){
	                return count+1;
	            }
	            if(found.contains(sum)){
	                break;
	            } 
	            temp = sum;
	            found.add(sum);
	            sum=0;
	        }
	    }
	    return -1;
	}
}