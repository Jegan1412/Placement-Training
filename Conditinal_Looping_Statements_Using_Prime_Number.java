import java.util.*;

public class Conditinal_Looping_Statements_Using_Prime_Number
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    
	    int n = input.nextInt();
	    System.out.println("Enter Option to Validate:\n1-Check Prime Number\n2-Generate Prime Number While Loop\n3-Generate Prime Number Do While Loop\t\n");
	    int option = input.nextInt();
	    System.out.println("\n");
	    
	    switch(option){
	        case 1:
	           if(n==1){
	                System.out.println(n+" isn't Prime Number");
	                break;
	           }
	           Boolean prime = true;
	           for(int i=2;i<n;i++){
	               if(n%i==0){
	                   prime = false;
	                   break;
	               }
	           }
	           if(prime)
	               System.out.println(n+" is Prime Number");
	           else
	               System.out.println(n+" isn't Prime Number");
	           break;
	            
	       case 2:
	           if(n==1){
	                System.out.println("There is No Prime Numbers within "+n);
	                break;
	           }
	           int i=2;
	           while(i<=n){
	               int j=2;
	               prime = true;
	               while(j<i){
	                   if(i%j==0)
	                        prime = false;
	                   j++;
	               }
	               if(prime)
	                    System.out.print(i+"\t");
	               i++;
	           }
	           break;
	       
	       case 3:
	           if(n==1){
	                System.out.println("There is No Prime Numbers within "+n);
	                break;
	           }
	           i=2;
	           do{
	               int j=2;
	               prime = true;
	               while(j<i){
	                   if(i%j==0)
	                        prime = false;
	                   j++;
	               }
	               if(prime)
	                    System.out.print(i+"\t");
	               i++;
	           }while(i<=n);
	    }
    }
}
