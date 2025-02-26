import java.util.*;

public class Object_Classes
{
	public static void main(String[] args) {
	    
	    Info n = new Info();
	    Scanner input = new Scanner(System.in);
	    ArrayList<String> details_name = new ArrayList<>();
	    ArrayList<Long> details_reg_no = new ArrayList<>();
	    int no = input.nextInt();
	    int i;
	    for(i=0;i<no;i++){
	        n.info();
	        details_name.add(n.name);
	        details_reg_no.add(n.reg_no);
	    }
	    
	    for(i=0;i<no;i++){
	        System.out.print(details_name.get(i)+" "+details_reg_no.get(i)+"\n");
	    }
	}
}

class Info{
    
    String name;
    long reg_no;
    
    void info(){
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        reg_no = input.nextLong();
    }
    
    
}