import java.util.*;

public class Alphabets
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    
	    /*String name = input.nextLine();
	    int len = name.length();*/
	    int n=5;
	    
	    
	    /*switch(){
	        
	        case 'A':
	        case 'a':
	            for(int i=0;i<5;i++){
	                for(int j=0;j<5;j++){
	                    if((i!=0&&(j==0 || j==4)) || ((i==0||i==2)&&(j>0 && j<4))) System.out.print("*");
	                    else System.out.print(" ");
	            
	                }
	                System.out.println("");
	            }
	            break;
	            
	       case 'B':
	       case 'b':
	            for(int i=0;i<5;i++){
	                for(int j=0;j<5;j++){
	                    if(j==0 || ((i==0||i==2||i==4) && (j>0&&j<4)) || ((i==1||i==3) && (j==4))) System.out.print("*");
	                    else System.out.print(" ");
	            
	                }
	                System.out.println("");
	            }
	            break;
	            
	       case 'C':
	       case 'c':
	            for(int i=0;i<5;i++){
	                for(int j=0;j<5;j++){
	                    if((i==0||i==4)&&(j>0&&j<5) || (j==0 && (i!=0&&i!=4))) System.out.print("*");
	                    else System.out.print(" ");
	            
	                }
	                System.out.println("");
	            }
	            break;
	            
	       case 'D':
	       case 'd':
	            for(int i=0;i<5;i++){
	                for(int j=0;j<5;j++){
	                    if(j==0|| ((j>0&&j<3)&&(i==0||i==4)) || (j==3&&(i==1||i==3)) || (j==4&&i==2)) System.out.print("*");
	                    else System.out.print(" ");
	            
	                }
	                System.out.println("");
	            }
	            break;
	       
	       case 'E':
	       case 'e':
	            for(int i=0;i<5;i++){
	                for(int j=0;j<5;j++){
	                    if(i==0||i==2||i==4||j==0) System.out.print("*");
	                    else System.out.print(" ");
	            
	                }
	                System.out.println("");
	            }
	            break;
	            
	       case 'F':
	       case 'f':
	            for(int i=0;i<5;i++){
	                for(int j=0;j<5;j++){
	                    if(i==0||i==2||j==0) System.out.print("*");
	                    else System.out.print(" ");
	            
	                }
	                System.out.println("");
	            }
	            break;
	           
	        
	    }*/
	    
	    for(int i=0;i<5;i++){
	        for(int j=0;j<5;j++){
	            if(j==0) System.out.print("*");
	            else System.out.print(" ");
	            
	        }
	        System.out.println("");
	    }
	    
	}
}