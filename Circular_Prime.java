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

public class Circular_Prime{
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        Functions fnc = new Functions();
        
        int n = input.nextInt(), n_len = fnc.find_length(n), i;
        boolean all = true;
        
        while(n_len-1>=0){
            System.out.println(n+((fnc.check_prime(n))?": Prime":": Not Prime"));
            if(fnc.check_prime(n)){
                n = fnc.rotate(n);
            }
            else{
                all = false;
                break;
            }
            n_len--;
        }
        
        System.out.println((all)? "All Rotations are Prime":"Not All Rotations are Prime");
    }
}
