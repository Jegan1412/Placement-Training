import java.util.*;

interface SBI{
    void test();
}

interface Indian{
    void test();
}

interface CUB{
    void test();
}

class RBI implements SBI,Indian,CUB{
    public void test(){
	        System.out.println("RBI");
	    }
}


public class Interface_1 
{
	public static void main(String[] args) {
	    
	    RBI rbi = new RBI();
	    
	    rbi.test();
	}
}