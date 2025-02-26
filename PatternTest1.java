public class PatternTest1 {
    
    public static void main(String[] args){
        
        int i,j;
        
        for(i=0;i<12;i++){
            for(j=0;j<7;j++){
                if(i==0 && j==3) System.out.print("* ");
                else if((j>1&&j<5) && i>0) System.out.print("* ");
                else if((i==2||i==4||i==6||i==7) && (j==1||j==5)) System.out.print("* ");
                else if(i==7 && (j==0||j==6)) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println("");
        }
    }
}
