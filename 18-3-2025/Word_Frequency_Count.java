import java.util.*;

class Functions{
    
    Scanner input = new Scanner(System.in);
    
    public void word_frequency(){
        
        System.out.println("Enter String to Count: ");
        String str = input.nextLine();
        str = str.trim();
        String conditions = "[,\\s\\.]", s_arr[] = str.split(conditions);
        int n = s_arr.length, count=1;
        boolean freq_stats[] = new boolean[n];
        System.out.println("Frequencies of the Words: ");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(s_arr[i].equals(s_arr[j]) && freq_stats[i]==false){
                    count++;
                    freq_stats[j] = true;
                } 
            }
            if(freq_stats[i] == false) System.out.println(s_arr[i]+ " : "+count);
            count=1;
        }
    }
}

public class Word_Frequency_Count
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    Functions fnc = new Functions();
	    
	    fnc.word_frequency();
	}
}