import java.util.*;

class Functions{
    
    Scanner input = new Scanner(System.in);
    
    public void bubble_sort(){
        
        System.out.print("Enter no.of elements in Array: ");
	    int n = input.nextInt(), arr[] = new int[n], i, j, temp=0;
	    System.out.println("Enter "+n+" Array elements: ");
	    for(i=0;i<n;i++) arr[i] = input.nextInt();
        for(i=0;i<n;i++){
            for(j=1;j<n-i;j++){
                if(arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                } 
            }
        }
        System.out.println("Sorted Array: ");
        for(i=0;i<n;i++){
	        System.out.print(arr[i]+" ");
	    }
    }        
}

public class Bubble_Sort
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    Functions fnc = new Functions();
	    
	    fnc.bubble_sort();
	}
}