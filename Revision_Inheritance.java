import java.util.*;

interface Int1{
    static void print_a(){
        System.out.println("A");
    }
    default void print_b(){
        System.out.println("B");
    }
    void print_c();
}

interface Int2 extends Int1{
    static void print_a(){
        System.out.println("A1");
    }
    default void print_b(){
        System.out.println("B1");
    }
    void print_c();
}

class Cls1 implements Int1,Int2{
    public void print_c(){
        System.out.println("C");
    }
    public void display(){
        Int1.print_a();
        Int2.print_a();
        print_b();
        print_c();
    }
}

abstract class Cls2{
    int a =10;
    static{
        System.out.println("Static Block: Cls2");
    }
}

class Cls3 extends Cls2{
    Cls3(){
        System.out.println("Cls3");
    }
    abstract class Cls4{
        static void disp(){
            System.out.println("Cls4");
        }
    }
}

abstract class Cls5{
    static void non_abs_cls5(){
        System.out.println("Non-Abs: Cls5");
    }
    abstract void abs_cls5();
    abstract class Cls6{
        static void non_abs_cls6(){
            System.out.println("Non-Abs: Cls6");
        }
        abstract void abs_cls6();
    }
    class Cls7 extends Cls6{
        public void abs_cls6(){
            System.out.println("Abs: Cls6 in Cls7 in Cls8");
        }
    }
}

class Cls8 extends Cls5{
    public void abs_cls5(){
        System.out.println("Abs: Cls5 in Cls8");
    }
}

public class Revision_Inheritance
{
	public static void main(String[] args) {
	    
	    Cls1 cls1 = new Cls1();
	    cls1.display();
	    
	    Cls3 cls3 = new Cls3();
	    Cls3.Cls4.disp();
	    
	    Cls5.non_abs_cls5();
	    
	    Cls5.Cls6.non_abs_cls6();
	    
	    Cls8 cls8 = new Cls8();
	    cls8.abs_cls5();
	    
	    Cls8.Cls7 cls7 = cls8.new Cls7();
	    cls7.abs_cls6();
	}
}