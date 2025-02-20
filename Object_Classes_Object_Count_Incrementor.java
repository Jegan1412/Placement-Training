import java.util.*;

public class Object_Classes_Object_Count_Incrementor
{
	public static void main(String[] args) {
		
	    Obj car = new Obj(), rocket = new Obj();
	}
}

class Obj{
    static int count=0;
    Obj(){
        count++;
        System.out.println("Object Created! Current Count: "+count);
    }
}
