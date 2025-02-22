package placementtest;

import java.util.*;

public class PatternTest2 {
    static int prime=2;
    public static void main(String[] args){
        
        int i,j;
        
        for(i=0;i<12;i++){
            for(j=0;j<7;j++){
                if(i==0 && j==3) System.out.print(prime_no()+" ");
                else if((j>1&&j<5) && i>0) System.out.print(prime_no()+" ");
                else if((i==2||i==4||i==6||i==7) && (j==1||j==5)) System.out.print(prime_no()+" ");
                else if(i==7 && (j==0||j==6)) System.out.print(prime_no()+" ");
                else System.out.print("  ");
            }
            System.out.println("");
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
