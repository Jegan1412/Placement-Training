package placementtest;

import java.util.*;

public class PatternTest3 {
    static int f1=0,f2=1,count=0;
    public static void main(String[] args){
        
        int i,j;
        
        for(i=0;i<12;i++){
            for(j=0;j<7;j++){
                if(i==0 && j==3) System.out.print(fibonacci()+" ");
                else if((j>1&&j<5) && i>0) System.out.print(fibonacci()+" ");
                else if((i==2||i==4||i==6||i==7) && (j==1||j==5)) System.out.print(fibonacci()+" ");
                else if(i==7 && (j==0||j==6)) System.out.print(fibonacci()+" ");
                else System.out.print("  ");
            }
            System.out.println("");
        }
    }
    
    static int fibonacci(){
        if(count == 0){
            count++;
            return f1;
        }
        if(count == 1){
            count++;
            return f2;
        }
        int fc = (f2+f1);
        f1 = f2;
        f2 = fc;
        return fc;
    }
}
