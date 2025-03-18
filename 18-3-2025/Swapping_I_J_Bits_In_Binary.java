import java.util.*;

class Functions{
    
    Scanner input = new Scanner(System.in);
    
    public void swapping_bits(){
        
        System.out.println("Enter Number: ");
        int n = input.nextInt();
        System.out.println("Enter positions to Swap(i, j) from 1 - 32: ");
        int i = input.nextInt()-1, j = input.nextInt()-1;
        String binary = String.format("%32s", Integer.toBinaryString(n)).replaceAll(" ", "0");
        StringBuilder val = new StringBuilder(binary);
        val.replace(i, i+1,binary.substring(j,j+1));
        val.replace(j, j+1,binary.substring(i,i+1));
        System.out.println(val);
        int num=Integer.parseInt(val.toString(),2);
        System.out.println(num);
    }
}

public class Swapping_I_J_Bits_In_Binary
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    Functions fnc = new Functions();
	    
	    fnc.swapping_bits();
	}
}