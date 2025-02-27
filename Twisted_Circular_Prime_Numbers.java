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
    
    public int rotate(int a){
        int count = find_length(a);
        int temp = a%((int)Math.pow(10,count-1));
        temp = (temp*10)+(a/((int)Math.pow(10,count-1)));
        return temp;
    }
    
    public int find_length(int a){
        int count=0;
        while(a>0){
            count++;
            a/=10;
        }
        return count;
    }
}

public class Twisted_Circular_Prime_Numbers{
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        Functions fnc = new Functions();
        
        System.out.print("Enter Range to Print Twisted Primes from 1: ");
        int n = input.nextInt(),val, r_val, val_length;
        boolean all;
        
        for(int i=2;i<=n;i++){
            if(i==101) continue;
            val = i; val_length = fnc.find_length(val);
            all = true;
            
            while(val_length-1>=0){
                if(fnc.check_prime(val)){
                    r_val = fnc.rev_num(val);
                    if(fnc.check_prime(r_val)) val = fnc.rotate(val);
                    else{
                        all = false;
                        break;
                    }
                }
                else{
                    all = false;
                    break;
                }
                val_length--;
            }
            if(all) System.out.println(i+" : Both Circular & Twisted Prime Number");
        }
    }
}