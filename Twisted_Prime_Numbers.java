import java.util.*;

class Functions{
    public boolean check_prime(int a){
        boolean c_prime = true;
        for(int i=2;i<Math.sqrt(a);i++){
            if(a%i==0){
                c_prime=false;
                break;
            }
        }
        return c_prime;
    }
    
    public int rev_num(int a){
        int num=0;
        while(a>0){
            num = (num*10) + (a%10);
            a/=10;
        }
        return num;
    }
}

public class Twisted_Prime_Numbers{
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        Functions fnc = new Functions();
        
        System.out.print("Enter Range to Print Twisted Primes from 1: ");
        int n = input.nextInt(),val, r_val;
        
        for(int i=0;i<n;i++){
            val = i; r_val = fnc.rev_num(i);
            if((fnc.check_prime(val)&&fnc.check_prime(r_val))) System.out.println(i);
        }
    }
}