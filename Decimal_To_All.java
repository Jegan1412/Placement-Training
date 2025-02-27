import java.util.*;

class Num_Conversion{
    public int decimal_to_binary(int a){
        int temp=a,bi=1, count=0;
        while(temp>=1){
            bi = (bi*10)+(temp%2);
            count++;
            temp/=2;
        }
        return num_rev(bi, count);
    }
    
    public int decimal_to_octal(int a){
        int temp=a,oc=8, count=0;
        while(temp>=1){
            oc = (oc*10)+(temp%8);
            count++;
            temp/=8;
        }
        return num_rev(oc, count);
    }
    
    public String decimal_to_hexa(int a){
        int temp=a,digit=0;
        String hx="";
        while(temp>=1){
            digit = temp%16;
            switch(digit){
                case 10:
                    hx+='A';
                    break;
                case 11:
                    hx+='B';
                    break;
                case 12:
                    hx+='C';
                    break;
                case 13:
                    hx+='D';
                    break;
                case 14:
                    hx+='E';
                    break;
                case 15:
                    hx+='F';
                    break;
                default:
                    hx+=(char)(digit+'0');
                    break;
            }
            temp/=16;
        }
        StringBuffer rhx = new StringBuffer(hx);
        rhx.reverse();
        return rhx.toString();
    }
    
    public int num_rev(int a, int count){
        int num = 0;
        while(count>0){
            num = (num*10)+(a%10);
            a/=10;
            count--;
        }
        return num;
    }
}



public class Decimal_To_All
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    Num_Conversion nc = new Num_Conversion();
	    
	    System.out.print("Decimal: ");
	    int n = input.nextInt();
	    System.out.println("Binary: "+nc.decimal_to_binary(n));
	    System.out.println("Octal: "+nc.decimal_to_octal(n));
	    System.out.println("HexaDecimal: "+nc.decimal_to_hexa(n));
	}
}