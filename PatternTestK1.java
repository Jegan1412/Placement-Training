import java.util.*;

public class PatternTestK1 {
    
    static int prime=2;
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt(),i,j;
        
        System.out.println("");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==0||i==n-1) System.out.print("* ");
                else if(j==0||j==n-1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        for(i=1;i<(n*2);i++){
            if(i%2==1){
                for(j=0;j<(n*2)-1-i;j++) System.out.print(" ");
                for(j=0;j<i;j++){
                    System.out.print(prime_no()+" ");
                }
            }
            System.out.println();
        }
        for(i=(n*2)-2;i>0;i--){
            if(i%2==1){
                for(j=0;j<(n*2)-i;j++) System.out.print(" ");
                for(j=0;j<i;j++){
                    System.out.print(prime_no()+" ");
                }
            }
            System.out.println();
        }
        
    }
    
    static int prime_no(){
        int i;
        boolean stat = true;
        for(i=2;i<prime;i++){
            if(prime%i==0){
                stat = false;
                break;
            }
        }
        prime++;
        return (stat==true) ? (prime-1): prime_no();
    }
}
