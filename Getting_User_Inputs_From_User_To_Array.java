import java.util.*;

public class Getting_User_Inputs_From_User_To_Array
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(), i_arr[] = new int[n], i,j;
		float f_arr[] = new float[n];
		double d_arr[] = new double[n];
		char c_arr[] = new char[n];
		
		for(i=0;i<n;i++){
		    System.out.print("\nEnter Integer, Float, Double, Character : ");
		    i_arr[i] = input.nextInt();
		    f_arr[i] = input.nextFloat();
		    d_arr[i] = input.nextDouble();
		    c_arr[i] = input.next().charAt(0);
		}
		
		for(i=0;i<n;i++){
		    System.out.print("\ni_arr["+i+"] = "+i_arr[i]);
		    System.out.print("\nf_arr["+i+"] = "+f_arr[i]);
		    System.out.print("\nd_arr["+i+"] = "+d_arr[i]);
		    System.out.print("\nc_arr["+i+"] = "+c_arr[i]);
		    System.out.println("");
		}
	}
	
}