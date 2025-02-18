import java .util.*;

public class Add_Array_Num_In_Reverse
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    
	    int a[] = {5,1,3,7}, b[] = {9,7,7,7};
	    String res = "";
	    int an = a.length, bn = b.length,carry = 0;
	    int i=0,j=0;
	    
	    while(i<an || j<bn || carry>0){
	        if(i<an){
	            carry+=a[i];
	            i++;
	        }
	        if(j<bn){
	            carry+=b[j];
	            j++;
	        }
	        
	        res+=(char)((carry%10)+'0');
	        carry/=10;
	    }
	    
	    char res_arr[] = res.toCharArray();
	    for(i=0;i<res_arr.length;i++)   System.out.print(res_arr[i]+"\t");
	}
}