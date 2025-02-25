import java.util.*;

interface A{
    void dis();
    static void disp(){
        System.out.println("disp");
    }
}

class B implements A{
    public void dis(){
        System.out.println("dis");
    }
}

public class Interface_2
{
	public static void main(String[] args) {
	    
	    B b = new B();
	    b.dis();
	    A.disp();
	}
}