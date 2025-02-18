import java .util.*;

public class Generate_Min_Num_From_Array
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    
	    int n = input.nextInt();
	    int a[] = new int[n];
	    int i;
	    for(i=0;i<n;i++){
	        a[i] = input.nextInt();
	    }
	    String nums[] = sort_nums(a, n);
	    int max = max_num(nums, n);
	    System.out.println(max);
	}
	
	static String[] sort_nums(int a[], int n){
	    String nums[] = new String[n];
	    Arrays.sort(a);
	    for(int i=0;i<n;i++) nums[i] = Integer.toString(a[i]);

	    for(int i=0;i<n;i++){
	        for(int j=0;j<n-i;j++){
	            if(j==n-1) continue;
	            char numj[] = nums[j].toCharArray(), numj1[] = nums[j+1].toCharArray();
	            if(numj[0]>numj1[0]){
	                String temp = nums[j+1];
	                nums[j+1] = nums[j];
	                nums[j] = temp;
	            }
	        }
	    }
	    
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n-i;j++){
	            if(j==n-1) continue;
	            char numj[] = nums[j].toCharArray(), numj1[] = nums[j+1].toCharArray();
	            int lj = numj.length, lj1 = numj1.length;
	            if(numj[0]==numj1[0] && lj<lj1){
	                String temp = nums[j+1];
	                nums[j+1] = nums[j];
	                nums[j] = temp;
	            }
	        }
	    }
	    return nums;
	}
	
	static int max_num(String nums[], int n){
	    
	    int number[] = new int[n], len;
	    int sum=0;
	    
	    for(int i=0;i<n;i++){
	        number[i] = Integer.valueOf(nums[i]);
	        len = nums[i].length();
	        sum = (int)(sum*(Math.pow(10,len))) + number[i];
	    }
	    return sum;
	}
}