import java.util.*;

public class Find_Sum_Until_Num_Becomes_A_Digit
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		
		int digit = find_single_digit_sum(a);
		
		System.out.println(digit);
	}
	
	static int find_single_digit_sum(int a){
	    
	    int temp = a, sum = 0;
	    while(temp>0){
	        sum += (temp%10);
	        temp/=10;
	    }
	    if(sum>9) return find_single_digit_sum(sum);
	    return sum;
	}
}