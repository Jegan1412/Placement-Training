import java.util.*;

class A {
    public int calculate(int a){
        if(a == 1 || a==0) return 1;
        return a*calculate(a-1);
    }
    public int calculate(float a){
        if(a<=1) return (int)a;
        return calculate((float)a-1)+calculate((float)a-2);
    }
    public int calculate(double a){
        boolean c_prime=true;
        for(int i=2;i<a;i++){
            if(a%i==0){
                c_prime = false;
                break;
            }
        }
        return (c_prime)?(int)a:0;
    }
}

public class Method_Overloading_Prime_Factorial_Fibonacci{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        A a1 = new A();
        System.out.print("\nEnter Range: ");
        int n = input.nextInt(), i;
        
        System.out.print("Factorial: "+a1.calculate((int)n)+"\t");
        
        System.out.print("\nFibonacci: ");
        for(i=0;i<n;i++){
            System.out.print(a1.calculate((float)i)+"\t");
        }
        
        System.out.print("\nPrime: ");
        for(i=2;i<=n;i++){
            int p = a1.calculate((double)i);
            if(p!=0) System.out.print(p+"\t");
            
        }
    }
}
